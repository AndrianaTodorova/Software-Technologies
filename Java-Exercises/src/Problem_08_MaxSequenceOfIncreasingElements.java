import java.util.Arrays;
import java.util.Scanner;

public class Problem_08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int currentDigit = 0;
        int currentLength = 1;

        int besDigit = 0;
        int bestLength = 0;

        for (int i = 1; i < nums.length ; i++)
        {
            if (nums[i] > nums[i - 1])
            {
                currentLength++;
                if (currentLength > bestLength)
                {
                    besDigit = currentDigit;
                    bestLength = currentLength;
                }
            }
            else
            {
                currentDigit = i;
                currentLength = 1;
            }

        }
        for (int i = besDigit; i < besDigit + bestLength; i++)
        {
            System.out.printf("%d ", nums[i]);
        }

    }
}
