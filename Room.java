// this class will initialize the rooms that barista can go to

public class Room {
    
    // Attributes 
    private String roomName;
    private String description;
    private Ingredient ingre;
    private Person aPerson;
    private [][] location;


    /**
     * constructor with room name, room description, and person
     * @param rName
     * @param rDescription
     * @param anyPerson
     */
    public Room(String rName, String rDescription, Person anyPerson) {
        this.roomName = rName;
        this.description = rDescription;
        this.aPerson = anyPerson;
    }


    /**
     * constructor with just room name and description, for when room does not have ingredients 
     * @param rName
     * @param rDescription
     */
    public Room(String rName, String rDescription) {
        this.roomName = rName;
        this.description = rDescription;
    }


    /**
     * full constructor for room
     * @param rName
     * @param rDescription
     * @param ingre_1
     */
    public Room(String rName, String rDescription, Ingredient ingre_1) {
        this.roomName = rName;
        this.description = rDescription;
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
     * accessor for room description
     * @return description
     */
    public String getDescrip() {
        return description;
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
        return "You are in " + this.roomName + this.description;
    }
    



    public static void main(String[] args) {
        Room myRoom = new Room("Chiashi's Dorm", "This is Chiashi's Dorm");
        System.out.println(myRoom);
    }


}
