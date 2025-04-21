// this class will initialize the rooms that barista can go to

public class Room {
    
    // Attributes 
    private String roomName;
    private String description;
    private Ingredient ingre;
    private Ingredient ingre_2;


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
     * constructor with room name, description, and one ingredient
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
     * full constructor for room
     * @param rName
     * @param rDescription
     * @param ingre_1
     * @param ingre_2
     */
    public Room(String rName, String rDescription, Ingredient ingre_1, Ingredient ingre_2) {
        this.roomName = rName;
        this.description = rDescription;
        this.ingre = ingre_1;
        this.ingre_2 = ingre_2;

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
     * accessor for ingredient 1
     * @return ingre
     */
    public Ingredient getIngre() {
        return ingre;
    }

    
    /**
     * accessor for ingredient 2
     * @return ingre_2
     */
    public Ingredient getIngre_2(){
        return ingre_2;
    }


    // right now used for debugging
    /**
     * defines the room object as a string
     * @return roomName
     */
    public String toString() {
        return roomName;
    }

    


}
