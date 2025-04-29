
import java.util.ArrayList;
public class Customer {

    String name;

    
    public Customer(String name) {
        this.name = name;
    }

    

    public void orderDrink(Drink customerDrink) {
        System.out.println("You need to create a");
        System.out.println(customerDrink.getName());
        customerDrink.printIngredients();

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }



}
