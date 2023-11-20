
import java.util.LinkedList;
import java.util.List;

public class KnapsackAlgorithm {


    /**
     * Method that creates the resulting bag with the Knapsack algorithm applies 
     * 
     * @param elements
     * @param bagMaxCapacity
     * @return resulting Bag with filtered elements
     */

    public Bag knapsack(List<Element> elements, int bagMaxCapacity) {
       
        int[][] dynamicP = new int[elements.size() + 1][bagMaxCapacity + 1]; 

        //Dynamic Programming algorithm to calculate maximun value of the result Bag
        for (int i = 1; i <= elements.size(); i++) {
            Element currElement = elements.get(i - 1);
            for (int j = 0; j <= bagMaxCapacity; j++) {
                if (currElement.getWeight() > j) {
                    dynamicP[i][j] = dynamicP[i - 1][j];
                } else {
                    dynamicP[i][j] = Math.max(dynamicP[i-1][j],
                            dynamicP[i - 1][j - currElement.getWeight()] + currElement.getValue());
                }
            }
        }

        List<Element> finalBagList = new LinkedList<>(); //List with included elements

        int j = bagMaxCapacity;

        for (int i = elements.size(); i > 0 && j > 0; i--) {
            if (dynamicP[i][j] != dynamicP[i - 1][j]) {
                Element chosenlement = elements.get(i - 1);

                finalBagList.add(chosenlement);

                j = chosenlement.getWeight();

            }
        }

        
        Bag resultBag = new Bag(finalBagList, dynamicP[elements.size()][bagMaxCapacity]);

        return resultBag;

    }

}
