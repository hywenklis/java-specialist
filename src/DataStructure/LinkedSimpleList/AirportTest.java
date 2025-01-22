package DataStructure.LinkedSimpleList;

public class AirportTest {
    public static void main(String[] args) {
        // Declaração da lista vazia
        LinkedList list = new LinkedList();

        // Criação das bagagens e adição na lista
        list.newBaggage(new Baggage("001", 10));
        list.newBaggage(new Baggage("002", 15));
        list.newBaggage(new Baggage("003", 25));
        list.newBaggage(new Baggage("004", 20));
        list.newBaggage(new Baggage("005", 30));

        // Chamada do método de impressão da lista
        list.printList();
        // Impressão do peso total
        System.out.println("Peso total: " + list.totalWeight());
    }
}
