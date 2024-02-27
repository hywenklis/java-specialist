package EstruturaDeDados.ListaSimplesEncadeada;

public class Bagagem {
    String codigo;
    int peso;

    public Bagagem(String codigo, int peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return codigo + " -> " + peso;
    }
}
