import com.babysitterinc.PayCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTests {
    @Test
    public void whenTimeIsPassedToConvertTimeTo24HourItConvertsTheTimeTo24Hr(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals("17:00", payCalculator.convertTimeTo24Hour("5:00 PM"));
        assertEquals("05:00", payCalculator.convertTimeTo24Hour("5:00 AM"));
    }

    @Test
    public void whenStartAndEndHoursArePassedIntoCalculatePayForFamilyAItShouldCalculateTheCorrectResult(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(75, payCalculator.calculatePayForFamilyA(17,22));
        assertEquals(150, payCalculator.calculatePayForFamilyA(17,26));
        assertEquals(80, payCalculator.calculatePayForFamilyA(24,28));

    }

    @Test
    public void whenStartAndEndHoursArePassedIntoCalculatePayForFamilyBItShouldCalculateTheCorrectResult(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(60, payCalculator.calculatePayForFamilyB(17,22));
        assertEquals(68, payCalculator.calculatePayForFamilyB(17,23));
        assertEquals(8, payCalculator.calculatePayForFamilyB(22,23));
        assertEquals(24, payCalculator.calculatePayForFamilyB(23,25));

    }

    @Test
    public void whenStartAndEndHoursArePassedIntoCalculatePayForFamilyCItShouldCalculateTheCorrectResult(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(84, payCalculator.calculatePayForFamilyC(17,21));
        assertEquals(60, payCalculator.calculatePayForFamilyC(22,26));
        assertEquals(114, payCalculator.calculatePayForFamilyC(17,23));

    }

    @Test
    public void whenTimeIsGivenToAdjustTimeItAdjustsTime(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(28, payCalculator.adjustTime(4));
        assertEquals(23, payCalculator.adjustTime(23));

    }



}