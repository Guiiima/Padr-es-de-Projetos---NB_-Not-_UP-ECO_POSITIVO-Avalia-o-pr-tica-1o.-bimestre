/**
 * ConcretePrototype B: Implementa a operação de clonagem.
 */
public class PropostaComercial extends Documento {
    private String nomeCliente;

    @Override
    public String getTipo() {
        return "Proposta Comercial";
    }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nome) { this.nomeCliente = nome; }
}