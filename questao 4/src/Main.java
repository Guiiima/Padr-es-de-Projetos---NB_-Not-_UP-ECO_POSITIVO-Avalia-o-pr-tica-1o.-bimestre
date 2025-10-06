/**
 * Cliente: demonstra o uso do padrão Decorator para compor relatórios
 * dinamicamente com funcionalidades adicionais.
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        final Relatorio relatorioSimples = new RelatorioBasico();
        System.out.println("Relatório Simples:");
        System.out.println(relatorioSimples.gerar());
        System.out.println("-".repeat(40));

        final Relatorio relatorioComEstatisticas = new RelatorioComEstatisticas(new RelatorioBasico());
        System.out.println("Relatório com Estatísticas:");
        System.out.println(relatorioComEstatisticas.gerar());
        System.out.println("-".repeat(40));

        final Relatorio relatorioCompleto = new RelatorioExportadoPDF(
                new RelatorioComEstatisticas(
                        new RelatorioBasico()
                )
        );
        System.out.println("Relatório Completo (com Estatísticas e PDF):");
        System.out.println(relatorioCompleto.gerar());
    }
}
