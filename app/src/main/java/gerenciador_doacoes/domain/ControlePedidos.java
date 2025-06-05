package gerenciador_doacoes.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import gerenciador_doacoes.data.CadastroTxt;
import gerenciador_doacoes.data.PedidosTxt;
import gerenciador_doacoes.domain.doacao.Alimento;
import gerenciador_doacoes.domain.doacao.MaterialHigiene;
import gerenciador_doacoes.domain.doacao.MaterialLimpeza;
import gerenciador_doacoes.domain.doacao.TipoDoacao;

public class ControlePedidos {

    private PedidosTxt db;

    public ControlePedidos() {
        this.db = new PedidosTxt();
    }

    public ArrayList<Doacao> carregarLista() {
        return this.db.lerArquivo();
 
    }

    public void salvar(String nome, String telefone, String endereco, int tipo , int quantidade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setEndereco(endereco);

        TipoDoacao tipoDoacao;
        switch(tipo) {
            case 1:
                tipoDoacao = new Alimento(quantidade);
                break;
            case 2:
                tipoDoacao = new MaterialHigiene(quantidade); ;
                break;
            case 3:
                tipoDoacao = new MaterialLimpeza(quantidade);
                break;
            default:
                throw new IllegalArgumentException("Tipo de doação inválido: " + tipo);
        };
        Doacao doacao = new Doacao(pessoa,tipoDoacao);
       
        this.db.salvar(doacao);
    }
}