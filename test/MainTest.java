import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @DisplayName("Covert String to array of integers")
    public void testConvertStringToArray(){
        Main main = new Main();
        String numbers = "[3, 4, 5, 7, 9]";
        int target = 7;
        int[] numbersArray = {3, 4, 5};
        int[] result = main.convertStringToArray(numbers, target);
        Assertions.assertArrayEquals(numbersArray, result);
    }

    @Test
    @DisplayName("Sort and refactoring array of integers")
    public void testSortArray() {
        Main main = new Main();
        int target = 7;
        int[] numbers = {9, 4, 7, 5, 3};
        int[] numbersArray = {3, 4, 5};
        int[] result = main.sortArray(numbers, target);
        Assertions.assertArrayEquals(numbersArray, result);
    }

    @Test
    @DisplayName("Sort and refactoring array of integers to empty array")
    public void testSortArrayEmpty() {
        Main main = new Main();
        int target = 2;
        int[] numbers = {9, 4, 7, 5, 3};
        int[] numbersArray = {};
        int[] result = main.sortArray(numbers, target);
        Assertions.assertArrayEquals(numbersArray, result);
    }
}
