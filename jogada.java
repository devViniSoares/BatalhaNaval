/* 
package batalhanaval;
*/

import java.util.Scanner;

public class jogada {

    Scanner input = new Scanner(System.in);
    int linha;
    int coluna;

    public void jogar(char tabuleiro[][], int dificuldade, boolean isPvP) {
        int navio = 5, contador = 0;
        int tentativas = Integer.MAX_VALUE;

        if (!isPvP) {
            if (dificuldade == 2) {
                tentativas = navio + 5;
            } else if (dificuldade == 3) {
                tentativas = navio + 1;
            }
        }

        while (navio > 0 && contador < tentativas) {
            contador++;
            imprimirTabuleiro(tabuleiro);

            char jogadalinhaChar;
            int jogadalinha = -1;
            int jogadacoluna = -1;

            while (jogadalinha >= linha || jogadalinha < 0) {
                System.out.print("Escolha a letra da linha: ");
                jogadalinhaChar = input.next().toUpperCase().charAt(0);
                jogadalinha = jogadalinhaChar - 'A';
                if (jogadalinha >= linha || jogadalinha < 0) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                }
            }

            while (jogadacoluna >= coluna || jogadacoluna < 0) {
                System.out.print("Escolha o número da coluna: ");
                jogadacoluna = input.nextInt() - 1;
                if (jogadacoluna >= coluna || jogadacoluna < 0) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                }
            }

            if (tabuleiro[jogadalinha][jogadacoluna] == 'N') {
                tabuleiro[jogadalinha][jogadacoluna] = 'X';
                System.out.println("\n!!!VOCÊ ACERTOU!!!\n");
                navio--;
            } else if (tabuleiro[jogadalinha][jogadacoluna] == '-') {
                tabuleiro[jogadalinha][jogadacoluna] = 'A';
                System.out.println("\n!!!VOCÊ ERROU!!!\n");
            } else {
                System.out.println("\nESSA POSIÇÃO JÁ FOI ATACADA\n");
            }
        }

        if (navio == 0) {
            System.out.println("\n!!!!VOCÊ VENCEU!!!!");
            System.out.println("Você venceu em " + contador + " tentativas");
        } else {
            System.out.println("\n!!!!FIM DAS TENTATIVAS!!!!");
            System.out.println("Você perdeu!");
        }
    }

    public void jogarPvP(char[][] tab1, char[][] tab2) {
        int navios1 = 5, navios2 = 5;
        boolean vezJogador1 = true;

        while (navios1 > 0 && navios2 > 0) {
            System.out.println("\n=== " + (vezJogador1 ? "Jogador 1" : "Jogador 2") + " ===");
            char[][] tab = vezJogador1 ? tab2 : tab1;

            imprimirTabuleiro(tab);

            char jogadalinhaChar;
            int jogadalinha = -1;
            int jogadacoluna = -1;

            while (jogadalinha >= linha || jogadalinha < 0) {
                System.out.print("Escolha a letra da linha: ");
                jogadalinhaChar = input.next().toUpperCase().charAt(0);
                jogadalinha = jogadalinhaChar - 'A';
                if (jogadalinha >= linha || jogadalinha < 0) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                }
            }

            while (jogadacoluna >= coluna || jogadacoluna < 0) {
                System.out.print("Escolha o número da coluna: ");
                jogadacoluna = input.nextInt() - 1;
                if (jogadacoluna >= coluna || jogadacoluna < 0) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                }
            }

            if (tab[jogadalinha][jogadacoluna] == 'N') {
                tab[jogadalinha][jogadacoluna] = 'X';
                System.out.println("\n!!!VOCÊ ACERTOU!!!\n");
                if (vezJogador1) navios2--; else navios1--;
            } else if (tab[jogadalinha][jogadacoluna] == '-') {
                tab[jogadalinha][jogadacoluna] = 'A';
                System.out.println("\n!!!VOCÊ ERROU!!!\n");
            } else {
                System.out.println("\nESSA POSIÇÃO JÁ FOI ATACADA\n");
            }

            vezJogador1 = !vezJogador1;
        }

        if (navios1 == 0) {
            System.out.println("\nJOGADOR 2 VENCEU!");
        } else {
            System.out.println("\nJOGADOR 1 VENCEU!");
        }
    }

    private void imprimirTabuleiro(char[][] tabuleiro) {
        // Cabeçalho numérico
        System.out.print("  ");
        for (int i = 1; i <= coluna; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < linha; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < coluna; j++) {
                if (tabuleiro[i][j] == 'X') {
                    System.out.print("X ");
                } else if (tabuleiro[i][j] == 'A') {
                    System.out.print("A ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
    }
}