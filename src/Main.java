import java.util.*;
import java.util.stream.Stream;

/**
 * Program output a tuple (a, b) where a and b are two integers from the
 * input list that sum up to the target value, or None if no such pair exists
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int target = Integer.parseInt(scanner.nextLine());

        TwoNumbersSum twoSum = new TwoNumbersSum();
        twoSum.twoNumbersSum(convertStringToArray(input), target);

    }

    /**
     * Convert input to int[]
     * @param input is String from input
     * @return int[]
     */
    protected static int[] convertStringToArray(String input) {

        int[] numbers = Stream.of(input.replaceAll("[\\[\\,\\]]", "")
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        return numbers;

    }

}

