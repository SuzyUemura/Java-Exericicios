package main.java.meli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteTecnico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxDigit = sc.nextInt();

        sc.close();

        List<Integer> result = calcularNumeros(maxDigit);

        if (!result.isEmpty()) {
            for (Integer r : result) {
                System.out.println(r);
            }

        } else {
//            System.out.println("nao foi encontrado nenhum numero que corresponde a logica");
            System.out.println("null");
        }
    }

    public static Integer[] buscarCasas(Integer i) {

        Integer[] casas = {
                Integer.valueOf(i.toString().substring(0, 1)),

                Integer.valueOf(i.toString().substring(1, 2)),

                Integer.valueOf(i.toString().substring(2, 3)),

                Integer.valueOf(i.toString().substring(3, 4))
        };

        return casas;
    }

    public static List<Integer> calcularNumeros(int maxDigit) {

        int init = 1000;

        int fim = 9999;

        List<Integer> list = new ArrayList<Integer>();

        for (Integer i = init; i < fim; i++) {

            Integer[] casas = buscarCasas(i);

            if ((casas[0] + casas[1] + casas[2] + casas[3]) == 21 &&
                    casas[0] <= maxDigit &&
                    casas[1] <= maxDigit &&
                    casas[2] <= maxDigit &&
                    casas[3] <= maxDigit) {

                list.add(i);
            }

        }

        return list;
    }

}

