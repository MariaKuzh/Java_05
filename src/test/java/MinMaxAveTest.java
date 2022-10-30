import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {


//    8. Написать алгоритм MinMaxAve, который принимает
//    массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение,
//    максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    //Positive Happy path
    @Test
    public void MinMaxAve(){
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int indexStart = 2;
        int indexEnd = 6;
        int[] expectedResult = {3, 7, 5};
        //act
        int[] actualResult = new MinMaxAve().MinMaxAve(array,indexStart,indexEnd);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
