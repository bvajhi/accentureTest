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

    @Test
    public void whenTimeIsGivenAndFamilyToCalculatePayToShouldProduceTheCorrectResult(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(75, payCalculator.calculatePay("5:00 PM", "10:00 PM", 'A'));
        assertEquals(60, payCalculator.calculatePay("5:00 PM", "10:00 PM", 'B'));
        assertEquals(114, payCalculator.calculatePay("5:00 PM", "11:00 PM", 'C'));
    }

    @Test
    public void whenWrongInputIsGivenToCalculatePayItShouldReturnANegativeNumber(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(-1, payCalculator.calculatePay("5:00 PM", "10:00 PM", 'X'));
        assertEquals(-2, payCalculator.calculatePay("5:00PM", "10:00 PM", 'B'));
        assertEquals(-3, payCalculator.calculatePay("5:00 PM", "11:00PM", 'C'));
    }

    @Test
    public void whenANumberBetween4And16IsPassedIntoIsStartTimeCorrectItShouldReturnFalse(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(false, payCalculator.isStartTimeCorrect(4));
        assertEquals(false, payCalculator.isStartTimeCorrect(12));
    }

    @Test
    public void whenANumberBetween17And3IsPassedIntoIsStartTimeCorrectItShouldReturnTrue(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(true, payCalculator.isStartTimeCorrect(17));
        assertEquals(true, payCalculator.isStartTimeCorrect(2));
    }

    @Test
    public void whenANumberBetween5And16IsPassedIntoIsEndTimeCorrectItShouldReturnFalse(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(false, payCalculator.isStartTimeCorrect(6));
        assertEquals(false, payCalculator.isStartTimeCorrect(12));
    }

    @Test
    public void whenANumberBetween17And4IsPassedIntoIsStartTimeCorrectItShouldReturnTrue(){
        PayCalculator payCalculator = new PayCalculator();
        assertEquals(true, payCalculator.isStartTimeCorrect(17));
        assertEquals(true, payCalculator.isStartTimeCorrect(2));
    }


}