import java.util.Arrays;

public class Map {

    private Room[][] arrayMap;
    Barista myBarista;
    private Room currentRo;
    
    public Map() {
        this.arrayMap = new Room[3][3];
        this.myBarista = new Barista("Pepper", 0, 0);


        arrayMap[0][0] = new Room("Oak & Ember Cafe", "You are in the Oak & Ember Cafe");
        arrayMap[0][1] = new Room("Willowhust Forest", "You are now in the Willowhush Forest.", new Ingredient("Caramel Syrup", "pumps", 2));
        arrayMap[0][2] = new Room("Willowhush Forest", "You are in the Willowhush Forest.", new Person("Berta"));
        arrayMap[1][0] = new Room("Stillmist Valley", "You are now in the Stillmist Valley", new Ingredient("Brown Sugar", "teaspoons", 10));
        arrayMap[1][1] = new Room("Willowhush Forest", "You are now in the Willowhush Forest");
        arrayMap[1][2] = new Room("Brooknest Cavern", "You are now in the Brooknest Cavern.", new Ingredient("Whole Milk", "cups", 0.5));
        arrayMap[2][0] = new Room("Stillmist Valley", "You are now in the Stillmist Valley", new Person("Berta"));
        arrayMap[2][1] = new Room("Moonrest Cove", "You are now in the Moonrest Cove.", new Ingredient("Espresso", "shots", 2));
        arrayMap[2][2] = new Room("Brooknest Cavern", "You are now in the Brooknest Cavern.");

    }



    /**
     * accesses the actual 2D array map, not the object map
     * @return
     */
    public Room [][] getArray_Map() {
        return arrayMap;
    }

    public Barista getBarista() {
        return myBarista;
    }

    public Room getRoom() {
        return currentRo;
    }


    String deepToString() {
        return "You are in the " + currentRo;
    }


    public static void main(String[] args) {
        Map myMap = new Map();
        getRoom() = myMap.getArray_Map()[0][1];
        System.out.println(currentRo);
    }

}