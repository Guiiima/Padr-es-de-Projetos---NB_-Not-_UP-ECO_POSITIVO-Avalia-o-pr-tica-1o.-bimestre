/**
 * ConcreteDecorator B: adiciona a funcionalidade de exportação do relatório para PDF.
 *
 * <p>Estende {@link RelatorioDecorator} e adiciona comportamento adicional
 * sem modificar o componente original.</p>
 */
public final class RelatorioExportadoPDF extends RelatorioDecorator {

    /**
     * Construtor que recebe o relatório base a ser decorado.
     *
     * @param relatorio Relatório a ser decorado
     */
    public RelatorioExportadoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar();
        return exportarParaPDF(relatorioBase);
    }

    /**
     * Adiciona marcação indicando que o relatório foi exportado para PDF.
     *
     * @param relatorio Conteúdo do relatório base
     * @return Relatório com indicação de exportação para PDF
     */
    private String exportarParaPDF(String relatorio) {
        return relatorio + " -> [Exportado para PDF]";
    }
}
