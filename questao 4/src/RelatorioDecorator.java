/**
 * Abstract Decorator: mantém uma referência para o componente {@link Relatorio}
 * e delega chamadas ao objeto decorado.
 *
 * <p>Permite que subclasses adicionem responsabilidades adicionais
 * sem alterar o componente original.</p>
 */
public abstract class RelatorioDecorator implements Relatorio {

    /** Referência para o relatório que está sendo decorado. */
    protected final Relatorio relatorioDecorado;

    /**
     * Construtor que define o relatório base a ser decorado.
     *
     * @param relatorio Componente {@link Relatorio} a ser decorado
     */
    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioDecorado = relatorio;
    }

    @Override
    public String gerar() {
        return relatorioDecorado.gerar();
    }
}
