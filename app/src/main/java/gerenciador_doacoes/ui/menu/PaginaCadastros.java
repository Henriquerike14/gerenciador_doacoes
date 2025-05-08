package gerenciador_doacoes.ui.menu;

import java.util.ArrayList;

import gerenciador_doacoes.domain.ControleDoacoes;
import gerenciador_doacoes.domain.Doacao;

public class PaginaCadastros {
    
    public void Listar() {
        ControleDoacoes ControleDoacoes = new ControleDoacoes();
       ArrayList<Doacao> doacoes = ControleDoacoes.listarDoacoes();
       for (Doacao doacao : doacoes) {
           System.out.println(doacao.toString());
       }
    }
}
