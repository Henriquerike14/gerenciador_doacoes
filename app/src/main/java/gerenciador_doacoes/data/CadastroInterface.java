package gerenciador_doacoes.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

import gerenciador_doacoes.domain.Doacao;

public interface CadastroInterface {
    public ArrayList<Doacao> listarDoacoes();
    public void registrarDoacao(Doacao doacao);

}
