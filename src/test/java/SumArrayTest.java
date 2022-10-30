import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //3. Positive Happy path
    //return sum
    //Test Data:
    //    {0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    @Test
    //    {0, 1, 2, 3, 4, 5} → 15
    public void SumArrayPositiveNumbers() {
        //arrange
        int[] userStory = new int[] {0, 1, 2, 3, 4, 5};
        int expectedResult = 0 + 1 + 2 + 3 + 4 + 5; //15
        //act
        int actualResult = new SumArray().SumArray(userStory);//15
        //assert
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    //    {-7, -3} → -10
    public void SumArrayNegativeNumbers() {
        //arrange
        int[] userStory = new int[] {-7, -3};
        int expectedResult = -7 + -3; // - 10
        //act
        int actualResult = new SumArray().SumArray(userStory);//-10
        //assert
        Assert.assertEquals(actualResult,expectedResult);

    }
}
