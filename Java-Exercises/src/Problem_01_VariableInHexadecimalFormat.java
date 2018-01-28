import java.util.Scanner;

public class Problem_01_VariableInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hexadecimal = scanner.nextLine();
        int b = Integer.parseInt(hexadecimal,16);

        System.out.println(b);

    }
}
