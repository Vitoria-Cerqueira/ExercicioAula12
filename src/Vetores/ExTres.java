package Vetores;

import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        Scanner numInt = new Scanner(System.in);

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Informe um valor para posição " + i);
            num[i] = numInt.nextInt();

        }

        System.out.println("Numeros pares");
        for (int i = 0; i < num.length; i++) {

            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }

        }
    }
}
