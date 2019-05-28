package com.company;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel, int pages, boolean duplex) {
        if (tonerLevel >=0 && tonerLevel <100 ){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 0;
        }
        this.printedPages = pages;
        this.duplex = duplex;
    }

    public int fillToner(int toner){
        if (tonerLevel >0 && tonerLevel<100){
            if ((this.tonerLevel + toner) >100){
                return -1;
            }
            this.tonerLevel+=toner;
            return this.tonerLevel;
        }
        else{
            return 0;
        }
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if (this.duplex){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.printedPages+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
