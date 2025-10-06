/**
 * ConcretePrototype A: Implementa a operação de clonagem.
 */
public class Curriculo extends Documento {
    private String nomeCandidato;

    @Override
    public String getTipo() {
        return "Currículo";
    }

    public String getNomeCandidato() { return nomeCandidato; }
    public void setNomeCandidato(String nome) { this.nomeCandidato = nome; }
}