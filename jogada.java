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
                System.out.println("faça sua jogada \nEscolha a posição da linha: ");
                jogadalinha = input.nextInt() - 1;
                if (jogadalinha >= linha) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                    System.out.println();
                }
            }

            while (jogadacoluna >= coluna || jogadacoluna < 0) {
                System.out.println("Escolha a posição da coluna: ");
                jogadacoluna = input.nextInt() - 1;
                if (jogadacoluna >= coluna) {
                    System.out.println("!!!POSIÇÃO INVÁLIDA!!!");
                    System.out.println();
                }
            }

            if (tabuleiro[jogadalinha][jogadacoluna] == 'n') {
                tabuleiro[jogadalinha][jogadacoluna] = 'x';
                
                for (int contl = 0; contl < linha; contl++) {   
                    for (int contc = 0; contc < coluna; contc++) {
                        if (tabuleiro[contl][contc] == 'x') {
                            System.out.println("x ");
                        } else if (tabuleiro[contl][contc] == 'o') {
                            System.out.println("O ");
                        } else {
                            System.out.println("~ ");
                        }
                    }
                    System.out.println();
                }

                System.out.println();
                System.out.println("!!!VOCÊ ACERTOU!!!");
                System.out.println();
                System.out.println();
                navio--;
            } else if (tabuleiro[jogadalinha][jogadacoluna] == 'a') {
                tabuleiro[jogadalinha][jogadacoluna] = 'o';
                
                for (int contl = 0; contl < linha; contl++) {
                    for (int contc = 0; contc < coluna; contc++) {
                        if (tabuleiro[contl][contc] == 'o') {
                            System.out.println("O ");
                        } else if (tabuleiro[contl][contc] == 'x') {
                            System.out.println("X ");
                        } else {
                            System.out.println("~ ");
                        }
                    }
                    System.out.println();
                }
                
                System.out.println();
                System.out.println("!!!VOCÊ ERROU!!!");
                System.out.println();
                System.out.println();

            } else {
                System.out.println();
                System.out.println("ESSA POSIÇÃO JÁ FOI ATACADA");
                System.out.println();
            }
        }
    }
}
