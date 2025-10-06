/**
 * Context: mantém uma referência para um objeto {@link TransporteStrategy}
 * e delega a ele o cálculo da tarifa.
 *
 * <p>O cliente pode alterar a estratégia dinamicamente
 * em tempo de execução.</p>
 */
public class CalculadoraDeTarifas {

    private TransporteStrategy strategy;

    /**
     * Define a estratégia de cálculo a ser utilizada.
     *
     * @param strategy Implementação concreta de {@link TransporteStrategy}
     */
    public void setStrategy(TransporteStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executa o cálculo da tarifa com base na estratégia atual.
     *
     * @param peso      Peso da carga.
     * @param distancia Distância da entrega.
     * @return Tarifa calculada conforme a estratégia definida.
     * @throws IllegalStateException se nenhuma estratégia estiver definida.
     */
    public double executarCalculo(double peso, double distancia) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de transporte foi definida.");
        }
        return strategy.calcularTarifa(peso, distancia);
    }
}
