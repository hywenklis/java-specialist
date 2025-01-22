package DataStructure.LinkedSimpleList;

public class Baggage {
    String code;
    int weight;

    public Baggage(String code, int weight) {
        this.code = code;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return code + " -> " + weight;
    }
}
