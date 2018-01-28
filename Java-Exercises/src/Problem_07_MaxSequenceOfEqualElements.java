import java.util.Arrays;
import java.util.Scanner;

public class Problem_07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int startIndex = 0;
        int sequenceLength = 1;

        int bestStarIndex = 0;
        int bestSequenceLength = 0;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums [i] == nums [i - 1])
            {
                sequenceLength++;
                if (sequenceLength > bestSequenceLength)
                {
                    bestStarIndex = startIndex;
                    bestSequenceLength = sequenceLength;
                }
            }
            else
            {
                startIndex = i;
                sequenceLength = 1;
            }
        }
        for (int i = bestStarIndex; i < bestStarIndex + bestSequenceLength; i++)
        {
            System.out.printf("%d ",nums[i]);
        }
    }
}
