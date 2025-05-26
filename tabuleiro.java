
package batalhanaval;

import java.util.Scanner;
import java.util.Random;

public class tabuleiro {

     public static char[][] tabuleiro() {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int linha = 0, coluna = 0;

        
        while (linha * coluna < 5) {
            System.out.println("Digite o número de linhas do tabuleiro: ");
            linha = input.nextInt();
            System.out.println("Digite o número de colunas do tabuleiro: ");
            coluna = input.nextInt();

            if (linha * coluna < 5) {
                System.out.println("O tabuleiro precisa ter no mínimo 5 espaços");
                System.out.println();
            }
        }

        char[][] tab = new char[linha][coluna];

        int linha1 = 0;
        int coluna1 = 0;

      
        for (int cont = 0; cont < 5; cont++) {
            linha1 = gerador.nextInt(linha);
            coluna1 = gerador.nextInt(coluna);

            if (tab[linha1][coluna1] == 'n') {
                cont--; 
            } else {
                tab[linha1][coluna1] = 'n';
            }
        }

               for (int cont1 = 0; cont1 < linha; cont1++) {
            for (int cont2 = 0; cont2 < coluna; cont2++) {
                if (tab[cont1][cont2] != 'n') {
                    tab[cont1][cont2] = 'a';
                }
            }
        }

        
        for (int cont1 = 0; cont1 < linha; cont1++) {
            for (int cont2 = 0; cont2 < coluna; cont2++) {
                System.out.print("~ ");
            }
            System.out.println();
        }

        return tab;
    }

}


