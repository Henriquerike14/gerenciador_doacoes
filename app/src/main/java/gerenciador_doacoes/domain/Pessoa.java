package gerenciador_doacoes.domain;

public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return 
            "Nome:'" + getNome() + "';" +
            "Telefone:'" + getTelefone() + "';" +
            "Endereço:'" + getEndereco()
            ;
    }

    
}
