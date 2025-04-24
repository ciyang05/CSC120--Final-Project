import java.util.Arrays;

public class Room {
    
    // Attributes 
    private String roomName;
    private Ingredient ingre;
    private Person aPerson;
    private int[] location = new int[2];


    /**
     * constructor with room name and person
     * @param rName
     * @param anyPerson
     */
    public Room(String rName, Person anyPerson) {
        this.roomName = rName;
        this.aPerson = anyPerson;
    }


    /**
     * constructor with just room name, for when room does not have ingredients 
     * @param rName
     */
    public Room(String rName) {
        this.roomName = rName;
    }


    /**
     * full constructor for room 
     * @param rName
     * @param ingre_1
     */
    public Room(String rName, Ingredient ingre_1) {
        this.roomName = rName;
        this.ingre = ingre_1;
    }


    /**
     * accessor for name of room
     * @return roomName
     */
    public String getName() {
        return roomName;
    }



    /**
     * accessor for ingredient
     * @return ingre
     */
    public Ingredient getIngre() {
        return ingre;
    }


    /**
     * accesses the Person (barista or manager)
     * @return aPerson
     */
    public Person getPerson() {
        return aPerson;
    }


    // right now used for debugging
    /**
     * defines the room object as a string
     * @return roomName
     */
    // public String toString() {
    //     return roomName;
    // }

    public String toString() {
        return "You are now at " + this.roomName;
    }


    public void setLocation(int row, int col) {
        this.location[0] = row;
        this.location[1] = col;
    }
    

    public String getIndicies() {
        return Arrays.toString(location);
    }





    // public static void main(String[] args) {
    //     Room myRoom = new Room("Chiashi's Dorm", "This is Chiashi's Dorm");
    //     System.out.println(myRoom);
    // }


}
