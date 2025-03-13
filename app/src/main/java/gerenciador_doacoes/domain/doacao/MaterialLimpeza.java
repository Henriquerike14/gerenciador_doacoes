
package gerenciador_doacoes.domain.doacao;

public class MaterialLimpeza extends TipoDoacao {

    public MaterialLimpeza() {
        super();
    }

    public MaterialLimpeza(int quantidade) {
        super(quantidade);
    }

    @Override
    public String getSimpleName() {
        return "Material de Limpeza";
    }
}