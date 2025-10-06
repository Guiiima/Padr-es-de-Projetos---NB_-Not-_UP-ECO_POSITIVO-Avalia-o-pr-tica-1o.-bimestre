/**
 * Cliente: usa o gerenciador de protótipos para obter cópias
 * dos documentos e personalizá-las.
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        ModelosManager.carregarModelos();

        var curriculoJoao = (Curriculo) ModelosManager.getDocumento("CURRICULO_MODERNO");
        assert curriculoJoao != null;
        curriculoJoao.setNomeCandidato("João da Silva");

        var curriculoAna = (Curriculo) ModelosManager.getDocumento("CURRICULO_MODERNO");
        assert curriculoAna != null;
        curriculoAna.setNomeCandidato("Ana Oliveira");
        curriculoAna.setCor("Roxo");

        var propostaClienteX = (PropostaComercial) ModelosManager.getDocumento("PROPOSTA_FORMAL");
        assert propostaClienteX != null;
        propostaClienteX.setNomeCliente("Empresa X S.A.");

        imprimir(curriculoJoao);
        imprimir(curriculoAna);
        imprimir(propostaClienteX);
    }

    private static void imprimir(Documento doc) {
        if (doc instanceof Curriculo c) {
            System.out.printf(
                    "Documento: %-20s | Candidato: %-15s | Cor: %-10s | Fonte: %s%n",
                    c.getTipo(), c.getNomeCandidato(), c.getCor(), c.getFonte()
            );
        } else if (doc instanceof PropostaComercial p) {
            System.out.printf(
                    "Documento: %-20s | Cliente: %-15s | Cor: %-10s | Fonte: %s%n",
                    p.getTipo(), p.getNomeCliente(), p.getCor(), p.getFonte()
            );
        } else {
            System.out.printf("Documento desconhecido: %s%n", doc);
        }
    }
}
