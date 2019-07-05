package chapter10.excercises;

public class Banana extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Banana mush is made");
    }

    public Banana(){
        setCalories(77);
    }

    public void peel(){
        System.out.println("You peeled the banana!");
    }
}
