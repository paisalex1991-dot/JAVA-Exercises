public class Printer {

    private int tonerLevel = 40;
    private int pagesPrinted;
    private boolean duplex =true;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        if (((this.tonerLevel += tonerAmount) > 100) || ((this.tonerLevel += tonerAmount) < 0)){
            return -1;
        }
        else{
            return this.tonerLevel += tonerAmount;
        }

    }

    public int printPages(int pages){



        int jobPages = (duplex) ? (pages/2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

        }






    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
