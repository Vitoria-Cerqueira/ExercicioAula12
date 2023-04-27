package Vetores;

import java.util.Scanner;

public class ExDois {
    public static void main(String[] args) {
        Scanner nomeAluno = new Scanner(System.in);

        String aluno[] = new String[10];

        for (int i = 0; i < aluno.length ; i++) {
            System.out.println("Informe o nome do aluno");
            aluno[i] = nomeAluno.nextLine();
        }

        System.out.println("Lista de chamada");

        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
}
