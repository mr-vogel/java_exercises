package chapter9.exercises;

public class TasteTester {

    public static void main(String[] args){

        Cake cake = new Cake("Chocolate");
        cake.setPrice(9.99);
        System.out.println("Cake | Cost: $" + String.format("%.2f", cake.getPrice()) + " | Flavor: " + cake.getFlavor());


        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(10.99);
        System.out.println("Birthday Cake | Cost: $" + String.format("%.2f", birthdayCake.getPrice()) + " | Flavor: " + birthdayCake.getFlavor());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(69.00);
        System.out.println("Wedding Cake | Cost: $" + String.format("%.2f", weddingCake.getPrice()) + " | Flavor: " + weddingCake.getFlavor());


    }
}
