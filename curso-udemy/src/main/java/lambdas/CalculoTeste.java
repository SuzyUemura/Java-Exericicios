package main.java.lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
     // Polimorfismo
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(10, 8));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(9, 7));

    }
}
