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

}