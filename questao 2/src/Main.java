/**
 * Cliente: utiliza a {@link PagamentoFactory} para obter instâncias de
 * {@link ProcessadorPagamento} sem conhecer seus detalhes de criação.
 *
 * <p>Este exemplo demonstra o uso do padrão Factory Method, permitindo
 * que a lógica de criação de objetos seja centralizada e flexível.</p>
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        final String tipoPagamentoConfigurado = "pix";
        final double valorDaCompra = 250.75;

        var processador = PagamentoFactory.criarProcessador(tipoPagamentoConfigurado);
        processador.processar(valorDaCompra);

        System.out.println("-".repeat(40));

        processador = PagamentoFactory.criarProcessador("boleto");
        processador.processar(120.00);
    }
}
