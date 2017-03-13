import org.junit.Assert;
import org.junit.Test;

public class testCalculator {

    @Test
    public void getSummTest() {
        calculator calc = new calculator();
        int actualSumm = calc.getSumm(4, 8);
        int expectedSumm = 12;

        Assert.assertEquals("method getSumm is not valid", expectedSumm, actualSumm);
    }
}
