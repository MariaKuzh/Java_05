import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {


//1.1.  В голубой папке java создать класс CreateArray,
// написать в этом классе метод createIntArray(),
// который принимает на вход 5 целых чисел,
// и возвращает массив из этих же чисел.

//Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
//Positive Happy path
@Test
public void CreateArrayTest(){
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;
    int[] expectedResult = {a,b,c,d,e};
    //act
    int[] actualResult = new CreateArray().createIntArray(a,b,c,d,e);
    //assert
    Assert.assertEquals(actualResult,expectedResult);
}


//   1.2. Написать метод createDoubleArray(),
//    который принимает на вход 5 чисел типа double,
//    и возвращает массив из этих же чисел
//    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

    //Positive Happy path
    @Test
    public void createDoubleArrayTest(){
        double a = 1.1;
        double b = 2.1;
        double c = 3.3;
        double d = 4.6;
        double e = 5.9;
        double[] expectedResult = {a,b,c,d,e};
        //act
        double[] actualResult = new CreateArray().createDoubleArray(a,b,c,d,e);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //1.3. Написать метод createStringArray(),
// который принимает на вход 5 слов,
// и возвращает массив из этих слов

//Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}


    //Positive Happy path
    @Test
    public void createStringArrayTest(){
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {a,b,c,d,e};
        //act
        String[] actualResult = new CreateArray().createStringArray(a,b,c,d,e);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    ////4я задача только для тех, кто хочет
    // разобраться с методом класса String split()
    //1.4. Написать метод createArrayFromText(),
    // который принимает на вход предложение из
    // нескольких слов и возвращает массив из этих слов.

    //Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    @Test
    public void createArrayFromTextTest(){
        String a = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        //act
        String[] actualResult = new CreateArray().createArrayFromText(a);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
