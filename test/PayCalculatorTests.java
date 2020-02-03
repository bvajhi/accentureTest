import com.babysitterinc.PayCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTests {
    @Test
    public void whenTimeIsPassedToCheckStartTimeItReturnTheTime(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals("5:00 PM", payCalculator.convertTimeTo24Hour("5:00 PM"));
    }

}