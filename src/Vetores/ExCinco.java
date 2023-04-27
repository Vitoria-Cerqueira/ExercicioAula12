package Vetores;

import java.util.Scanner;

public class ExCinco {
    public static void main(String[] args) {
        Scanner musica = new Scanner(System.in);

        String nomeBanda;
        String musicas[] = new String[3];

        System.out.println("Informe o nome de uma banda: ");
        nomeBanda = musica.nextLine();

        for (int i = 0; i < musicas.length; i++) {

            System.out.println("Difite uma música da banda " + musicas);
            musicas[i] = musica.nextLine();

        }

        for (int i = 0; i < musicas.length; i++) {
            System.out.println(nomeBanda);
            System.out.println(musicas[i]);
        }



    }
}
