public class Printer {

    private int sheets;
    private int toner;

    public Printer (int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.toner;
    }


    public boolean printPaper(int numPages, int numCopies) {
        if (this.sheets >= numPages * numCopies) {
            this.sheets -= (numPages * numCopies);
            this.toner -= 1 * (numPages * numCopies);
            return true;
        } else {
            return false;
        }

    }


}
