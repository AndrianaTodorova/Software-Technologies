import java.util.Arrays;
import java.util.Scanner;

public class Problem_09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int longestStreak = 0;
        int mostFrequentNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    counter++;
                }
            }

            if (counter > longestStreak) {
                longestStreak = counter;
                mostFrequentNumber = nums[i];
            }
        }

        System.out.println(mostFrequentNumber);
    }
}
