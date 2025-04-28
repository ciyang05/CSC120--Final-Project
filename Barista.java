import java.util.ArrayList;
import java.util.Scanner;

public class Barista extends Person {
    
    // Attributes 
    private static Scanner input = new Scanner(System.in);
   
    // holds the location of barista 
    private int rowIndex;
    private int colIndex;
   
    // if player enters quit
    private boolean quitFlag = false;

    // related to map 
    private Map myMap;
    private Room currentRoom;
    
    private String answer;

    // barista/player's inventory, will hold ingredients that barista grabs
    private static ArrayList<Ingredient> baristaIngre;

    private Drink myDrink;

    private static Drink custDrink;
   


    /**
     * constructor for barista
     * @param name
     */
    public Barista (String name) {
        super(name);
        this.myMap = new Map();
        this.currentRoom = myMap.getArray_Map()[0][0];
        Barista.baristaIngre = new ArrayList<>();
    }


    /**
     * accessor for row index, which row barista is at
     * @return rowIndex
     */
    public int getRow() {
        return rowIndex;
    }

    /**
     * accessor for column index, which column barista is at
     * @return columnIndex
     */
    public int getCol() {
        return colIndex;
    }

    /**
     * accesses boolean value of quitFlag
     * @return quitFlag
     */    
    public boolean getQuit() {
        return quitFlag;
    }

    /**
     * accesses the map
     * @return bMap
     */
    public Map getMap() {
        return myMap;
    }

    /**
     * accesses the player's current room
     * @return currentRoom
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * accesses the player's current answer
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * accesses barista's inventory 
     * @return baristaIngre
     */
    public static ArrayList <Ingredient> getBaristaIngre() {
        return baristaIngre;
    }


    // Works!!
    /**
     * lets barista talk with manager 
     * @param Berta
     */
    public void talk(Manager Berta) {
        System.out.println("You come across Oak & Ember Cafe's notorious manager, Berta.");
        Berta.talk(this, custDrink);
    } 


