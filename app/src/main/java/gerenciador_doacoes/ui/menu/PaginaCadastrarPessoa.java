package gerenciador_doacoes.ui.menu;

import java.util.Scanner;

public class PaginaCadastrarPessoa {

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Pessoa ===");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite onde mora: ");
        String ondeMora = scanner.nextLine();

        System.out.println("\nPessoa cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Onde mora: " + ondeMora);
    }
}
