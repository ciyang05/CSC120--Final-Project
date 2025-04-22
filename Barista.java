// import java.util.ArrayList;
import java.util.Scanner;

public class Barista extends Person {
    
    // Attributes 
    private static Scanner input = new Scanner(System.in);
   
    // holds the location of barista 
    private int rowIndex;
    private int columnIndex;

   
    /**
     * constructor for barista
     * @param name
     */
    public Barista (String name) {
        super(name);
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
    public int getColum() {
        return columnIndex;
    }


    // public int setRow(){
    //     this.rowIndex;
    // }
    

    public void move() {
        System.out.println("You are facing south" + "\n" + "Where would you like to go? Your options are north, east, south, or west.");
        String direction = input.nextLine();
        if (direction.equals("north") || direction.equals("west")) {
            System.out.println("You cannot move in this direction.");
        } else {
            rowIndex = getArray_Map()
        }
    }

    

    // will be in main class
    public String toString() {
        return "Let's get started " + getName() + "! Type 'go' to start your adventure!";
    }


    // debugging purposes
    // public static void main(String[] args) {
    //     System.out.println("Welcome to the game! Enter the name for your barista!");
    //     String barista_name = input.nextLine();
    //     Barista myBarista = new Barista(barista_name);
    //     System.out.println(myBarista);
    //     String startGame = input.nextLine();
    //     if (startGame.equals("go") || startGame.equals("Go")) {
    //         myBarista.move();
    //     } else {
    //         System.out.println("Try answering again. Please enter 'go' or 'Go'");
    //         String start = input.nextLine();
    //     }

    // }


}