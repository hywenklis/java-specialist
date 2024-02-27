package EstruturaDeDados.ListaSimplesEncadeada;

public class Nodo {
    Bagagem conteudo;
    Nodo proximo;

    public Nodo(Bagagem dado, Nodo proximo_nodo) {
        this.conteudo = dado;
        this.proximo = proximo_nodo;
    }

    @Override
    public String toString() {
        return conteudo.toString() + " -> " + proximo;
    }
}
