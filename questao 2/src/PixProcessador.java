/**
 * ConcreteProduct B: implementação concreta de {@link ProcessadorPagamento}
 * responsável por processar pagamentos via PIX.
 *
 * <p>Em um sistema real, incluiria integração com APIs bancárias
 * ou gateways de pagamento instantâneo.</p>
 */
public final class PixProcessador implements ProcessadorPagamento {

    @Override
    public void processar(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f via PIX...%n", valor);
    }
}
