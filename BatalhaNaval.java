

package batalhanaval;

import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         while (true) {
            /* System.out.println(
                "\n" +
                " ____        _        _ _           _   _             _             _ \n" +
                "| __ )  __ _| |_ __ _| | | ___ _ __| \\ | | __ ___   __| | ___   __ _| |\n" +
                "|  _ \\ / _` | __/ _` | | |/ _ \\ '__|  \\| |/ _` \\ \\ / /| |/ _ \\ / _` | |\n" +
                "| |_) | (_| | || (_| | | |  __/ |  | |\\  | (_| |\\ V / | | (_) | (_| | |\n" +
                "|____/ \\__,_|\\__\\__,_|_|_|\\___|_|  |_| \\_|\\__,_| \\_/  |_|\\___/ \\__,_|_|\n"
        );*/
            System.out.println("\n=== MENU PRINCIPAL ===\n");
            System.out.println("1. Iniciar o jogo");
            System.out.println("2. Instruções");
            System.out.println("3. Sair\n");
            System.out.print("Escolha uma opção: ");
            System.out.println();

            String escolha = scanner.nextLine();
             System.out.println("");

            switch (escolha) {
                case "1":
                    tabuleiro.tabuleiro();
                    return;
                case "2":
                    System.out.println("\n=== INSTRUÇÕES ===");
                    System.out.println();
                    System.out.println("Esse é o BATALHA NAVAL, o jogo onde você deve acertar os navios inimigos que estão escondidos no tabuleiro...");
                    System.out.println("O tabuleiro contém 5 navios de tamanho 1x1");
                    System.out.println("Primeiro você deve definir o tamanho do tabuleiro (mínimo 2x3 ou 3x2):");
                    System.out.println();
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
        
        char tab[][] = tabuleiro.tabuleiro();
        int nLinha = tab.length;
        int nColuna = tab[0].length;
        
    }

