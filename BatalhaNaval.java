package batalhanaval;


import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        jogada play = new jogada();

        System.out.println("                                                                                                     \n" +
                "##                  ##               ###     ##                                                              ###\n" +
                "##        #####   ######    #####     ##     ##        #####            ######    #####   ##  ##    #####     ##\n" +
                "######       ##     ##         ##     ##     ######       ##            ##  ##       ##   ##  ##       ##     ##\n" +
                "##  ##   ######     ##     ######     ##     ##  ##   ######            ##  ##   ######   ##  ##   ######     ##\n" +
                "##  ##   ##  ##     ##     ##  ##     ##     ##  ##   ##  ##            ##  ##   ##  ##    ####    ##  ##     ##\n" +
                "######   ######     ####   ######   ######   ##  ##   ######            ##  ##   ######     ##     ######   ######" +
                "                                                                                                          \n");


        
        
        
        
        
        
        System.out.println("=== SELECIONE O MODO DE JOGO ===");
        System.out.println("1. Jogador contra Codigo");
        System.out.println("2. Jogador contra Jogador");
        System.out.print("Escolha: ");
        int modo = scanner.nextInt();
        scanner.nextLine();

        int dificuldade = 1; // Fácil por padrão
        if (modo == 1) {
            System.out.println("\n=== SELECIONE A DIFICULDADE ===");
            System.out.println("1. Facil (Tentativas ilimitadas)");
            System.out.println("2. Medio (5 tentativas a mais que os navios)");
            System.out.println("3. Dificil (1 tentativa a mais que os navios)");
            System.out.print("Escolha: ");
            dificuldade = scanner.nextInt();
            scanner.nextLine();
        }

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Iniciar o jogo");
            System.out.println("2. Instrucoes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
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
                    System.out.println("\n=== INSTRUCOES ===");
                    System.out.println("Esse e o BATALHA NAVAL!");
                    System.out.println("No modo Codigo, voce enfrenta o sistema com niveis de dificuldade.");
                    System.out.println("No modo PvP, voces montam os tabuleiros e se enfrentam!");
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