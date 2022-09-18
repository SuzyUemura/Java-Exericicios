package Fundamentos;

import java.util.Scanner;

public class DesafioSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salario 1': ");
        String valor1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu salario 2: ");
        String valor2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu salario 3: ");
        String valor3 = entrada.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A sua média salarial é: R$ " + media);

        entrada.close();
    }
}
