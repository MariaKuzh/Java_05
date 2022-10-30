import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

//    4. Напишите алгоритм BiggerValue, который из двух
//    параметров типа int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

    //Positive Happy path
    @Test
    public void BiggerValueNumber(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        //act
        int actualResult = new BiggerValue().BiggerValue(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void BiggerValueNumber2(){
        int a = 9999;
        int b = 9999;
        int expectedResult = 9999;
        //act
        int actualResult = new BiggerValue().BiggerValue(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void BiggerValueNumber3(){
        int a = 10000;
        int b = 9999;
        int expectedResult = 10000;
        //act
        int actualResult = new BiggerValue().BiggerValue(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
