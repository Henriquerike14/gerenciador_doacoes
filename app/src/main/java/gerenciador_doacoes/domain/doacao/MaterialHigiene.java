package gerenciador_doacoes.domain.doacao;

public class MaterialHigiene extends TipoDoacao {
    

    public MaterialHigiene() {
        super();
    }

    public MaterialHigiene(int quantidade) {
        super(quantidade);
    }

    @Override
    public String getSimpleName() {
        return "Material de Higiene";
    }

    
}
