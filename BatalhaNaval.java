
/* 
package batalhanaval;
*/

import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        jogada play = new jogada();

        System.out.println("=== SELECIONE O MODO DE JOGO ===");
        System.out.println("1. Jogador contra Código");
        System.out.println("2. Jogador contra Jogador");
        System.out.print("Escolha: ");
        int modo = scanner.nextInt();
        scanner.nextLine();

        int dificuldade = 1; // Fácil por padrão
        if (modo == 1) {
            System.out.println("\n=== SELECIONE A DIFICULDADE ===");
            System.out.println("1. Fácil (Tentativas ilimitadas)");
            System.out.println("2. Médio (5 tentativas a mais que os navios)");
            System.out.println("3. Difícil (1 tentativa a mais que os navios)");
            System.out.print("Escolha: ");
            dificuldade = scanner.nextInt();
            scanner.nextLine();
        }

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Iniciar o jogo");
            System.out.println("2. Instruções");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    if (modo == 1) {
                        char[][] tab = tabuleiro.tabuleiro();
                        int nLinha = tab.length;
                        int nColuna = tab[0].length;

                        play.linha = nLinha;
                        play.coluna = nColuna;

                        play.jogar(tab, dificuldade, false);
                    } else {
                        System.out.println("\n=== Jogador 1 monta o tabuleiro ===");
                        char[][] tab1 = tabuleiro.tabuleiro();
                        System.out.println("\n=== Jogador 2 monta o tabuleiro ===");
                        char[][] tab2 = tabuleiro.tabuleiro();

                        int nLinha = tab1.length;
                        int nColuna = tab1[0].length;

                        play.linha = nLinha;
                        play.coluna = nColuna;

                        play.jogarPvP(tab1, tab2);
                    }
                    return;

                case "2":
                    System.out.println("\n=== INSTRUÇÕES ===");
                    System.out.println("Esse é o BATALHA NAVAL!");
                    System.out.println("No modo Código, você enfrenta o sistema com níveis de dificuldade.");
                    System.out.println("No modo PvP, vocês montam os tabuleiros e se enfrentam!");
                    break;

                case "3":
                    System.out.println("Saindo do jogo. Até a próxima!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}