package chapter13;

public class DividingByZero {

    public static void main(String args[]){

       try{
           int c = 30/0;
       }catch(ArithmeticException e){
           System.out.println("You can't divide by zero, come on, that is basic math!");
       }finally{
           System.out.println("Division is fun!");
       }
    }

}
