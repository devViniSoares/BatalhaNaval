

package batalhanaval;

import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    jogada play = new jogada();

    while (true) {
        System.out.println("\n=== MENU PRINCIPAL ===\n");
        System.out.println("1. Iniciar o jogo");
        System.out.println("2. Instrucoes");
        System.out.println("3. Sair\n");
        System.out.print("Escolha uma opcao: ");
        String escolha = scanner.nextLine();
        System.out.println("");

        switch (escolha) {
            case "1":
                // Armazenar o tabuleiro
                char[][] tab = tabuleiro.tabuleiro();
                int nLinha = tab.length;
                int nColuna = tab[0].length;

                play.linha = nLinha;
                play.coluna = nColuna;

                play.jogar(tab);
                // Depois de jogar, pode sair do loop
                return;

            case "2":
                System.out.println("\n=== INSTRUCOES ===");
                System.out.println("Esse e o BATALHA NAVAL, o jogo onde voce deve acertar os navios inimigos que estao escondidos no tabuleiro...");
                System.out.println("O tabuleiro contem 5 navios de tamanho 1x1");
                System.out.println("Primeiro voce deve definir o tamanho do tabuleiro (minimo 2x3 ou 3x2):");
                System.out.println();
                break;

            case "3":
                System.out.println("Saindo do jogo. Ate a proxima!");
                scanner.close();
                return;

            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }
}

}