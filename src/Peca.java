public abstract class Peca {
    protected String cor;

    public Peca(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Peca[][] tabuleiro);

}
