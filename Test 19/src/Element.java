public class Element {

       
    // **************************************************
    // Fields
    // ***

    private int weight;
    private int value;

   /**
    * Parameterized constructor.
    * @param weight
    * @param value
    */
    public Element(int weight, int value){
        this.weight=weight;
        this.value =value;
    }


    // **************************************************
    // Getters.
    // ***


    public int getWeight(){
        return weight;
    }

    public int getValue(){
        return value;
    }

}
