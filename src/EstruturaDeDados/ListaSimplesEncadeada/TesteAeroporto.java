package EstruturaDeDados.ListaSimplesEncadeada;

public class TesteAeroporto {
    public static void main(String[] args) {
        // Declaração da lista vazia
        ListaEncadeada lista = new ListaEncadeada();
        // Criação das bagagens e adição na lista
        lista.novaBagagem(new Bagagem("001", 10));
        lista.novaBagagem(new Bagagem("002", 15));
        lista.novaBagagem(new Bagagem("003", 25));
        lista.novaBagagem(new Bagagem("004", 20));
        lista.novaBagagem(new Bagagem("005", 30));

        // Chamada do método de impressão da lista
        lista.imprimeLista();
        // Impressão do peso total
        System.out.println("Peso total: " + lista.PesoTotal());
    }
}
