import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cafe {

    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<>();
        // Latte Drink

        Drink latte = makeLatte();
        Drink matcha = makeMatcha();
        Drink americano = makeAmericano();

        drinks.add(latte);
        drinks.add(matcha);
        drinks.add(americano);

        Drink myDrink = getRandomDrink(drinks);


        Customer myCustomer = new Customer("Chiashi");
        myCustomer.orderDrink(myDrink);


        Barista myBarista = new Barista("Kiara");

        Barista.customerIngredient = new ArrayList<>();
    
        // Loop checks if customer ingredients are equal to drink ingredients
        while (!Barista.getCustomerIngredient().toString().equals(myDrink.getIngredients().toString())){ 
            help();
            myBarista.move(myDrink); // Allows barista(player) to move through cafe
             
            //System.out.println("Barista is still working");
            if (myBarista.getQuit()){ // Exits game if player wants to quit
                //System.out.println("You decided to quit");
                break;
            
        
            }    

            if (Barista.getCustomerIngredient().toString().equals(myDrink.getIngredients().toString())){
                break;
            }
        
        }
        // Loop ends once customer ingredients are equal to drink ingredients
        System.out.println("You completed the game!");

        
    }

        
    /**
     * Randomizes customer's drink order
     * @param drinks
     * @return randomDrink
     */

    public static Drink getRandomDrink(ArrayList<Drink> drinks) {
        Random random = new Random();
        int randomDrinkIndex = random.nextInt(drinks.size());
        Drink randomDrink = drinks.get(randomDrinkIndex);
        return randomDrink;

    }

    /**
     * makes a new drink "latte"
     * @return Drink latte
     */

    public static Drink makeLatte() {
        Drink latte = new Drink("Latte");
        latte.addIngredient("Caramel Syrup", "pumps", 2);
        latte.addIngredient("Brown Sugar", "teaspoons", 10);
        latte.addIngredient("Whole Milk", "Cups", 0.5);
        latte.addIngredient("Espresso", "shots", 2);
        return latte;
    }
    /**
     * makes a new drink "matcha"
     * @return Drink matcha
     */
    public static Drink makeMatcha() {
        Drink matcha = new Drink("Matcha");
        matcha.addIngredient("Vanilla Syrup", "pumps", 2);
        matcha.addIngredient("Normal Sugar", "teaspoons", 10);
        matcha.addIngredient("Oat Milk", "Cups", 0.5);
        matcha.addIngredient("Matcha Powder", "teaspoons", 3);
        return matcha;
    }

    /**
     * makes a new drink "americano"
     * @return Drink americano
     */

    public static Drink makeAmericano() {
        Drink americano = new Drink("Americano");
        americano.addIngredient("Espresso", "shots", 3);
        americano.addIngredient("Water", "Cups", 0.25);
        americano.addIngredient("Ice", "cubes", 15);
        americano.addIngredient("N/A", "N/A", 0);
        return americano;

    }

    /**
     * Method to display instructions if user needs help
     */
    public static void help(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("If you need help type help");
    String helpVar = scanner.nextLine();
     
    if (helpVar.equals("help")){
        System.out.println("What do you need help with: \n 1: Directions \n 2: Commands \n 3. Quit");
        String userOption = scanner.nextLine();
        if (userOption.equals("1")){
            System.out.println("To go south input south \n to go north input north \n to go east input east \n to go west input west");
        }
        if (userOption.equals("2")){
            System.out.println("To grab input grab\n to make drink input drink \n to hand drink input hand");
        }
        if (userOption.equals("3")){
            System.out.println("To quit game input quit or complete the game through making the correct drink");
        }

    
    }
   
}

}
