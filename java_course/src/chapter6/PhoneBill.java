package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;


    public PhoneBill() {
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id) {
        setId(id);
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        int minutesOver = minutesUsed - allottedMinutes;
        double overage = minutesOver * 0.25;
        if(overage > 0){
            return (overage);
        } else {
            overage = 0;
            return overage;
        }
    }


   public double calculateTax(){
        double taxRate = .15;
        return taxRate * (baseCost + calculateOverage());
    }

   public double calculateTotal(){
        return calculateOverage() + calculateTax() + baseCost;
   }

    public void printBill(){
        System.out.println("--- Your phone bill ---");
        System.out.println("ID: " + id);
        System.out.println("Base Cost: $" + String.format("%.2f", baseCost));
        System.out.println("Overage Fees: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }

}







