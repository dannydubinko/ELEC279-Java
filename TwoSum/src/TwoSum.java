import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // private int inputSize;
    private int[] numbers;
    private int targetSum;
    private Map<Integer, Integer> numberMap = new HashMap<>();

    public TwoSum(int inputSize, int[] numberArray, int targetSum) {
        // this.inputSize = numberArray.length;
        this.numbers = numberArray;
        this.targetSum = targetSum;

        fillMap();
    }

    // Fills the hash map. 
    // If the number is seen twice it then changes the value how many times that number was seen. 
    private void fillMap() {
        for (int number : numbers) {
            if (numberMap.containsKey(number)) {
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }
        }
        System.out.println(numberMap);
    }

    // Finds the two values that equal to the target sums
    public void findSumVales() {
        boolean foundSum = false;
        for (int number : numberMap.keySet()) {
            int targetValue = targetSum - number;
            if (targetValue < 0) {
                continue;
            }
            // If the target value and the current number are the same then check if there is an additonal identical number. 
            // If there is use it if not move on.
            if (targetValue == number) {
                if (numberMap.get(number) > 1) {
                    System.out.println("TwoSum found. " + number + " and " + targetValue + " in array equal: " + targetSum);
                    foundSum = true;
                    break;
                }
            // If the number two sum pair is not identical, then see if the other partner exists.
            // If not then break and move on
            } else if (numberMap.containsKey(targetValue)) {
                System.out.println("TwoSum found. " + number + " and " + targetValue + " in array equal: " + targetSum);
                foundSum = true;
                break;
            }
        }
        if (!foundSum) {
            System.out.println("No TwoSum Found");
        }
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 1, 3, 5, 5, 8 };

        if (array.length >= 100) {
            System.out.println("Wait! Array to Big! Please limit array size to less than 100.");
        } else {
            TwoSum twoSum = new TwoSum(4, array, 8);
            twoSum.findSumVales();
        }

    }
}
