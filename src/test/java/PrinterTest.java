import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(10, 30);
    }
    @Test
    public void hasPaper(){
        assertEquals(10, printer.getPaper());
    }
    @Test
    public void printCopiesTrue(){
        printer.printCopies(5);
        assertEquals(5, printer.getPaper());
    }
    @Test
    public void printCopiesFalse(){
        printer.printCopies(20);
        assertEquals(10, printer.getPaper());
    }
    @Test
    public void hasToner(){
        assertEquals(30, printer.getToner());
    }

    @Test
    public void minusToner(){
        printer.printCopies(10);
        assertEquals(20, printer.getToner());
    }
    @Test
    public void noChangeToner(){
        printer.printCopies(40);
        assertEquals(30, printer.getToner());
    }

}
