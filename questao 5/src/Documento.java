/**
 * Prototype Interface: define a estrutura de clonagem para documentos.
 *
 * <p>A interface Cloneable do Java é uma interface de marcação, portanto
 * é uma boa prática sobrescrever o método {@link #clone()} como público
 * e retornar o tipo específico em vez de {@code Object}.</p>
 */
public abstract class Documento implements Cloneable {

    private String cor;
    private String fonte;

    public abstract String getTipo();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Erro ao clonar Documento", e);
        }
    }

    @Override
    public String toString() {
        return "%s{cor='%s', fonte='%s'}".formatted(getTipo(), cor, fonte);
    }
}
