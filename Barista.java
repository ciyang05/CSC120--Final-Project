import java.util.ArrayList;
import java.util.Scanner;

public class Barista extends Person {
    
    // Attributes 
    private static Scanner input = new Scanner(System.in);
   
    // holds the location of barista 
    private int rowIndex;
    private int colIndex;
   
    // if player enters quit
    private boolean quitFlag = false;

    // related to map 
    private Map myMap;
    private Room currentRoom;
    
    private String answer;

    // will hold ingredients that barista grabs
    private ArrayList<Ingredient> baristaIngre;
   


    /**
     * constructor for barista
     * @param name
     */
    public Barista (String name) {
        super(name);
        this.myMap = new Map();
        this.currentRoom = myMap.getArray_Map()[0][0];
        this.baristaIngre = new ArrayList<>();
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


    /**
     * accesses the map
     * @return bMap
     */
    public Map getMap() {
        return myMap;
    }

    /**
     * accesses the player's current room
     * @return currentRoom
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }


    // public String getAnswer() {
    //     return answer;
    // }


    // public Drink talk() {
    //     if ()
    // } 


    

    // fully works right now!
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
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempRow = getRow() - 1;
            System.out.println("this is tempRow:" + tempRow);
            
            if ((tempRow <= myMap.getMaxRow()) && (tempRow >= myMap.getLeastRow())) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                System.out.println("current colIndex:" + colIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } 
            else {
                System.out.println("invalid tempRow. did not move north");
            }
        }


        if (direction.equals("south")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempRow = getRow() + 1;
            System.out.println("this is tempRow:" + tempRow);
            
            if ((tempRow <= myMap.getMaxRow()) && (tempRow >= myMap.getLeastRow())) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                System.out.println("current colIndex:" + colIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } 
            else {
                System.out.println("invalid tempRow. did not move south");
            }
        }


        if (direction.equals("west")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempCol = getCol() - 1;
            System.out.println("this is tempCol:" + tempCol);
            
            if ((tempCol <= myMap.getMaxCol()) && (tempCol >= myMap.getLeastCol())) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
                System.out.println("current rowIndex:" + rowIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } 
            else {
                System.out.println("invalid tempCol. did not move west");
            }
        }

        
        if (direction.equals("east")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempCol = getCol() + 1;
            System.out.println("this is tempCol:" + tempCol);
            
            if ((tempCol <= myMap.getMaxCol()) && (tempCol >= myMap.getLeastCol())) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
                System.out.println("current rowIndex:" + rowIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } 

            if ((currentRoom.getIndicies().equals("[0, 2]")) || (currentRoom.getIndicies().equals("[1, 2]")) || (currentRoom.getIndicies().equals("[2, 1]"))) {
                System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up?\n If so, type 'grab'.");
                answer = input.nextLine().toLowerCase();
                grabIngre(new Drink("latte"));
            }

            else {
                System.out.println("invalid tempCol. did not move east");
            }

        }
    }


    // not tested yet
    // Drink custDrink is a placeholder for the actual drink that will be passed in as a parameter when using this method
    public void grabIngre(Drink custDrink) {
        // if ((currentRoom.getIndicies() == "[0, 2]") || (currentRoom.getIndicies() == "[1, 2]") || (currentRoom.getIndicies() == "[2, 1]")) {
        //     System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up?\n If so, type 'grab'.");
        //     String answer = input.nextLine().toLowerCase();


            // testing method
            if ((answer.equals("grab")) && (!baristaIngre.contains(custDrink.getIngredients().get(0)))) {
                System.out.println("This is w/out toString: " + custDrink.getIngredients().get(0));
                System.out.println("This is w/toString: " + custDrink.getIngredients().get(0).toString());
                baristaIngre.add(currentRoom.getIngre1());
                System.out.println("This is w/out toString: " + baristaIngre.get(0));
                System.out.println("This is w/toString: " + baristaIngre.get(0));
            }
            if ((answer.equals("grab")) && (!baristaIngre.contains(custDrink.getIngredients().get(1)))) {
                baristaIngre.add(currentRoom.getIngre2());
            }
            if ((answer.equals("grab")) && (!baristaIngre.contains(custDrink.getIngredients().get(2)))) {
                baristaIngre.add(currentRoom.getIngre2());
            }
            if ((answer.equals("grab")) && (!baristaIngre.contains(custDrink.getIngredients().get(3)))) {
                baristaIngre.add(currentRoom.getIngre3());
            }
            if ((answer.equals("grab")) && (!baristaIngre.contains(custDrink.getIngredients().get(4)))) {
                baristaIngre.add(currentRoom.getIngre1());
            }
        }







    // will be in main class
    public String toString() {
        return "Let's get started " + getName() + "! Type 'go' to start your adventure!";
    }




    // debugging purposes
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Barista myBarista = new Barista("Chiashi");
        System.out.println(myBarista);
        String startGame = input.nextLine().toLowerCase();
        if (startGame.equals("go")) {

            // while it is false, once it is true = breaks loop
            while (!myBarista.getQuit()) {
                myBarista.move();
            }
        } else {
            System.out.println("Try answering again. Please enter 'go' or 'Go'");
            String start = input.nextLine();
        }

    }

    


}