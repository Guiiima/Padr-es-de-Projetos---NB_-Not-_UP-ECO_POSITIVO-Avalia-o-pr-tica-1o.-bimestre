/**
 * Observer Interface: define o contrato que todos os observadores
 * (leitores, assinantes) devem implementar no padrão Observer.
 *
 * <p>Cada observador deve fornecer o método {@code update}, que será
 * chamado pelo Subject quando houver novas notificações.</p>
 */
public interface Observer {

    /**
     * Método chamado pelo Subject para notificar sobre uma nova notícia.
     *
     * @param nomeTopico  Nome do tópico que gerou a notificação
     * @param novaNoticia Conteúdo da nova notícia
     */
    void update(String nomeTopico, String novaNoticia);
}
