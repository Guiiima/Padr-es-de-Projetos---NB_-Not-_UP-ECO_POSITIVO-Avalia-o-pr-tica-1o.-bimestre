/**
 * Subject Interface: define o contrato para objetos que mantêm observadores
 * e notificam sobre mudanças de estado.
 *
 * <p>Os Subjects podem registrar, remover e notificar observadores
 * que implementam a interface {@link Observer}.</p>
 */
public interface Subject {

    /**
     * Registra um novo observador para receber notificações.
     *
     * @param observer Observador a ser registrado
     */
    void registrarObserver(Observer observer);

    /**
     * Remove um observador do registro de notificações.
     *
     * @param observer Observador a ser removido
     */
    void removerObserver(Observer observer);

    /**
     * Notifica todos os observadores registrados sobre uma mudança.
     */
    void notificarObservers();
}
