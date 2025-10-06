/**
 * ConcreteProduct A: implementação concreta de {@link ProcessadorPagamento}
 * responsável por processar pagamentos via Cartão de Crédito.
 *
 * <p>Simula a autorização e confirmação de uma transação com cartão,
 * que em um sistema real envolveria integração com gateways de pagamento.</p>
 */
public final class CartaoCreditoProcessador implements ProcessadorPagamento {

    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f com Cartão de Crédito...%n", valor);
        // Lógica simulada: validação, autorização, integração com adquirente etc.
    }
}
