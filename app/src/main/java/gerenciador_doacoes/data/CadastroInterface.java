package gerenciador_doacoes.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

import gerenciador_doacoes.domain.Doacao;
import gerenciador_doacoes.domain.Pessoa;

public interface CadastroInterface {
   public ArrayList<Doacao> lerArquivo();
    public void salvar(Doacao doacao);
    public void salvarLista(ArrayList<Doacao> lista);
    public void editar(int index, Doacao doacao);
    public void excluir(int indice);

}
