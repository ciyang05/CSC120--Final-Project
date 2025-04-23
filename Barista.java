// import java.util.ArrayList;
import java.util.Scanner;

public class Barista extends Person {
    
    // Attributes 
    private static Scanner input = new Scanner(System.in);
   
    // holds the location of barista 
    private int rowIndex = 0;
    private int colIndex = 0;
    // bounds of the rows and columns 
    private int maxRow = 2;
    private int maxCol = 2;
    // if player enters quit
    private boolean quitFlag = false;

    private Map bMap = new Map();

    private boolean hasIngredients;

   
    /**
     * constructor for barista
     * @param name
     */
    public Barista (String name, int startRow, int startCol) {
        super(name);
        this.rowIndex = startRow;
        this.colIndex = startCol;
    }


    /**
     * accessor for row index, which row barista is at
     * @return rowIndex
     */
    public int getRow() {
        return rowIndex;
    }


    /**
     * accessor for column index, which column barista is at
     * @return columnIndex
     */
    public int getCol() {
        return colIndex;
    }


    /**
     * accesses boolean value of quitFlag
     * @return quitFlag
     */    
    public boolean getQuit() {
        return quitFlag;
    }



    public Map getMap() {
        return bMap;
    }
    

    
    public void move() {
        System.out.println("Where would you like to go? Your options are north, east, south, or west.");
        System.out.println("If you would like to quit the game, type 'quit'.");
        String direction = input.nextLine().toLowerCase();

        if (direction.equals("quit")) {
            quitFlag = true;
            System.out.println("Thanks for playing!");
            return;
        }


        if (direction.equals("north")) {
            int tempRow = getRow() - 1;
            System.out.println("this is tempRow:" + tempRow);
            if ((tempRow <= maxRow) && (tempRow >= 0)) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                Room currentRoom = bMap.getArray_Map()[rowIndex][getCol()];
                System.out.println("You are now in room" + currentRoom.toString());
            } 
            else {
                System.out.println("invalid tempRow. did not move north");
            }
        }


        if (direction.equals("south")) {
            int tempRow = getRow() + 1;
            System.out.println("this is tempRow:" + tempRow);
            if ((tempRow <= maxRow) && (tempRow >= 0)) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                Room currentRoom = bMap.getArray_Map()[rowIndex][getCol()];
                System.out.println("You are now in room" + currentRoom.toString())
            } 
            else {
                System.out.println("invalid tempRow. did not move south");
            }
        }


        if (direction.equals("west")) {
            int tempCol = getCol() - 1;
            System.out.println("this is tempCol:" + tempCol);
            if ((tempCol <= maxCol) && (tempCol >= 0)) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
            } 
            else {
                System.out.println("invalid tempCol. did not move west");
            }
        }

        
        if (direction.equals("east")) {
            int tempCol = getCol() + 1;
            System.out.println("this is tempCol:" + tempCol);
            if ((tempCol <= maxCol) && (tempCol >= 0)) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
            } 
            else {
                System.out.println("invalid tempCol. did not move east");
            }
        }
    }



    

    // will be in main class
    public String toString() {
        return "Let's get started " + getName() + "! Type 'go' to start your adventure!";
    }




    // debugging purposes
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Map myMap = new Map();
        String startGame = input.nextLine().toLowerCase();
        if (startGame.equals("go")) {

            // while it is false, once it is true = breaks loop
            while (!getBarista().getQuit()) {
                getBarista().move();
            }
        } else {
            System.out.println("Try answering again. Please enter 'go' or 'Go'");
            String start = input.nextLine();
        }

    }

    // 


}