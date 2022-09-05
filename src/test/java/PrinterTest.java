import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 200);
    }

    @Test
    public void checkIfEnoughPaper() {
       assertTrue(String.valueOf(true), printer.printPaper(20, 3));
    }

    @Test
    public void printingReducesPaper(){
        printer.printPaper(10,2);
        assertEquals(80, printer.getSheets());
    }

    @Test
    public void printingReducesToner(){
        printer.printPaper(10, 2);
        assertEquals(180, printer.getToner());
    }







}
