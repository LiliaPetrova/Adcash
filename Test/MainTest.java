import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @DisplayName("Covert String to array of integers")
    public void testConvertStringToArray(){
        Main main = new Main();
        String numbers = "[3, 4, 5, 7, 9]";
        int[] numbersArray = {3, 4, 5, 7, 9};
        int[] result = main.convertStringToArray(numbers);
        Assertions.assertArrayEquals(numbersArray, result);
    }
}
