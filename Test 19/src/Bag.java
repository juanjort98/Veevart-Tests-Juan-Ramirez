import java.util.List;

public class Bag {

    /*Fields*/

    List<Element> elements;
    int totalElementsValue;

    /**
     * Parametrized Constructor
     * @param elements
     * @param totalValue
     */

    public Bag(List<Element> elements, int totalValue) {
        this.elements = elements;
        this.totalElementsValue = totalValue;
    }
}
