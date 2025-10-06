/**
 * ConcreteDecorator A: adiciona a funcionalidade de estatísticas ao relatório.
 *
 * <p>Extende {@link RelatorioDecorator} para compor dinamicamente
 * relatórios com informações adicionais de faturamento.</p>
 */
public final class RelatorioComEstatisticas extends RelatorioDecorator {

    /**
     * Construtor que recebe o relatório base a ser decorado.
     *
     * @param relatorio Relatório que será decorado
     */
    public RelatorioComEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar();
        return adicionarEstatisticas(relatorioBase);
    }

    /**
     * Adiciona informações de estatísticas ao relatório existente.
     *
     * @param relatorio Conteúdo do relatório base
     * @return Relatório com estatísticas adicionadas
     */
    private String adicionarEstatisticas(String relatorio) {
        return relatorio + " + [Estatísticas de Faturamento Adicionadas]";
    }
}
