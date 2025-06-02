package batalhanaval;


import java.util.Random;
import java.util.Scanner;

public class tabuleiro {

    public static char[][] tabuleiro() {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int linha = 0, coluna = 0;

        while (linha * coluna < 5) {
            System.out.println("Digite o numero de linhas do tabuleiro: ");
            linha = input.nextInt();
            System.out.println("Digite o numero de colunas do tabuleiro: ");
            coluna = input.nextInt();
            System.out.println();

            if (linha * coluna < 5) {
                System.out.println("O tabuleiro precisa ter no minimo 5 espacos\n");
            }
        }

        char[][] tab = new char[linha][coluna];

        // Inicializa tudo com '-'
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                tab[i][j] = '-';
            }
        }

        int linha1, coluna1;

        for (int cont = 0; cont < 5; cont++) {
            linha1 = gerador.nextInt(linha);
            coluna1 = gerador.nextInt(coluna);

            if (tab[linha1][coluna1] == 'N') {
                cont--;
            } else {
                tab[linha1][coluna1] = 'N';
            }
        }

        // Mostra o tabuleiro ocultado
        for (int cont1 = 0; cont1 < linha; cont1++) {
            for (int cont2 = 0; cont2 < coluna; cont2++) {
                System.out.print("~ ");
            }
            System.out.println();
        }

        return tab;
    }
}
