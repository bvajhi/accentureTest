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

}