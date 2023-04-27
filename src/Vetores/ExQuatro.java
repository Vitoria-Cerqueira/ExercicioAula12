package Vetores;

import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int qtaItens;

        System.out.println("Digite a quantidade de itens de compras:");
        qtaItens = valorDigitado.nextInt();
        String itens[] = new String[qtaItens];

        for (int i = 0; i < itens.length; i++) {
            System.out.println("Digite os itens de compra: ");
            itens[i] = valorDigitado.nextLine();

        }

        System.out.println("Lista de compras");
        for (int i = 0; i < itens.length; i++) {

            System.out.println(itens[i]);
        }
    }
}
