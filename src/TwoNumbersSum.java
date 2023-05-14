/**
 * Finds the two integers in the list that sum up to a given target value
 */
class TwoNumbersSum {
    /**
     * @param numbers is sorted list of integers
     * @param target is given target value
     */
    public void twoNumbersSum(int[] numbers, int target) {

        System.out.println(resultNumbers(numbers, target));

    }

    /**
     * To solved used the "two-pointer" algorithm
     * @param numbers is sorted list of integers
     * @param target is given target value
     * @return String result
     */
    String resultNumbers(int[] numbers, int target) {

        if (numbers.length > 1 && numbers[0] < target && ((target - numbers[0]) > numbers[0])) {
            int left = 0;
            int right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[left] + numbers[right];

                if (sum == target) {
                    return "(" + numbers[left] + ", " + numbers[right] + ")";
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return "None";

    }

}
