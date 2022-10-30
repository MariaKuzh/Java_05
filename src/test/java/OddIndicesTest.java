import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //2. Positive Happy path
    // if (i % 2 != 0)
    //return new String[]{OddIndices[i]};

    @Test
    public void testNumberOdd() {
        //AAA
        //arrange
        int[] expectedResult = {590, 985, 68};
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);


}

}
