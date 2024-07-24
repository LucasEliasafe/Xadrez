public class Peao extends Peca {
    public Peao() {
        super(cor);
    }

    @Override
    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Peca[][] tabuleiro) {
        int direcao = cor.equals("branco") ? -1 : 1;
        if(linhaDestino == linhaOrigem + direcao && colunaDestino == colunaOrigem + direcao) {}
    }

}
