/**
 * ConcreteComponent: implementação básica da interface {@link Relatorio}.
 *
 * <p>Fornece a funcionalidade inicial de geração de relatório que pode
 * ser extendida dinamicamente por decoradores.</p>
 */
public final class RelatorioBasico implements Relatorio {

    @Override
    public String gerar() {
        return "Relatório Básico: [Lista de Pedidos]";
    }
}
