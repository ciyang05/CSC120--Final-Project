// this class will initialize the rooms that barista can go to

public class Room {
    
    // Attributes 
    private String roomName;
    private int n;
    private int e;
    private int s;
    private int w;
    private String description;

    /**
     * constructor for room
     * @param rName
     * @param rDescription
     * @param aN
     * @param aE
     * @param aS
     * @param aW
     */
    public Room(String rName, String rDescription, int aN, int aE, int aS, int aW) {
        this.roomName = rName;
        this.description = rDescription;
        this.n = aN;
        this.e = aE;
        this.s = aS;
        this.w = aW;

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
     * accessor for room exit, north coordinates
     * @return n
     */
    public int getN() {
        return n;
    }

    /**
     * setter or to change values for room exit, north coordinates
     * @param aN
     * @return n
     */
    public int setN(int aN) {
        return this.n = aN;
    }


    /**
     * accessor for room exit, south coordinates
     * @return s
     */
    public int getS() {
        return s;
    }


    /**
     * setter or to change values for room exit, south coordinates 
     * @param aS
     * @return s
     */
    public int setS(int aS) {
        return this.s = aS;
    }


    /**
     * accessor for room exit, east coordinates 
     * @return e
     */
    public int getE() {
        return e;
    }
    

    /**
     * setter or to change values for room exit, east coordinates
     * @param aE
     * @return e
     */
    public int setE(int aE) {
        return this.e = aE;
    }


    /**
     * accessor for room exit, west coordinates
     * @return w
     */
    public int getW() {
        return w;
    }


    /**
     * setter or to change values for room exit, west coordinates 
     * @param aW
     * @return w
     */
    public int setW(int aW) {
        return this.w = aW;
    }


}
