package Vetores;

import java.util.Scanner;

public class ExUm {
    public static void main(String[] args) {
        Scanner valoresInt = new Scanner(System.in);

        int val[] = new int[5];

        for (int i = 0; i < val.length; i++) {

            System.out.println("Informe um valor para a posição " + i);
            val[i] = valoresInt.nextInt();

        }
        System.out.println("Valores armazenados");

        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }

        System.out.println("Soma");
        int resultado;
        resultado = val[0] + val[1] + val[2] + val[3] + val[4];
        System.out.println("O resultado da soma dos vetores é: " + resultado);

    }
}
