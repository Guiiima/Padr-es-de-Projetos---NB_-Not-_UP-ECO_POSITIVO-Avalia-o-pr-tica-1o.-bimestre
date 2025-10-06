/**
 * Component Interface: define o contrato para objetos que podem ter
 * responsabilidades adicionadas dinamicamente via decoradores.
 *
 * <p>Todos os relatórios concretos e decoradores devem implementar
 * este método {@code gerar()} para produzir a saída do relatório.</p>
 */
public interface Relatorio {

    /**
     * Gera o conteúdo do relatório.
     *
     * @return Texto do relatório gerado
     */
    String gerar();
}
