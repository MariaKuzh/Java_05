import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    //1.10. Написать метод countEvenValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество четных чисел в этом массиве


    @Test
    public void countEvenValuesInArrayTest(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int expectedResult = 4;
        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.11 Написать метод countOddValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество нечетных чисел в этом массиве

    @Test
    public void countOddValuesInArrayTest(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int expectedResult = 4;
        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.12 В классе ManipulationsWithArrays написать
    // метод areValuesGreaterThanNumber(), который принимает
    // на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы
    // массива больше number, иначе возвращает false




}
