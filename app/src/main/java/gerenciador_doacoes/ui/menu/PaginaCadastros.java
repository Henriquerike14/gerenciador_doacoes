package gerenciador_doacoes.ui.menu;

import java.util.ArrayList;

import gerenciador_doacoes.domain.ControleDeLogin;
import gerenciador_doacoes.domain.Doacao;

public class PaginaCadastros {
    
    public void Listar() {
       ControleDeLogin controleDeLogin = new ControleDeLogin();
       ArrayList<Doacao> doacoes = controleDeLogin.listarDoacoes();
       for (Doacao doacao : doacoes) {
           System.out.println(doacao.toString());
       }
    }
}
