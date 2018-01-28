import java.util.Scanner;

public class Problem_02_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double sum = first + second;
        System.out.printf("%.2f",sum);


    }
}
