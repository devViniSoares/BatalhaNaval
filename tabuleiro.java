
package batalhanaval;

import java.util.Scanner;
import java.util.Random;

public class Tabuleiro {

    public static char[][] tabuleiro() {
        Scanner sc = new Scanner(System.in);
        int linhas, colunas;

        // Definir tamanho do tabuleiro
        do {
            System.out.print("Digite o número de linhas (mínimo 2): ");
            linhas = sc.nextInt();
            System.out.print("Digite o número de colunas (mínimo 3): ");
            colunas = sc.nextInt();

            if ((linhas < 2 && colunas < 3) || (linhas < 3 && colunas < 2)) {
                System.out.println("Tamanho inválido! O tabuleiro deve ter no mínimo 2x3 ou 3x2.");
            }
        } while ((linhas < 2 && colunas < 3) || (linhas < 3 && colunas < 2));

        // Criar tabuleiro e preencher com '~' representando água
        char[][] tab = new char[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tab[i][j] = '~'; // símbolo para água
            }
        }

        // Posicionar 5 navios aleatoriamente ('N' para navio)
        Random rand = new Random();
        int naviosColocados = 0;

        while (naviosColocados < 5) {
            int linha = rand.nextInt(linhas);
            int coluna = rand.nextInt(colunas);

            if (tab[linha][coluna] != 'N') {
                tab[linha][coluna] = 'N';
                naviosColocados++;
            }
        }

        return tab;
    }
}


