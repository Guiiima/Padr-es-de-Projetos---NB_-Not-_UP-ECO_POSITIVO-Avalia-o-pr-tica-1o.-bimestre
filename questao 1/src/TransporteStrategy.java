/**
 * Strategy: Define a interface comum para as estratégias de cálculo de tarifa.
 *
 * <p>Cada implementação concreta deve fornecer seu próprio algoritmo
 * para o cálculo com base nos parâmetros de peso e distância.</p>
 */
public interface TransporteStrategy {

    /**
     * Calcula a tarifa de transporte com base nos parâmetros fornecidos.
     *
     * @param peso      Peso da carga em quilogramas.
     * @param distancia Distância em quilômetros.
     * @return Valor total da tarifa calculada.
     */
    double calcularTarifa(double peso, double distancia);
}
