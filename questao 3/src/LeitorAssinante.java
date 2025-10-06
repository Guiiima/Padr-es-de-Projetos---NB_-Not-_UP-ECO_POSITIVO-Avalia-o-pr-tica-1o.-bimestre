/**
 * ConcreteObserver: implementação concreta da interface {@link Observer}.
 *
 * <p>Representa um leitor que se inscreveu para receber notificações
 * de novos conteúdos em determinados tópicos.</p>
 */
public final class LeitorAssinante implements Observer {

    private final String nome;

    /**
     * Construtor que define o nome do assinante.
     *
     * @param nome Nome do leitor
     */
    public LeitorAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String nomeTopico, String novaNoticia) {
        System.out.printf(
                "Notificação para %s: Nova notícia no tópico '%s': \"%s\"%n",
                nome, nomeTopico, novaNoticia
        );
    }

    @Override
    public String toString() {
        return "LeitorAssinante{nome='%s'}".formatted(nome);
    }
}
