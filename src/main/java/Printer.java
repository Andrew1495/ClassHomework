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

    public  void printCopies(int copies){
        if(copies <= this.paper){
            this.paper -= copies;
            this.toner -= copies;
        }

    }

}
