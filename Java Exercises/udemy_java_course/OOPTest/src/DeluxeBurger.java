public class DeluxeBurger extends Hamburger {

    private boolean hasChips = true;
    private boolean hasDrink = true;
    private double drinkCost = 1;
    private double chipCost = 1;


    public DeluxeBurger(String rollType, String meat, double price) {
        super(rollType, meat, price);
        additionalCosts = additionalCosts + drinkCost + chipCost;

    }

    @Override
    public void getAdditions() {
        //super.getAdditions();
        additionalCosts = additionalCosts + drinkCost + chipCost;
    }

    @Override
    public void getTotalCost() {
        System.out.println(String.format("Burger: $%.2f", getBasePrice()));

        if (hasChips) {
            System.out.println(String.format("+Chips: $%.2f", chipCost));
        }

        if (hasDrink) {
            System.out.println(String.format("+Drink: $%.2f", drinkCost));
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

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.