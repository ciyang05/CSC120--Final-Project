import java.util.Scanner;
// import java.nio.file.ReadOnlyFileSystemException;
// import java.util.Arrays;


public class Manager extends Person{
    //Attributes
    protected String Berta; //name
    public static Scanner input = new Scanner(System.in); //scanner
    private String question = "When the sun climbs high and thirst grips the realm, what sacred liquid do mortals most often crave to cool their flame—brewed from beans, dark as night?"; //question
    private String correctAnswer = "Cold brew"; //answer
    private Room managerLocation; //getting all the locations (might need to change)


    //Constructor that also gives Berta her positions
    public Manager (String Berta, Room managerLocation) {
        super(Berta);
        // this.x = x;
        // this.y = y;
        this.managerLocation = managerLocation;
    }


    //Checking if the barista is at the same location as manager
    public boolean sameLocation(Barista barista){
        if (barista.getCurrentRoom().equals(managerLocation)){ //if the locations are the same
            return true; //return true
        }
        else{ //if the locations are not the same
            return false; //return false
        }
    }

    // Talk method 
    public void talk(Barista barista, Drink drink){
        if (sameLocation(barista)){ //if the barista's location is the same as the manager

            System.out.println("Manager: I'm Berta, your manager. Answer this trivia question right and you wil get a hint to find the ingredients for your" + drink.getName());//print greeting
            System.out.println("Manager: " + question);//print question

            String response = input.nextLine();//user inputs answer to question

            if (response.trim().equalsIgnoreCase(correctAnswer)){ //if the user's response is the correct answer; IgnoreCase ignores the caps and such
                giveHint(drink); //call the giveHint method which print the clue according to the drink
            }
            else { //if answers is wrong, print wrong
                System.out.println("Wrong answer, no hint for you!");
            }
        }
        else { //if barista is not in the same location as manager, then return nothing
            return;
        }
    }

    //Gives hint according to the drink
    public void giveHint(Drink drink){
        if(drink.getName().equals("Latte")){ //if the drink chosen is the same as matcha
            System.out.println("The ingredients for " + drink.getName() + " are in the "); //give hint
        }
        else if(drink.getName().equals("Matcha")){
            System.out.println("The ingredients for " + drink.getName() + " are in the ");
        }
        else if (drink.getName().equals("Americano")){
            System.out.println("The ingredients for " + drink.getName() + " are in the "); //add drinks as needed, not finished yet
        }
        else{
            return;
        }
    }



    // public static void main(String[] args) {
    //     List<String> mLocations = Arrays.asList("Forest, Pond");
    //     Manager manager = new Manager("Berta", mLocations);
    // }
}

//make a map but for the barrista so it sets the barrista's location