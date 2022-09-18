package Fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double resultado;

        System.out.println("-------------- CALCULADORA --------------");
        System.out.println("Digite o primeiro número");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operaçãp: + - * % /");
        String operador = entrada.next();

        if(operador.equals("+")) {
            resultado = num1 + num2;
            System.out.println("Operação: Adicição " + num1 + " + " + num2 + " = " + resultado);
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Operação: Subtração " + num1 + " - " + num2 + " = " + resultado);
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
            System.out.println("Operação: Multiplicação " + num1 + " * " + num2 + " = " + resultado);
        } else  if (operador.equals("/")) {
            resultado = num1 / num2;
            System.out.println("Operação: Divisão " + num1 + " / " + num2 + " = " + resultado);
        } else if (operador.equals("%")) {
            resultado = num1 / num2;
            System.out.println("Operação: Módulo " + num1 + " % " + num2 + " = " + resultado);
        } else {
            System.out.println("Operador não reconhecido");
        }
        entrada.close();
    }
}
