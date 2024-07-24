public class Torre extends Peca {
    public Torre(String cor) {
        super(cor);
    }

    @Override
    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Peca[][] tabuleiro){
        if(linhaOrigem == linhaDestino || colunaOrigem == colunaDestino) {
          int deltaLinha = Integer.signum(linhaDestino - linhaOrigem);
          int deltaColuna = Integer.signum(colunaDestino - colunaOrigem);
          int linha = linhaOrigem + deltaLinha;
          int coluna = colunaOrigem + deltaColuna;
          while(linha != linhaDestino || coluna != colunaDestino) {
              if(tabuleiro[linha][coluna] != null) {
                  return false;
              }
              linha += deltaLinha;
              coluna += deltaColuna;
          }
          return tabuleiro[linha][coluna] == null || !tabuleiro[linhaDestino][colunaDestino].getCor().equals(cor);
        }
        return false;
    }

    @Override
    public String toString() {
        return cor.equals("branco") ? "T" : "t";
    }
}
