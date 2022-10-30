import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerMTest {

//    7. Given an integer M perform the following conditional actions:
//    If M is multiple of 7 and 9 then return "Good Number".
//    If M is only multiple of 9 and not of 7 then return "Bad Number"
//    If M is only multiple of 11 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    //Positive Happy path

    @Test
    public void IntegerMTest(){
        int m = 63; //7*9
        String expectedResult = "Good Number";
        //act
        String actualResult = new IntegerM().IntegerM(m);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IntegerMTest2(){
        int m = 90; //90/9 & 90!/7
        String expectedResult = "Bad Number";
        //act
        String actualResult = new IntegerM().IntegerM(m);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IntegerMTest3(){
        int m = 1111; //11
        String expectedResult = "Poor Number";
        //act
        String actualResult = new IntegerM().IntegerM(m);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void IntegerMTest4(){
        int m = 7;
        String expectedResult = "-1";
        //act
        String actualResult = new IntegerM().IntegerM(m);
        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
