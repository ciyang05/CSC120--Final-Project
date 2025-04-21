import java.util.Arrays;

public class Map {

    private Room[][] map;
    
    public Map() {
        this.map = new Room[3][3];


        map[0][0] = new Room("Oak & Ember Cafe", "You are in the Oak & Ember Cafe");
        map[0][1] = new Room("Willowhust Forest", "You are now in the Willowhush Forest.", new Ingredient("Caramel Syrup", "pumps", 2));
        map[0][2] = new Room("Willowhush Forest", "You are in the Willowhush Forest.");
        map[1][0] = new Room("Stillmist Valley", "You are now in the Stillmist Valley", new Ingredient("Brown Sugar", "teaspoons", 10));
        map[1][1] = new Room("Willowhush Forest", "You are now in the Willowhush Forest");
        map[1][2] = new Room("Brooknest Cavern", "You are now in the Brooknest Cavern.", new Ingredient("Whole Milk", "cups", 0.5));
        map[2][0] = new Room("Stillmist Valley", "You are now in the Stillmist Valley");
        map[2][1] = new Room("Moonrest Cove", "You are now in the Moonrest Cove.", new Ingredient("Espresso", "shots", 2));
        map[2][2] = new Room("Brooknest Cavern", "You are now in the Brooknest Cavern.");

    }



    public static void main(String[] args) {
        Map myMap = new Map();
        System.out.println(Arrays.deepToString(myMap.map));
    }

}