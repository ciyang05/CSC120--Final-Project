import java.util.ArrayList;
import java.util.Random;

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

        

        // Barista.customerIngredient.add(new Ingredient("a", "b", 0));
        // Barista.customerIngredient.add(new Ingredient("a", "b", 0));
        // Barista.customerIngredient.add(new Ingredient("a", "b", 0));
        // Barista.customerIngredient.add(new Ingredient("a", "b", 0));

        System.out.println(Barista.customerIngredient);


        Customer myCustomer = new Customer("Chiashi");
        myCustomer.orderDrink(myDrink);


        Barista myBarista = new Barista("Kiara");

        Barista.customerIngredient = new ArrayList<>();
    

        while (!myBarista.getCustomerIngredient().toString().equals(myDrink.getIngredients().toString())){
            myBarista.move(myDrink);
             
            //System.out.println("Barista is still working");
            if (myBarista.getQuit()){
                //System.out.println("You decided to quit");
                break;
            
        
            }    

            if (myBarista.getCustomerIngredient().toString().equals(myDrink.getIngredients().toString())){
                break;
            }
        
        }
        System.out.println("You completed the game!");

        
    }

        


    public static Drink getRandomDrink(ArrayList<Drink> drinks) {
        Random random = new Random();
        int randomDrinkIndex = random.nextInt(drinks.size());
        Drink randomDrink = drinks.get(randomDrinkIndex);
        return randomDrink;

    }

    public static Drink makeLatte() {
        Drink latte = new Drink("Latte");
        latte.addIngredient("Caramel Syrup", "pumps", 2);
        latte.addIngredient("Brown Sugar", "teaspoons", 10);
        latte.addIngredient("Whole Milk", "Cups", 0.5);
        latte.addIngredient("Espresso", "shots", 2);
        return latte;
    }

    public static Drink makeMatcha() {
        Drink matcha = new Drink("Matcha");
        matcha.addIngredient("Vanilla Syrup", "pumps", 2);
        matcha.addIngredient("Normal Sugar", "teaspoons", 10);
        matcha.addIngredient("Oat Milk", "Cups", 0.5);
        matcha.addIngredient("Matcha Powder", "teaspoons", 3);
        return matcha;
    }

    public static Drink makeAmericano() {
        Drink americano = new Drink("Americano");
        americano.addIngredient("Espresso", "shots", 3);
        americano.addIngredient("Water", "Cups", 0.25);
        americano.addIngredient("Ice", "cubes", 15);
        americano.addIngredient("N/A", "N/A", 0);
        return americano;

    }

}
