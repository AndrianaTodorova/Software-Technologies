import java.util.Scanner;

public class Problem_01_CalculateExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val = ((30 + 21) * 1 / 2.0 * (35 - 12 - 1/2.0));
        double powVal = Math.pow(val,2);
        System.out.println(powVal);
    }
}
