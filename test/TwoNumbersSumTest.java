import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TwoNumbersSumTest {

    @Test
    @DisplayName("Print None")
    public void testTwoNumbersSumNone(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] numbersArray = {10};
        int target = 10;

        twoNumbersSum.twoNumbersSum(numbersArray, target);
    }

    @Test
    @DisplayName("Print (3, 7)")
    public void testTwoNumbersSum(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] numbersArray = {3, 4, 5, 7, 9};
        int target = 10;

        twoNumbersSum.twoNumbersSum(numbersArray, target);
    }

    @Test
    @DisplayName("Return None")
    public void testResultNumbers1(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] numbersArray = {3, 4, 5, 7, 9};
        int target = 17;

        String result = twoNumbersSum.resultNumbers(numbersArray, target);
        Assertions.assertEquals("None", result);
    }

    @Test
    @DisplayName("Return None")
    public void testResultNumbers2(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] numbersArray = {10};
        int target = 10;

        String result = twoNumbersSum.resultNumbers(numbersArray, target);
        Assertions.assertEquals("None", result);
    }

    @Test
    @DisplayName("Return tuple (a, b) where a and b are two integers from the input")
    public void testResultNumbers3(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] numbersArray = {3, 4, 5, 7, 9};
        int target = 7;

        String result = twoNumbersSum.resultNumbers(numbersArray, target);
        Assertions.assertEquals("(3, 4)", result);
    }
}
