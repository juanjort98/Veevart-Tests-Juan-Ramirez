
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        KnapsackAlgorithm ka = new KnapsackAlgorithm();

        List<Element> elements = new LinkedList<>();

        elements.add(new Element(2, 3));
        elements.add(new Element(3, 4));
        elements.add(new Element(4, 5));
        elements.add(new Element(5, 6));

        int bagCapacity = 8;

        Bag instanceOfBag = ka.knapsack(elements, bagCapacity);

        System.out.println("Included elements =>");

        int totalValue = 0;
        for (Element el : instanceOfBag.elements) {
            System.out.println("Element Weight: " + el.getWeight() + " Element Value: " + el.getValue());
            totalValue += el.getValue();
        }

        System.out.println("totalValue " + totalValue);

    }
}
