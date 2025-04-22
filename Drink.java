
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Drink {
String name;
ArrayList<Ingredient>ingredients;
ArrayList<Drink>drinks;

public Drink(String name){
   this.name = name;
   this.ingredients = new ArrayList<>();
   this.drinks = new ArrayList<>();
}

public void addIngredient(String name, String units, double amount){
    ingredients.add(new Ingredient(name, units, amount));
}

public void randomizeDrink(ArrayList<String> drinks, HashMap<String, Drink>drinkMap){


    Random random =  new Random();
    int randomDrinkIndex = random.nextInt(drinks.size());
    String randomDrink = drinks.get(randomDrinkIndex);

    Drink chosenDrink = drinkMap.get(randomDrink);
    System.out.println(randomDrink);
    printIngredients(chosenDrink.getIngredients());
   
}

public static Drink makeLatte(){
    Drink latte = new Drink("Latte");
    latte.addIngredient("Caramel Syrup", "pumps", 2);
    latte.addIngredient("Brown Sugar","teaspoons", 10);
    latte.addIngredient("Whole Milk", "Cups", 0.5);
    latte.addIngredient("Espresso", "shots", 2);
    return latte;
}

public static Drink makeMatcha(){
    Drink matcha = new Drink("Matcha");
    matcha.addIngredient("Vanilla Syrup", "pumps", 2);
    matcha.addIngredient("Normal Sugar", "teaspoons", 10);
    matcha.addIngredient("Oat Milk", "Cups", 0.5);
    matcha.addIngredient("Matcha Powder", "teaspoons", 3);
    return matcha;
}

public static Drink makeAmericano(){
    Drink americano = new Drink("Americano");
    americano.addIngredient("Espresso", "shots", 3);
    americano.addIngredient("Water", "Cups", 0.25);
    return americano;

}

public void printIngredients(ArrayList<Ingredient>ingredients) {
    System.out.println(name +" " + "Ingredients:");
    for (Ingredient ingredient: ingredients ){
        System.out.println(ingredient);
    }

} 

public ArrayList<Ingredient>getIngredients(){
    return ingredients;
}
//Getter for the name
public String getName(){
    return name;
}
public static void main(String[] args) {
    ArrayList<String> drinks = new ArrayList<>();
    HashMap <String, Drink> drinkMap = new HashMap<>();
    //Latte Drink
    
    Drink latte = makeLatte();
    Drink matcha = makeMatcha();
    Drink americano = makeAmericano();

    drinks.add("Latte");
    drinks.add("Matcha");
    drinks.add("Americano");

    drinkMap.put("Latte", latte);
    drinkMap.put("Matcha", matcha);
    drinkMap.put("Americano", americano);

    Drink obj = new Drink("Drink");
    obj.randomizeDrink(drinks, drinkMap);
     
}


}