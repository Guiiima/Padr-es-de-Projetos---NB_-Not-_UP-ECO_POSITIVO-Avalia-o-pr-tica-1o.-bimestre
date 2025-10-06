import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject: implementação concreta da interface {@link Subject}.
 *
 * <p>Mantém o estado do tópico (última notícia) e a lista de observadores
 * que serão notificados quando novas notícias forem publicadas.</p>
 */
public final class TopicoNoticias implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final String nomeDoTopico;
    private String ultimaNoticia;

    /**
     * Construtor que define o nome do tópico de notícias.
     *
     * @param nomeDoTopico Nome do tópico
     */
    public TopicoNoticias(String nomeDoTopico) {
        this.nomeDoTopico = nomeDoTopico;
    }

    @Override
    public void registrarObserver(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(nomeDoTopico, ultimaNoticia);
        }
    }

    /**
     * Atualiza o tópico com uma nova notícia e notifica todos os observadores.
     *
     * @param novaNoticia Conteúdo da nova notícia
     */
    public void setNovaNoticia(String novaNoticia) {
        this.ultimaNoticia = novaNoticia;
        System.out.printf("\n[Publicador] Nova notícia publicada em '%s'!%n", nomeDoTopico);
        notificarObservers();
    }
}
