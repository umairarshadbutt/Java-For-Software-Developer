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

    public int printPages(int pages){
        int pagesToPrint=pages;
        if (this.duplex){
            pagesToPrint = (pages/2) + (pages%2);
        }
        this.printedPages+=pagesToPrint;
        return pagesToPrint;
    }



}
