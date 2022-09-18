package main.java.poo;

public class Veiculos {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preço;

    public Veiculos(String marca, String modelo, String plca, String cor, String km, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = plca;
        this.cor = cor;
        this.km = km;
        this.preço = preço;
    }

    public void acelerar() {
        this.velocidade += 20;
    }

    public void abastecer(int combustivel) {
        if(combustivel > 60 || getLitrosCombustivel() == 60
            || (combustivel + getLitrosCombustivel()) > 60) {
            System.out.println("Não é permitido abastecimento");
        } else {
            this.litrosCombustivel += combustivel;
        }
    }

    public void frear() {
        if(!(getVelocidade() <= 0)) {
            this.velocidade -= 20;
        } else {
            System.out.println("Veículo não pode ser freiado. Está parado!");
        }
    }

    public void pintar(String cor) {
        setCor(cor);
        System.out.println("Cor:" + getCor());
    }

    public void ligar() {
        if(!isLigado()) {
            setLigado(true);
        } else {
            System.out.println("Veículo já está ligado");
        }
    }

    public void desligar() {
        if(!isLigado() || !(getVelocidade() == 0)) {
            System.out.println("Não é possivel desligar o veículo");
        } else {
            setLigado(false);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
