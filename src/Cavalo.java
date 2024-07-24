public class Cavalo extends Peca {
    public Cavalo(String cor) {
        super(cor);
    }

    @Override
    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Peca[][] tabuleiro) {
        int deltaLinha = Math.abs(linhaDestino - linhaOrigem);
        int deltaColuna = Math.abs(colunaDestino - colunaOrigem);
        if (deltaLinha * deltaColuna == 2) {
            return tabuleiro[linhaDestino][colunaDestino] == null || !tabuleiro[linhaDestino][colunaDestino].getCor().equals(cor);
        }
        return false;
    }

    @Override
    public String toString() {
        return cor.equals("branco") ? "C" : "c";
    }

}
