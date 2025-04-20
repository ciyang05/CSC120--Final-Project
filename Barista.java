// import java.util.ArrayList;
import java.util.Scanner;

public class Barista extends Person {
    
    // Attributes 
    private static Scanner input = new Scanner(System.in);

    public Barista (String name) {
        super(name);
    }

    public void move() {
        System.out.println("You are facing south" + "\n" + "Where would you like to go? You can move north, east, south, or west.");
        input.nextLine();

        // let player know what direction they are in
    }

    public String toString() {
        return "Let's get started " + this.name + "! Type 'go' to start your adventure!";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the game! Enter the name for your barista!");
        String barista_name = input.nextLine();
        Barista myBarista = new Barista(barista_name);
        System.out.println(myBarista);
        String startGame = input.nextLine();
        if (startGame.equals("go") || startGame.equals("Go")) {
            myBarista.move();
        } else {
            System.out.println("Try answering again. Please enter 'go' or 'Go'");
            String start = input.nextLine();
        }

    }


    // hash table w/string as the key and the value is another hashtable that has each ingredient and how much of it is needed to make that drink
    // another hash table that is returned
    // makeDrink would take in the key of the hash table 
    // big menu - the  
    // little menu - 
}