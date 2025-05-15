package gerenciador_doacoes.ui.menu;

import java.util.ArrayList;

import gerenciador_doacoes.domain.ControleDoacoes;
import gerenciador_doacoes.domain.Doacao;

public class PaginaCadastros {
    
    public void Listar() {
        ControleDoacoes controleDoacoes = new ControleDoacoes();
        ArrayList<Doacao> lista = controleDoacoes.carregarLista();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma doação cadastrada.");
        } else {
            System.out.println("Lista de doações:");
            for (int i = 0; i < lista.size(); i++) {
                Doacao doacao = lista.get(i);
                System.out.println((i + 1) + "Nome: " + doacao.getPessoa().getNome());
                System.out.println("Telefone: " + doacao.getPessoa().getTelefone());
                System.out.println("Endereço: " + doacao.getPessoa().getEndereco());
                System.out.println("Tipo de doação: " + doacao.getTipoDoacao().getClass().getSimpleName());
                System.out.println("Quantidade: " + doacao.getTipoDoacao().getQuantidade());
                System.out.println("-------------------------");
            }
        }
    }
}
