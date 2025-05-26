

package batalhanaval;

import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        
        
  
       /* System.out.println(
                "\n" +
                " ____        _        _ _           _   _             _             _ \n" +
                "| __ )  __ _| |_ __ _| | | ___ _ __| \\ | | __ ___   __| | ___   __ _| |\n" +
                "|  _ \\ / _` | __/ _` | | |/ _ \\ '__|  \\| |/ _` \\ \\ / /| |/ _ \\ / _` | |\n" +
                "| |_) | (_| | || (_| | | |  __/ |  | |\\  | (_| |\\ V / | | (_) | (_| | |\n" +
                "|____/ \\__,_|\\__\\__,_|_|_|\\___|_|  |_| \\_|\\__,_| \\_/  |_|\\___/ \\__,_|_|\n"
        );*/

        System.out.println();
        System.out.println("Esse é o BATALHA NAVAL, o jogo onde você deve acertar os navios inimigos que estão escondidos no tabuleiro...");
        System.out.println("O tabuleiro contém 5 navios de tamanho 1x1");
        System.out.println("Primeiro você deve definir o tamanho do tabuleiro (mínimo 2x3 ou 3x2):");
        System.out.println();

        // O tabuleiro 'tabuleiro' é usado para gerar o tabuleiro do tamanho que o usuário quiser, com os navios
        // sendo gerados aleatoriamente
        char tab[][] = tabuleiro.tabuleiro();
        int nLinha = tab.length;
        int nColuna = tab[0].length;

        
    }
    
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
