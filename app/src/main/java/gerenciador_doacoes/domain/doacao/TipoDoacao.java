package gerenciador_doacoes.domain.doacao;

public abstract class TipoDoacao {
    private int quantidade;

    protected TipoDoacao() {
    }


    protected TipoDoacao(int quantidade) {
        this.quantidade = quantidade;
    }


    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract String getSimpleName();


    @Override
    public String toString() {
        return "Tipo:'" + getSimpleName() + "';" +
            "Quantidade:'" + getQuantidade()
            ;
    }


}


