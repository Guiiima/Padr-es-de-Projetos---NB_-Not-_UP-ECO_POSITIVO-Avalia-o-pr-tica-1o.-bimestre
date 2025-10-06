/**
 * Product Interface: define o contrato para processadores de pagamento.
 *
 * <p>Todos os processadores concretos criados pela {@link PagamentoFactory} devem
 * implementar este método para executar o processamento do pagamento.</p>
 */
public interface ProcessadorPagamento {

    /**
     * Processa um pagamento de determinado valor.
     *
     * @param valor Valor a ser processado
     */
    void processar(double valor);
}
