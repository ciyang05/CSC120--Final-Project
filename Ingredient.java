public class Ingredient {
    //Attributes 
    String name;
    String units;
    double amount;
    
    public Ingredient(String name, String units, double amount){
        this.name = name;
        this.units = units;
        this.amount = amount;

    }


    // right now used for debugging
    @Override
    public String toString() {
        return  amount +" " + units + " " + name;
    }
    
}
