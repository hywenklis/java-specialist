package EstruturaDeDados.ListaSimplesEncadeada;

public class ListaEncadeada {
    Nodo inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    @Override
    public String toString() {
        return "'" + inicio + "]";
    }

    public boolean ListaVazia() {
        return inicio == null;
    }

    public void imprimeLista() {
        Nodo atual = inicio;
        int cont = 0;

        System.out.println("Inicio da Lista");

        if (inicio == null) {
            System.out.println("Lista Vazia");
        } else {
            while (atual != null) {
                System.out.println("Posição: " + cont + " " + atual);
                cont++;
                atual = atual.proximo;
            }
        }
        System.out.println("Final da Lista");
    }

    public void novaBagagem(Bagagem bagagem) {
        Nodo novoNodo = new Nodo(bagagem, inicio);
        inicio = novoNodo;
    }

    public int PesoTotal() {
        Nodo atual = inicio;
        int peso = 0;
        if (inicio == null)
            return 0;
        while (atual != null) {
            peso += atual.conteudo.peso;
            atual = atual.proximo;
        }
        return peso;
    }
}
