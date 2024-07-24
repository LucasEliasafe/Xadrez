public class Peao extends Peca {
    public Peao(String cor) {
        super(cor);
    }

    @Override
    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Peca[][] tabuleiro) {
        int direcao = cor.equals("branco") ? -1 : 1;
        if (linhaDestino == linhaOrigem + direcao && colunaDestino == colunaOrigem && tabuleiro[linhaDestino][colunaDestino] == null) {
            return true;
        }
        if ((cor.equals("branco") && linhaOrigem == 6 || cor.equals("preto") && linhaOrigem == 1) &&
                linhaDestino == linhaOrigem + 2 * direcao && colunaDestino == colunaOrigem &&
                tabuleiro[linhaDestino][colunaDestino] == null && tabuleiro[linhaOrigem + direcao][colunaOrigem] == null) {
            return true;
        }

        if (linhaDestino == linhaOrigem + direcao && Math.abs(colunaDestino - colunaOrigem) == 1 && tabuleiro[linhaDestino][colunaDestino] != null &&
                !tabuleiro[linhaDestino][colunaDestino].getCor().equals(cor)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return cor.equals("branco") ? "P" : "p";
    }
}