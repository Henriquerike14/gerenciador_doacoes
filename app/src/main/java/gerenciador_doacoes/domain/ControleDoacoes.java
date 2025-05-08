package gerenciador_doacoes.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import gerenciador_doacoes.data.CadastroTxt;
import gerenciador_doacoes.domain.doacao.Alimento;
import gerenciador_doacoes.domain.doacao.TipoDoacao;

public class ControleDoacoes {

    private CadastroTxt db;

    public ControleDoacoes() {
        this.db = new CadastroTxt();
    }

    public ArrayList<Pessoa> carregarLista() {
        return this.db.lerArquivo;
 
    }

    public void salvar(String nome, int idade, String endereco, int tipo , int quantidade) {
        Pessoa pessoa = new Pessoa();
        
        TipoDoacao tipoDoacao;
        Doacao doacao = new Doacao(pessoa,new Alimento(quantidade));
        pessoa.setNome(nome);
       
        this.db.salvar(doacao);

    }

    // public void excluir(int index) {
        
    //     this.db.excluir(index)

    // }
}
