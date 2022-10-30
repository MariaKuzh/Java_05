import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

//   6. Напишите алгоритм AreNumbersEqual,
//      который принимает на вход 2 любых int числа,
//      и возвращает
//      0, если числа равны
//      -1, если первое число меньше второго
//      1, если первое число больше второго
//
//    Test Data:
//            89, 89
//    Expected result: 0
//            -89, 89
//    Expected result: -1
//            89, -89
//    Expected result: 1

    //Positive Happy path
    @Test
    public void AreNumbersEqual(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        //act
        int actualResult = new AreNumbersEqual().AreNumbersEqual(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void AreNumbersEqual2(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        //act
        int actualResult = new AreNumbersEqual().AreNumbersEqual(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void AreNumbersEqual3(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;
        //act
        int actualResult = new AreNumbersEqual().AreNumbersEqual(a,b);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
