package DataStructure.LinkedSimpleList;

public class Nodo {
    Baggage content;
    Nodo next;

    public Nodo(Baggage data, Nodo nextNodo) {
        this.content = data;
        this.next = nextNodo;
    }

    @Override
    public String toString() {
        return content.toString() + " -> " + next;
    }
}
