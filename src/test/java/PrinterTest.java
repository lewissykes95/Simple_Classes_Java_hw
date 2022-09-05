import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(5);
    }
    
    @Test
    public void checkSheetsLeftAfterPrint() {
        printer.printPaper(2, 2);
        assertEquals(1, printer.sheetsLeft);
    }


//
    @Test
    public void checkIfEnoughPaper() {
       assertTrue(true , printer.printPaper(2, 2));
    }



}
