import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Registry (ou Manager): Mantém um conjunto de protótipos.
 *
 * <p>O cliente pode solicitar um protótipo e o gerenciador retorna um clone do
 * objeto armazenado. Os modelos são carregados uma vez e expostos apenas para leitura.</p>
 */
public final class ModelosManager {

    private static final Map<String, Documento> MODELOS_CACHE = new HashMap<>();

    private ModelosManager() {
        throw new UnsupportedOperationException("Classe utilitária - não deve ser instanciada.");
    }

    /**
     * Carrega os protótipos iniciais.
     * Deve ser chamado uma vez na inicialização da aplicação.
     */
    public static void carregarModelos() {
        Curriculo curriculoModelo = new Curriculo();
        curriculoModelo.setCor("Azul");
        curriculoModelo.setFonte("Arial");

        PropostaComercial propostaModelo = new PropostaComercial();
        propostaModelo.setCor("Cinza");
        propostaModelo.setFonte("Times New Roman");

        MODELOS_CACHE.put("CURRICULO_MODERNO", curriculoModelo);
        MODELOS_CACHE.put("PROPOSTA_FORMAL", propostaModelo);
    }

    /**
     * Retorna um clone independente do documento correspondente à chave fornecida.
     *
     * @param chave Identificador do modelo (ex: "CURRICULO_MODERNO")
     * @return Uma cópia independente do modelo ou {@code null} se a chave não existir
     */
    public static Documento getDocumento(String chave) {
        Documento prototipo = MODELOS_CACHE.get(chave);
        return (prototipo != null) ? prototipo.clone() : null;
    }

    /**
     * Retorna uma visão não modificável dos modelos disponíveis.
     */
    public static Map<String, Documento> getModelosDisponiveis() {
        return Collections.unmodifiableMap(MODELOS_CACHE);
    }
}
