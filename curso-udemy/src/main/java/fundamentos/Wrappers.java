package Fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        // passando para int
        i = Integer.parseInt(entrada.next());

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.23F;

        Double d = 123.42;

        // boolean bo = Boolean.parseBoolean("true"); ESTA PASSANDO UMA STRING PARA UM TIPO PRIMITIVO

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';

        System.out.println(c + "...");
    }
}
