import Tabuleiro.Posicao;

public class Main {
    public static void main(String[] args) {
        Posicao posicao = new Posicao(1, 2);

        System.out.println("Linha: " + posicao.getLinha() + " Coluna: " + posicao.getColuna());
    }
}