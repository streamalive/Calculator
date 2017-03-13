import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class) //указываем, что тест будет с таймаутом
public class testCalculator {

    //отдельный мудреный метод
    @Parameterized.Parameters
    public static Collection dataSumm() {
        Object[][] data = new Object[][]{
                {5, 4, 9},
                {3, 3, 6},
                {7, 8, 15},

        };
        return Arrays.asList(data);
    }

    int x1, x2, result;

    public testCalculator(int x1, int x2, int result) {
        this.x1 = x1;
        this.x2 = x2;
        this.result = result;
    }

    // 2 простых метода
    @Test(timeout = 1000) // время в которое должен уложиться тест
    public void getSummTest() {
        calculator calc = new calculator();
        int actualSumm = calc.getSumm(x1, x2);
        int expectedSumm = result;

        Assert.assertEquals("method getSumm is not valid", expectedSumm, actualSumm);
    }

    @After
    public void printMessage() {
        System.out.println("test passed");
    }
/*
    @Test
    public void getMinusTest() {
        calculator calc = new calculator();

        Assert.assertEquals("method getMinus is not valid", 4, calc.getMinus(8, 4));
    }
*/
}