    // Works!
    /**
     * makes the drink that customer ordered
     * @param drink
     */
    public void makeDrink(Drink custDrink) {
        if ((baristaIngre.toString().equals(custDrink.getIngredients().toString()))) {
            System.out.println("Congrats! You have collected the correct ingredients for a " + custDrink.getName() + ". To make the drink, type 'make.'");
            answer = input.nextLine().toLowerCase();
            
            if (answer.equals("make")) {
                System.out.println("One " + custDrink.getName() + " coming right up!");
                
                if (custDrink.getName().equals("Latte")) {
                    System.out.println("Making latte...");
                    myDrink = Cafe.makeLatte();
                    System.out.println(myDrink.getName() + " created. To hand the drink to the customer, type 'hand.'");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("hand")) {
                        handDrink(myDrink);
                    }
                }
                if (custDrink.getName().equals("Matcha")) {
                    System.out.println("Making matcha...");
                    myDrink = Cafe.makeMatcha();
                    System.out.println(myDrink.getName() + " created. To hand the drink to the customer, type 'hand.'");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("hand")) {
                        handDrink(myDrink);
                    }
                    
                }
                if (custDrink.getName().equals("Americano")) {
                    System.out.println("Making americano...");
                    myDrink = Cafe.makeAmericano();
                    System.out.println(myDrink.getName() + " created. To hand the drink to the customer, type 'hand.'");
                    answer = input.nextLine().toLowerCase();
                    if (answer.equals("hand")) {
                        handDrink(myDrink);
                    }
                }

            } else {
                System.out.println("You did not type 'make.' Try again.");
            }
        }
    }
    

    // works!
    /**
     * "hand" drink to customer
     * @param drink
     */
    public void handDrink(Drink drink) {
        System.out.println("Barista: Here is your " + drink.getName() + "! Enjoy!");
    }


    // fully works now!
    /**
     * allows player (barista) to move
     */
    public void move(Drink custDrink) {
        
        System.out.println("Where would you like to go? Your options are north, east, south, or west.");
        System.out.println("If you would like to quit the game, type 'quit'.");
        String direction = input.nextLine().toLowerCase();

        if (direction.equals("quit")) {
            quitFlag = true;
            System.out.println("Thanks for playing!");
            return;
        }


        if (direction.equals("north")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempRow = getRow() - 1;
            System.out.println("this is tempRow:" + tempRow);
            
            if ((tempRow <= myMap.getMaxRow()) && (tempRow >= myMap.getLeastRow())) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                System.out.println("current colIndex:" + colIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } else {
                System.out.println("invalid tempRow. did not move north");
            }


            if ((currentRoom.getIndicies().equals("[0, 2]")) || (currentRoom.getIndicies().equals("[1, 2]")) || (currentRoom.getIndicies().equals("[2, 1]"))) {
                System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up? If so, type 'grab'.");
                answer = input.nextLine().toLowerCase();

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[0, 2]"))) {
                    Drink latte = Cafe.makeLatte();
                    grabIngre(latte);
                    makeDrink(latte);
                }

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[1, 2]"))) {
                    Drink americano = Cafe.makeAmericano();
                    grabIngre(americano);
                    makeDrink(americano);
                }
                
                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[2, 1]"))) {
                    Drink matcha = Cafe.makeMatcha();
                    grabIngre(matcha);
                    makeDrink(matcha);
                }

        }
        if ((currentRoom.getIndicies().equals("[1, 1]"))) {
            talk(new Manager("Berta", myMap, 1, 1));
        } else if ((currentRoom.getIndicies().equals("[2, 2]"))) {
            talk(new Manager("Berta", myMap, 2, 2));
        }
        
    }

        if (direction.equals("south")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempRow = getRow() + 1;
            System.out.println("this is tempRow:" + tempRow);
            
            if ((tempRow <= myMap.getMaxRow()) && (tempRow >= myMap.getLeastRow())) {
                System.out.println("valid tempRow");
                rowIndex = tempRow;
                System.out.println("new rowIndex:" + rowIndex);
                System.out.println("current colIndex:" + colIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } else {
                System.out.println("invalid tempRow. did not move south");
            }

            if ((currentRoom.getIndicies().equals("[0, 2]")) || (currentRoom.getIndicies().equals("[1, 2]")) || (currentRoom.getIndicies().equals("[2, 1]"))) {
                System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up? If so, type 'grab'.");
                answer = input.nextLine().toLowerCase();

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[0, 2]"))) {
                    Drink latte = Cafe.makeLatte();
                    grabIngre(latte);
                    makeDrink(latte);
                }

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[1, 2]"))) {
                    Drink americano = Cafe.makeAmericano();
                    grabIngre(americano);
                    makeDrink(americano);
                }
                
                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[2, 1]"))) {
                    Drink matcha = Cafe.makeMatcha();
                    grabIngre(matcha);
                    makeDrink(matcha);
                }
        }

        if ((currentRoom.getIndicies().equals("[1, 1]"))) {
            talk(new Manager("Berta", myMap, 1, 1));
        } else if ((currentRoom.getIndicies().equals("[2, 2]"))) {
            talk(new Manager("Berta", myMap, 2, 2));
        }

    }


        if (direction.equals("west")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempCol = getCol() - 1;
            System.out.println("this is tempCol:" + tempCol);
            
            if ((tempCol <= myMap.getMaxCol()) && (tempCol >= myMap.getLeastCol())) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
                System.out.println("current rowIndex:" + rowIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } else {
                System.out.println("invalid tempRow. did not move south");
            }

            if ((currentRoom.getIndicies().equals("[0, 2]")) || (currentRoom.getIndicies().equals("[1, 2]")) || (currentRoom.getIndicies().equals("[2, 1]"))) {
                System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up? If so, type 'grab'.");
                answer = input.nextLine().toLowerCase();

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[0, 2]"))) {
                    Drink latte = Cafe.makeLatte();
                    grabIngre(latte);
                    makeDrink(latte);
                }

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[1, 2]"))) {
                    Drink americano = Cafe.makeAmericano();
                    grabIngre(americano);
                    makeDrink(americano);
                }
                
                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[2, 1]"))) {
                    Drink matcha = Cafe.makeMatcha();
                    grabIngre(matcha);
                    makeDrink(matcha);
                }

        }

        if ((currentRoom.getIndicies().equals("[1, 1]"))) {
            talk(new Manager("Berta", myMap, 1, 1));
        } else if ((currentRoom.getIndicies().equals("[2, 2]"))) {
            talk(new Manager("Berta", myMap, 2, 2));
        }

    }

        
        if (direction.equals("east")) {
            System.out.println("The indicies before moving are " + currentRoom.getIndicies());
            int tempCol = getCol() + 1;
            System.out.println("this is tempCol:" + tempCol);
            
            if ((tempCol <= myMap.getMaxCol()) && (tempCol >= myMap.getLeastCol())) {
                System.out.println("valid tempCol");
                colIndex = tempCol;
                System.out.println("new colIndex:" + colIndex);
                System.out.println("current rowIndex:" + rowIndex);
                currentRoom = myMap.getArray_Map()[rowIndex][colIndex];
                System.out.println(currentRoom.toString());
                System.out.println("Current room indicies" + currentRoom.getIndicies());
            } else {
                System.out.println("invalid tempCol. did not move east");
            }

            if ((currentRoom.getIndicies().equals("[0, 2]")) || (currentRoom.getIndicies().equals("[1, 2]")) || (currentRoom.getIndicies().equals("[2, 1]"))) {
                System.out.println("The " + currentRoom.getName() + " has ingredients for a drink. Would you like to pick it up? If so, type 'grab'. If not, type 'no'.");
                answer = input.nextLine().toLowerCase();

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[0, 2]"))) {
                    Drink latte = Cafe.makeLatte();
                    grabIngre(latte);
                    finished(latte);
                }

                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[1, 2]"))) {
                    Drink americano = Cafe.makeAmericano();
                    grabIngre(americano);
                    makeDrink(americano);
                }
                
                if ((answer.equals("grab")) && (currentRoom.getIndicies().equals("[2, 1]"))) {
                    myDrink = Cafe.makeMatcha();
                    grabIngre(myDrink);
                    makeDrink(myDrink);
                }
            
            }

            if ((currentRoom.getIndicies().equals("[1, 1]"))) {
                talk(new Manager("Berta", myMap, 1, 1));
            } else if ((currentRoom.getIndicies().equals("[2, 2]"))) {
                talk(new Manager("Berta", myMap, 2, 2));
            }

        }
                
    }



    // works
    // Drink custDrink is a placeholder for the actual drink that will be passed in as a parameter when using this method
    /**
     * allows player (barista) to grab ingredients 
     * @param custDrink
     */
    public void grabIngre(Drink custDrink) {

            // testing method
            // System.out.println("These are the ingredients you will need to pick up " + custDrink.getIngredients()); // w/this method, the ingredients list is empty
            if ((!baristaIngre.contains(custDrink.getIngredients().get(0)))) {
                // System.out.println("This is w/out toString: " + custDrink.getIngredients().get(0));
                // System.out.println("This is w/toString: " + custDrink.getIngredients().get(0).toString());
                
                baristaIngre.add(currentRoom.getIngre1());
                // System.out.println("This is w/out toString: " + baristaIngre.get(0));
                // System.out.println("This is w/toString: " + baristaIngre.get(0).toString());
                // System.out.println(baristaIngre.toString());
            }

            if ((!baristaIngre.contains(custDrink.getIngredients().get(1)))) {
                // System.out.println("This is w/out toString: " + custDrink.getIngredients().get(1));
                // System.out.println("This is w/toString: " + custDrink.getIngredients().get(1).toString());
                
                baristaIngre.add(currentRoom.getIngre2());
                // System.out.println("This is w/out toString: " + baristaIngre.get(1));
                // System.out.println("This is w/toString: " + baristaIngre.get(1).toString());
                // System.out.println(baristaIngre.toString());

            }

            if ((!baristaIngre.contains(custDrink.getIngredients().get(2)))) {
                // System.out.println("This is w/out toString: " + custDrink.getIngredients().get(2));
                // System.out.println("This is w/toString: " + custDrink.getIngredients().get(2).toString());

                baristaIngre.add(currentRoom.getIngre3());
                // System.out.println("This is w/out toString: " + baristaIngre.get(2));
                // System.out.println("This is w/toString: " + baristaIngre.get(2).toString());
                // System.out.println(baristaIngre.toString());
            }

            if ((!baristaIngre.contains(custDrink.getIngredients().get(3)))) {
                // System.out.println("This is w/out toString: " + custDrink.getIngredients().get(3));
                // System.out.println("This is w/toString: " + custDrink.getIngredients().get(3).toString());

                baristaIngre.add(currentRoom.getIngre4());
                // System.out.println("This is w/out toString: " + baristaIngre.get(3));
                // System.out.println("This is w/toString: " + baristaIngre.get(3).toString());
                System.out.println("Updated inventory: " + baristaIngre.toString());
            }

        }


    // works, just not sure when to implement. possibly in game loop?
    /**
     * allows player (barista) to drop ingredients
     */
    public void dropIngre() {
        System.out.println("If you would like to drop your ingredients, type 'drop'.");
        answer = input.nextLine().toLowerCase();
        System.out.println("This is your current inventory: " + baristaIngre.toString());

        if ((answer.equals("drop")) && (!baristaIngre.isEmpty())) {
            baristaIngre.removeIf(n -> true); // removes ingredients according to parameter
            System.out.println("You have dropped all of your ingredients!");
            System.out.println("Updated inventory: " + baristaIngre.toString());
        } else {
            System.out.println("Guess you don't want to drop your ingredients!");
        }

    }


    // public void checkInven(Drink custDrink) {
    //     pass;
    // }

    public void finished(Drink custDrink) {
        if ((currentRoom.getIndicies().equals("[0, 0]")) && (baristaIngre.toString().equals(custDrink.getIngredients().toString()))) {
            makeDrink(custDrink);
        } else {
            System.out.println("Looks like you are not back at the Cafe. Find your way back to make the " + custDrink.getName());
        }
    }



    // will be in main class
    public String toString() {
        return "Let's get started " + getName() + "! Type 'go' to start your adventure!";
    }




    // debugging purposes
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Barista myBarista = new Barista("Chiashi");
        System.out.println(myBarista);
        String startGame = input.nextLine().toLowerCase();
        if (startGame.equals("go")) {

            // while it is false, once it is true = breaks loop
            while (!myBarista.getQuit()) {
                myBarista.move(custDrink);
            }
        } else {
            System.out.println("Try answering again. Please enter 'go' or 'Go'");
            String start = input.nextLine();
        }

    }

    


}