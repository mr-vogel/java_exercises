package chapter10.excercises;

public class Apple extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public Apple(){
        setCalories(35);
    }

    public void removeSeeds(){
        System.out.println("You removed the seeds");
    }
}
