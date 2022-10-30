import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    //1.5. Написать метод multiplуArrayByNumber(),
    // который принимает на вход массив целых чисел
    // и число int number. Метод возвращает массив
    // тех же чисел, умноженных на number

    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    @Test
    public void multiplуArrayByNumberTest(){
        int[] a = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};
        //act
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(a, number);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.6 Написать метод toDoubleArray(),
// который принимает на вход массив целых чисел,
// и возвращает массив типа double[] из тех же чисел

//Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    @Test
    public void toDoubleArrayTest(){
        int[] a = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        //act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    //1.7. Написать метод toIntArray(), который принимает
// на вход массив типа double[],  и возвращает массив
// типа int[] из тех же чисел

//Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    @Test
    public void toIntArrayTest(){
        double[] a = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        //act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.8. Написать метод toStringArray(), который принимает
    // на вход массив целых чисел,  и возвращает массив
    // типа String[] из тех же чисел (желательно не
    // использовать метод .toString(), нужно переводить вручную)

    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    @Test
    public void toStringArrayTest(){
        int[] a = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};
        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }


    //1.9 Перегрузить метод toStringArray() параметром double[].
    // Этот метод должен возвращать массив типа String[]
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

    @Test
    public void toStringArrayDoubleTest(){
        double[] a = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};
        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArrayDouble(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.12 В классе ManipulationsWithArrays написать
    // метод areValuesGreaterThanNumber(), который принимает
    // на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы
    // массива больше number, иначе возвращает false

    @Test
    public void areValuesGreaterThanNumberTest(){
        int number = 0;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        boolean expectedResult = true;
        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void areValuesGreaterThanNumberTest2(){
        int number = 9;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        boolean expectedResult = false;
        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
