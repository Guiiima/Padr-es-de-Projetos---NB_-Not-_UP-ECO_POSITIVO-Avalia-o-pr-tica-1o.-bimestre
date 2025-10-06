/**
 * Cliente: demonstra o uso do padrão Strategy para cálculo de tarifas.
 *
 * O algoritmo de cálculo é selecionado dinamicamente em tempo de execução.
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        var calculadora = new CalculadoraDeTarifas();

        calculadora.setStrategy(new TransporteTerrestre());
        double tarifaTerrestre = calculadora.executarCalculo(10.0, 150.0);
        System.out.printf("Tarifa Terrestre: R$ %.2f%n", tarifaTerrestre);

        System.out.println("-".repeat(40));

        calculadora.setStrategy(new TransporteAereo());
        double tarifaAerea = calculadora.executarCalculo(5.0, 5000.0);
        System.out.printf("Tarifa Aérea:     R$ %.2f%n", tarifaAerea);
    }
}
