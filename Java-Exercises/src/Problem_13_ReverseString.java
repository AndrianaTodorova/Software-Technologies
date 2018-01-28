import java.util.Scanner;

public class Problem_13_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = new StringBuilder(input).reverse().toString();

        System.out.println(result);
    }
}
