import java.util.Scanner;

public class Problem_04_SumNIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sum = " + sum);
    }

}
