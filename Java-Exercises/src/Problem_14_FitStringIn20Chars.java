import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_14_FitStringIn20Chars {
    public static String repeatString(String text, int times) {
        StringBuilder result = new StringBuilder();

        while (times > 0) {
            result.append(text);

            times--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder(text);
        if (result.length() < 20) {
            for (int i = 0; i < 20; i++) {
                result = result.append(repeatString("*", 20 - result.length()));
            }
        } else {

            result.delete(20, result.length());
        }

        System.out.println(result);
    }

}
