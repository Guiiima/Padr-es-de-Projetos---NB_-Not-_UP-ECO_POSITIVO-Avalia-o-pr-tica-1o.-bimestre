/**
 * Cliente: demonstra o padrão Observer configurando Subjects e Observers
 * e simulando a publicação de notícias em diferentes tópicos.
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        var topicoEsportes = new TopicoNoticias("Esportes");
        var topicoTecnologia = new TopicoNoticias("Tecnologia");

        Observer leitor1 = new LeitorAssinante("Ana");
        Observer leitor2 = new LeitorAssinante("João");
        Observer leitor3 = new LeitorAssinante("Maria");

        topicoEsportes.registrarObserver(leitor1);
        topicoEsportes.registrarObserver(leitor3);

        topicoTecnologia.registrarObserver(leitor2);
        topicoTecnologia.registrarObserver(leitor3);

        topicoEsportes.setNovaNoticia("Brasil vence a copa do mundo!");
        topicoTecnologia.setNovaNoticia("Lançado novo processador quântico.");

        System.out.println("\nMaria cancelou a assinatura de Esportes.");
        topicoEsportes.removerObserver(leitor3);

        topicoEsportes.setNovaNoticia("Novo recorde mundial nos 100m rasos.");
    }
}
