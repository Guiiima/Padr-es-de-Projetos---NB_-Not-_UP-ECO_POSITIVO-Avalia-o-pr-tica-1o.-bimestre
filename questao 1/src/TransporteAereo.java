/**
 * {@code TransporteAereo} é uma implementação concreta da interface {@link TransporteStrategy}.
 *
 * <p>Essa estratégia calcula o custo do transporte aéreo com base principalmente
 * no peso da carga, somando uma tarifa base fixa.</p>
 */
public final class TransporteAereo implements TransporteStrategy {

    private static final double TARIFA_POR_KG = 15.0;
    private static final double TARIFA_BASE = 50.0;

    @Override
    public double calcularTarifa(double peso, double distancia) {
        System.out.println("Calculando tarifa para transporte aéreo...");
        return (peso * TARIFA_POR_KG) + TARIFA_BASE;
    }

    @Override
    public String toString() {
        return "TransporteAereo{tarifaPorKg=%.2f, tarifaBase=%.2f}".formatted(TARIFA_POR_KG, TARIFA_BASE);
    }
}
