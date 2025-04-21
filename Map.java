import java.util.Arrays;

public class Map {

    private Room [][] map;
    
    public Map() {
        this.map = new Room[3][3];

        Room [][] map = {
            {new Room("Oak & Ember Cafe", "You are in the Oak & Ember Cafe."), new Room("Willowhush Forest", "You are now in the Willowhush Forest.", new Ingredient("Caramel Syrup", "pumps", 2)), new Room("Willowhush Forest", "You are still in the Willowhush Forest.")},
            {new Room("Stillmist Valley", "You are now in the Stillmist Valley", new Ingredient("Brown Sugar", "teaspoons", 10)), new Room("Willowhust Forest", "You are now in the Willowhush Forest."), new Room("Brooknest Cavern", "You are now in the Brooknest Cavern.")},
            {new Room("Stillmist Valley", "You are now in the Stillmist Valley"), new Room("Moonrest Cove", "You are now in the Moonrest Cove"), new Room("Brooknest Cavern", "You are now in the Brooknest Cavern")}
        };


    }

    public String toString() {
        return "This is the map" + this.map;
    }

    public static void main(String[] args) {
        Map myMap = new Map();
        System.out.println(myMap);
    }

}