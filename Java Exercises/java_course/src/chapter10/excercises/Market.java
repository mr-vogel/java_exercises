package chapter10.excercises;

public class Market {

    public static void main(String[] args){

        Fruit fruit = new Fruit();
        //fruit.makeJuice();

        Apple apple2 = new Apple();
        //System.out.println(apple2.getCalories());
        apple2.removeSeeds();

        Fruit apple = new Apple();
        //System.out.println(apple.getCalories());
        ((Apple) apple).removeSeeds();

        Banana banana = new Banana();
       // System.out.println(banana.getCalories());
        banana.peel();

        Fruit banana2 = new Banana();
       // System.out.println(banana2.getCalories());
        ((Banana) banana2).peel();

        squeeze(apple);
        squeeze(apple2);
        squeeze(fruit);
        squeeze(banana);
        squeeze(banana2);



    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
