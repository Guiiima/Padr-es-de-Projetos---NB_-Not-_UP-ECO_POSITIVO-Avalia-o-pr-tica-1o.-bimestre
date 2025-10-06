/**
 * {@code TransporteTerrestre} é uma implementação concreta da interface {@link TransporteStrategy}.
 *
 * <p>Essa estratégia calcula a tarifa de transporte terrestre com base
 * principalmente na distância percorrida (km).</p>
 */
public final class TransporteTerrestre implements TransporteStrategy {

    private static final double TARIFA_POR_KM = 2.5;

    @Override
    public double calcularTarifa(double peso, double distancia) {
        System.out.println("Calculando tarifa para transporte terrestre...");
        return distancia * TARIFA_POR_KM;
    }

    @Override
    public String toString() {
        return "TransporteTerrestre{tarifaPorKm=%.2f}".formatted(TARIFA_POR_KM);
    }
}
