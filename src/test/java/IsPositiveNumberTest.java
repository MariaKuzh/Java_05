import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    //5. Напишите алгоритм IsPositiveNumber,
    // который возвращает true, если численный
    // параметр больше или равен нулю, и возвращает
    // false, если параметр меньше 0.
    //Проверьте работу метода на числах 555, 0 и -555.

    //Positive Happy path
    @Test
    public void IsPositiveNumber(){
        int a = 555;
        boolean expectedResult = true;
        //act
        boolean actualResult = new IsPositiveNumber().IsPositiveNumber(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IsPositiveNumber2(){
        int a = 0;
        boolean expectedResult = true;
        //act
        boolean actualResult = new IsPositiveNumber().IsPositiveNumber(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IsPositiveNumber3(){
        int a = -555;
        boolean expectedResult = false;
        //act
        boolean actualResult = new IsPositiveNumber().IsPositiveNumber(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
