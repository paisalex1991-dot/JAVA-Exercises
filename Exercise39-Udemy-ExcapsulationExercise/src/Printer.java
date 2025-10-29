public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){

        this.tonerLevel = ((tonerLevel < 0) || (tonerLevel > 100)) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        if((tonerAmount < 0) || (tonerAmount > 100)){
            return -1;
        }
        else if((this.tonerLevel + tonerAmount) > 100){
            return -1;
        }
        else{
            return this.tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages){

        int pagesToPrint = (duplex) ? (pages/2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;


    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
