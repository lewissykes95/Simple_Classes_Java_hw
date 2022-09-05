public class Printer {

    private int sheetsLeft;


    public Printer (int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int printPaper(int copies, int pages) {
        int sheets = copies * pages;

        if (this.sheetsLeft >= sheets) {
            this.sheetsLeft -= sheets;
            return boolean true;
        }



    }


}
