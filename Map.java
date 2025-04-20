import java.util.ArrayList;

public class Map {

    private ArrayList<Room> map;
    
    public Map() {
        this.map = new ArrayList<Room>();


        map.add(new Room("Oak & Ember Cafe", "You are in the Oak & Ember Cafe. This is the main location.", Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, 3));
        map.add(new Room("Willowhush Forest", "You are now in the Willowhush Forest.", Direction.NOEXIT, 3, 6, Direction.NOEXIT));
        map.add(new Room("Brooknest Cavern", "You are now in the Brooknest Cavern, a secret cave.", 6, 8, Direction.NOEXIT, Direction.NOEXIT));
        map.add(new Room ("Stillmist Valley", "You are now in the Stillmist Valley.", 5, Direction.NOEXIT, Direction.NOEXIT, 8));
    }
}
