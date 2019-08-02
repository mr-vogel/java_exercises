public class Printer {

    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel < 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numOfPagesPrinted = 0;
    }


    public int fillToner(int amount){
        if(amount > 0 && amount <= 100){
            if(this.tonerLevel + amount > 100){
                return -1;
            } else {
                this.tonerLevel += amount;
                return this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int print(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing double sided");
        }
        this.numOfPagesPrinted += pagesToPrint;
        return pagesToPrint;

    }


    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

}


/*
        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer

        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).

        // Add methods to fill up the toner (up to a maximum of 100%)
        // Add another method to simulate printing a page (which should increase the number of pages printed).

        // Decide on the scope, whether to use constructors, and anything else you think is needed.
 */