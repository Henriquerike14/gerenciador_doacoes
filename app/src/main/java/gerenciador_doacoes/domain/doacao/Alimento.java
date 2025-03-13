package gerenciador_doacoes.domain.doacao;

public class Alimento extends TipoDoacao {
    
    public Alimento() {
        super();
    }

    public Alimento(int quantidade) {
        super(quantidade);
    }

    @Override
    public String getSimpleName() {
        return "Alimento";
    }
}
