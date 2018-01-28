import java.util.Scanner;

public class Problem_05_IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String hexadecimal = Integer.toHexString(num).toUpperCase();
        String binary = Integer.toBinaryString(num);

        System.out.println(hexadecimal);
        System.out.println(binary);
    }
}
