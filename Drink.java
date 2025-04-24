
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


}