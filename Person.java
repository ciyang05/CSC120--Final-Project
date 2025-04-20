import java.util.Scanner;


public class Person {
    
    // Attributes
    private String name;
    private Scanner input = new Scanner(System.in);

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Scanner getInput() {
        return input;
    }

    public void talk() {

    }
    
}

