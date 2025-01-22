package DataStructure.LinkedSimpleList;

public class LinkedList {
    Nodo Beginning;

    public LinkedList() {
        this.Beginning = null;
    }

    @Override
    public String toString() {
        return "'" + Beginning + "]";
    }

    public boolean emptyList() {
        return Beginning == null;
    }

    public void printList() {
        Nodo current = Beginning;
        int cont = 0;

        System.out.println("Inicio da Lista");

        if (Beginning == null) {
            System.out.println("Lista Vazia");
        } else {
            while (current != null) {
                System.out.println("Posição: " + cont + " " + current);
                cont++;
                current = current.next;
            }
        }
        System.out.println("Final da Lista");
    }

    public void newBaggage(Baggage baggage) {
        Nodo newNodo = new Nodo(baggage, Beginning);
        Beginning = newNodo;
    }

    public int totalWeight() {
        Nodo current = Beginning;
        int weight = 0;
        if (Beginning == null)
            return 0;
        while (current != null) {
            weight += current.content.weight;
            current = current.next;
        }
        return weight;
    }
}
