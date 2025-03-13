package gerenciador_doacoes.domain;

import gerenciador_doacoes.domain.doacao.TipoDoacao;


public class Doacao {

    private Pessoa pessoa;
    private TipoDoacao tipoDoacao;
    

    public Doacao() {
    }

    public Doacao(Pessoa pessoa, TipoDoacao tipoDoacao) {
        this.pessoa = pessoa;
        this.tipoDoacao = tipoDoacao;
    }


    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoDoacao getTipoDoacao() {
        return this.tipoDoacao;
    }

    public void setTipoDoacao(TipoDoacao tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }


    @Override
    public String toString() {
        return 
            "Pessoa:" + getPessoa().toString() + "'***" +
            "Doação:" + getTipoDoacao() + "'" 
            ;
    }
    
    
}
