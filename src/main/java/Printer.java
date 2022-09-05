public class Printer {
    private int paper;
    private int toner;

    public Printer (int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getToner() {
        return this.toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public  void printCopies(int pages, int copies){
        if(copies * pages <= this.paper){
            this.paper -= copies * pages;
            this.toner -= copies * pages ;
        }

    }

}
