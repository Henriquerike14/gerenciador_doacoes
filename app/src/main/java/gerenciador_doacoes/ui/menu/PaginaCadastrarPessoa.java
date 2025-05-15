package gerenciador_doacoes.ui.menu;

import java.util.Scanner;


import gerenciador_doacoes.domain.ControleDoacoes;

public class PaginaCadastrarPessoa {
ControleDoacoes controle = new ControleDoacoes();
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Pessoa ===");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a telefone: ");
        String telefone = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite onde mora: ");
        String ondeMora = scanner.nextLine();

        System.out.print("Digite o tipo de doação (1 - Alimento, 2 - Material de Higiene, 3 - Material de Limpeza): ");
        int tipo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

   controle.salvar(nome,telefone,ondeMora,tipo,quantidade);
        // System.out.println("\nPessoa cadastrada com sucesso!");
        // System.out.println("Nome: " + nome);
        // System.out.println("Idade: " + telefone);
        // System.out.println("Onde mora: " + ondeMora);
        // System.out.println("Tipo de doação: " + tipo);
    }
}
