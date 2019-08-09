import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    private boolean hasAvocado;
    private boolean hasSecretSauce;


    public HealthyBurger(String meat, double price) {
        super("Brown Rye", meat, price);
    }

    @Override
    public void getAdditions() {

        Scanner scanner = new Scanner(System.in);

        addAvocado(scanner);
        addSecretSauce(scanner);
        super.getAdditions();


        scanner.close();
    }

    public void addAvocado(Scanner scanner) {

        System.out.println("Would you like to add avocado? Please respond Yes or No");

        while (true) {
            String userInput = scanner.next();
            scanner.nextLine();

            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasAvocado = true;
                additionalCosts += addOn;

                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasAvocado = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }


    public void addSecretSauce(Scanner scanner) {

        System.out.println("Would you like to add secret sauce? Please respond Yes or No");

        while (true) {

            String userInput = scanner.next();
            scanner.nextLine();
            if ((userInput.toLowerCase().equals("yes"))) {

                this.hasSecretSauce = true;
                additionalCosts += addOn;


                break;

            } else if ((userInput.toLowerCase().equals("no"))) {

                this.hasSecretSauce = false;

                break;

            } else {
                System.out.println("Input not valid, please respond Yes or No. ");
            }
        }
    }

    @Override
    public void getTotalCost() {
        System.out.println(String.format("Burger: $%.2f", getBasePrice()));

        if (hasAvocado) {
            System.out.println(String.format("+Avocado: $%.2f", addOn));
        }

        if (hasSecretSauce) {
            System.out.println(String.format("+Secret Sauce: $%.2f", addOn));
        }

        if (super.isHasLettuce()) {
            System.out.println(String.format("+Lettuce: $%.2f", addOn));
        }
        if (super.isHasTomato()) {
            System.out.println(String.format("+Tomato: $%.2f", addOn));

        }
        if (super.isHasPickles()) {
            System.out.println(String.format("+Pickles: $%.2f", addOn));

        }
        if (super.isHasCheese()) {
            System.out.println(String.format("+Cheese: $%.2f", addOn));
        }

        System.out.println(String.format("Total Cost =  $%.2f", getBasePrice() + additionalCosts));
    }
}


// Also create two extra varieties of Hamburgers (subclasses) to cater for

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.