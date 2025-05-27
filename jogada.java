package batalhanaval;

import java.util.Scanner;

public class jogada {

    Scanner input = new Scanner(System.in);

    int linha;
    int coluna;

    public void jogar(char tabuleiro[][]) {
        int navio = 5, contador = 0;

        while (navio > 0) {
            contador++;

            int jogadalinha = linha + 1, jogadacoluna = coluna + 1;

            while (jogadalinha >= linha || jogadalinha < 0) {
                System.out.println("Faca sua jogada\nEscolha a posicao da linha: ");
                jogadalinha = input.nextInt() - 1;
                if (jogadalinha >= linha || jogadalinha < 0) {
                    System.out.println("!!!POSICAO INVALIDA!!!\n");
                }
            }

            while (jogadacoluna >= coluna || jogadacoluna < 0) {
                System.out.println("Escolha a posicao da coluna: ");
                jogadacoluna = input.nextInt() - 1;
                if (jogadacoluna >= coluna || jogadacoluna < 0) {
                    System.out.println("!!!POSICAO INVALIDA!!!\n");
                }
            }

            if (tabuleiro[jogadalinha][jogadacoluna] == 'N') {
                tabuleiro[jogadalinha][jogadacoluna] = 'X';

                imprimirTabuleiro(tabuleiro);

                System.out.println("\n!!!VOCE ACERTOU!!!\n");
                navio--;
            } else if (tabuleiro[jogadalinha][jogadacoluna] == '-') {
                tabuleiro[jogadalinha][jogadacoluna] = 'A';

                imprimirTabuleiro(tabuleiro);

                System.out.println("\n!!!VOCE ERROU!!!\n");
            } else {
                System.out.println("\nESSA POSICAO JA FOI ATACADA\n");
            }
        }
        System.out.println("\n!!!!VOCE VENCEU!!!!");
        System.out.println("Voce venceu em " + contador + " tentativas");
    }

    private void imprimirTabuleiro(char[][] tabuleiro) {
        for (int contl = 0; contl < linha; contl++) {
            for (int contc = 0; contc < coluna; contc++) {
                if (tabuleiro[contl][contc] == 'X') {
                    System.out.print("X ");
                } else if (tabuleiro[contl][contc] == 'A') {
                    System.out.print("A ");
                } else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
    }
}
