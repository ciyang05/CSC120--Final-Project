
import java.util.ArrayList;

public class Drink {
String name;
ArrayList<Ingredient>ingredients;

public Drink(String name){
   this.name = name;
   this.ingredients = new ArrayList<>();
}


public void addIngredient(String name, String units, double amount){
    ingredients.add(new Ingredient(name, units, amount));
}
public void printIngredients() {
    System.out.println(name + "Ingredeints:");
    for (Ingredient i: ingredients ){
        System.out.println();
        System.out.println(i);
    }

} 

public static void main(String[] args) {
    //Latte Drink
    Drink latte = new Drink("Latte");
    latte.addIngredient("Caramel Syrup", "pumps", 2);
    latte.addIngredient("Brown Sugar","teaspoons", 10);
    latte.addIngredient("Whole Milk", "Cups", 0.5);
    latte.addIngredient("Espresso", "shots", 2);
    //Mathca Drink
    Drink matcha = new Drink("Matcha");
    matcha.addIngredient("Vanilla Syrup", "pumps", 2);
    matcha.addIngredient("Normal Sugar", "teaspoons", 10);
    matcha.addIngredient("Oat Milk", "Cups", 0.5);
    matcha.addIngredient("Matcha Powder", "teaspoons", 3);
    //Americano Drink
    Drink americano = new Drink("Americano");
    americano.addIngredient("Espresso", "shots", 3);
    americano.addIngredient("Water", "Cups", 0.25);

    latte.printIngredients();
    matcha.printIngredients();
    americano.printIngredients();
}


}