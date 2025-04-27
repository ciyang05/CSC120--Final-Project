public class Ingredient {
    //Attributes 
    private String name;
    private String units;
    private double amount;
    
    public Ingredient(String name, String units, double amount){
        this.name = name;
        this.units = units;
        this.amount = amount;

    }


    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

    public double getAmt() {
        return amount;
    }



    // right now used for debugging
    @Override
    public String toString() {
        return amount + " " + units + " " + "of" + " " + name ;
    }
    
    public static void main(String[] args) {
        Ingredient myMatcha = new Ingredient("Matcha Powder", "teaspoons", 3);
        System.out.println(myMatcha);
    }

}
