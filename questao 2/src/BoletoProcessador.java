/**
 * ConcreteProduct C: implementação concreta de {@link ProcessadorPagamento}
 * responsável por processar pagamentos via Boleto Bancário.
 *
 * <p>Este tipo de pagamento geralmente envolve a geração de um documento com
 * código de barras e vencimento, que o cliente pode pagar em bancos ou aplicativos.</p>
 */
public final class BoletoProcessador implements ProcessadorPagamento {

    @Override
    public void processar(double valor) {
        System.out.printf("Gerando boleto bancário no valor de R$ %.2f...%n", valor);
        // Lógica simulada: integração com sistema bancário, emissão do boleto etc.
    }
}
