import java.util.Scanner;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double basePrice;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickles;
    private boolean hasCheese;
    public double additionalCosts = 0;
    public double addOn = .50;

    public Hamburger(String rollType, String meat, double basePrice) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public boolean isHasTomato() {
        return hasTomato;
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public boolean isHasPickles() {
        return hasPickles;
    }

    public void setHasPickles(boolean hasPickles) {
        this.hasPickles = hasPickles;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public void getAdditions(){
        Scanner scanner = new Scanner(System.in);

        addLettuce(scanner);
        addTomato(scanner);
        addPickles(scanner);
        addCheese(scanner);


        scanner.close();
    }

    public void addLettuce(Scanner scanner){

        System.out.println("Would you like to add lettuce? Please respond Yes or No");

        while(true) {
            String userInput = scanner.next();
            scanner.nextLine();
            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasLettuce = true;
                this.additionalCosts += addOn;

                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasLettuce = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }

    public void addTomato(Scanner scanner){

        System.out.println("Would you like to add tomato? Please respond Yes or No");

        while(true) {
            String userInput = scanner.next();
            scanner.nextLine();
            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasTomato = true;
                this.additionalCosts += addOn;

                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasTomato = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }

    public void addPickles(Scanner scanner){

        System.out.println("Would you like to add pickles? Please respond Yes or No");

        while(true) {
            String userInput = scanner.next();
            scanner.nextLine();
            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasPickles = true;
                this.additionalCosts += addOn;

                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasPickles = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }

    public void addCheese(Scanner scanner){

        System.out.println("Would you like to add cheese? Please respond Yes or No");

        while(true) {
            String userInput = scanner.next();
            scanner.nextLine();
            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasCheese = true;
                this.additionalCosts += addOn;

                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasCheese = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }

    public void getTotalCost(){
        System.out.println(String.format("Burger: $%.2f", this.basePrice));

        if(this.hasLettuce){
            System.out.println(String.format("+Lettuce: $%.2f", addOn));
            //System.out.println("+Lettuce: $");
        }
        if(this.hasTomato){
            System.out.println(String.format("+Tomato: $%.2f", addOn));

        }
        if(this.hasPickles){
            System.out.println(String.format("+Pickles: $%.2f", addOn));

        }
        if(this.hasCheese){
            System.out.println(String.format("+Cheese: $%.2f", addOn));
        }

        System.out.println(String.format("Total Cost =  $%.2f", basePrice+additionalCosts));
    }
}



// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.

// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.

// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).

// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.

// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)

// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
