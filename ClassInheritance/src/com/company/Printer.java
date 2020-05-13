package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

//    simulate a real world printer, with fields for toner level, number of pages printed, and whether its a duplex printer
//    add methods to full up the toner to 100% and increase the number of pages printed
    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public void printPage(){
        printPage(1);
    }


    public void printPage(int pages){
        int duplexPrint = pages;
        if (this.isDuplex) {
            duplexPrint = ((pages / 2 ) + (pages % 2));

        }
        for (int i = 0; i < pages; i++){
            pagesPrinted += 1;
            tonerLevel -= 5;
            System.out.println("Toner level " + tonerLevel);
            System.out.println("Pages printed " + pagesPrinted);
        }
    }

    public int addToner(int toner){
        if (this.tonerLevel > 0 && (this.tonerLevel + toner <= 100)){
            this.tonerLevel += toner;
            System.out.println("Added toner. Level is now at " + tonerLevel);
            return this.tonerLevel;
        } else {
            System.out.println("Toner wasn't able to be added, please check capacity.");
            return -1;
        }
    }
}
