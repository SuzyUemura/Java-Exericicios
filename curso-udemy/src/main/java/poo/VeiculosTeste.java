package main.java.poo;

public class VeiculosTeste {
    public static void main(String[] args) {
        Veiculos carro = new Veiculos("Fiat", "Uno", "RCF-0978", "Branco", "903940km", 12.000);

        carro.pintar("Preto");
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.abastecer(90);
        carro.ligar();
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.abastecer(20);
        carro.abastecer(41);
        System.out.println(carro.getLitrosCombustivel());
        carro.desligar();
    }
}
