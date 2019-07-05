package chapter6;

/*So, a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used.
  And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.

  And then, it should also be able to print an itemized bill.

  You should also include three constructors
    - a default one
    - one that accepts the ID only
    - one that accepts all fields
  Now no matter which of these constructors you use, all fields should be set eventually.

  Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.*/


public class PhoneBillCalculator {

   // private Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        //PhoneBill phoneBill = new PhoneBill();
        //PhoneBill phoneBill = new PhoneBill(1234);
        PhoneBill phoneBill = new PhoneBill(133669, 87.50, 100, 145);




        phoneBill.printBill();




    }
}

