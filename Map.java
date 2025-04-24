import java.util.Arrays;

public class Map {

    private Room[][] arrayMap;
    // bounds of the rows and columns 
    private int maxRow = 2;
    private int maxCol = 2;
    private int leastRow = 0;
    private int leastCol = 0;

    public Map() {
        this.arrayMap = new Room[3][3];


        arrayMap[0][0] = new Room("Oak & Ember Cafe");
        arrayMap[0][0].setLocation(0,0);


        arrayMap[0][1] = new Room("Willowhust Forest", new Ingredient("Caramel Syrup", "pumps", 2));
        arrayMap[0][1].setLocation(0,1);

        arrayMap[0][2] = new Room("Willowhush Forest");
        arrayMap[0][2].setLocation(0,2);

        arrayMap[1][0] = new Room("Stillmist Valley", new Ingredient("Brown Sugar", "teaspoons", 10));
        arrayMap[1][0].setLocation(1,0);

        arrayMap[1][1] = new Room("Willowhush Forest");
        arrayMap[1][1].setLocation(1,1);

        arrayMap[1][2] = new Room("Brooknest Cavern", new Ingredient("Whole Milk", "cups", 0.5));
        arrayMap[1][2].setLocation(1,2);

        arrayMap[2][0] = new Room("Stillmist Valley");
        arrayMap[2][0].setLocation(2,0);

        arrayMap[2][1] = new Room("Moonrest Cove", new Ingredient("Espresso", "shots", 2));
        arrayMap[2][1].setLocation(2,1);

        arrayMap[2][2] = new Room("Brooknest Cavern");
        arrayMap[2][2].setLocation(2,2);

    }



    /**
     * accesses the actual 2D array map, not the object map
     * @return
     */
    public Room [][] getArray_Map() {
        return arrayMap;
    }

    public int getMaxRow() {
        return maxRow;
    }

    public int getMaxCol() {
        return maxCol;
    }

    public int getLeastRow() {
        return leastRow;
    }

    public int getLeastCol() {
        return leastCol;
    }


    // public static void main(String[] args) {
    //     Map myMap = new Map();
    //     getRoom() = myMap.getArray_Map()[0][1];
    //     System.out.println(currentRo);
    // }

}