/**
 * Factory: centraliza a criação de objetos {@link ProcessadorPagamento}.
 *
 * <p>Decide qual implementação concreta deve ser instanciada de acordo
 * com o tipo de pagamento fornecido.</p>
 */
public final class PagamentoFactory {

    private PagamentoFactory() {
        throw new UnsupportedOperationException("Classe utilitária - não deve ser instanciada.");
    }

    /**
     * Cria um processador de pagamento baseado no tipo fornecido.
     *
     * @param tipo Tipo de pagamento ("credito", "pix", "boleto")
     * @return Instância concreta de {@link ProcessadorPagamento}
     * @throws IllegalArgumentException se o tipo não for reconhecido
     */
    public static ProcessadorPagamento criarProcessador(final String tipo) {
        return switch (tipo.toLowerCase()) {
            case "credito" -> new CartaoCreditoProcessador();
            case "pix"     -> new PixProcessador();
            case "boleto"  -> new BoletoProcessador();
            default        -> throw new IllegalArgumentException(
                    "Tipo de pagamento desconhecido: " + tipo
            );
        };
    }
}
