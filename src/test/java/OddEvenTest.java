import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //1. Positive Happy path
    // if (x % 2 != 0)
    //return "Odd";

    @Test
    public void testNumberOdd() {
        //AAA
        //arrange
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(-345);

        //assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    //2. Positive Happy path
    // if (x % 2 == 0)
    //return "Even";
    @Test
    public void testNumberEvenZero() {
        //AAA
        //arrange
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(0);

        //assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    //2.2 Positive Happy path
    // if (x % 2 == 0)
    //return "Even";
    @Test
    public void testNumberEven() {
        //AAA
        //arrange
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(222222);

        //assert
        Assert.assertEquals(actualResult,expectedResult);

    }

}
