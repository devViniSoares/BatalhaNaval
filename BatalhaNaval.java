
package batalhanaval;

public class BatalhaNaval {

    public static void main(String[] args) {
        
        //Jogada play = new Jogada();

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

        // O método 'jogada' que eu chamei é usado aqui, passando o número de linhas e colunas para o método "jogada"
        // e também executando esse método com o mesmo com o 'jogar', assim repetindo jogadas até terminar a partida
        play.linha = nLinha;
        play.coluna = nColuna;
        play.jogar(tab);
        
    }
    
}
