import java.util.Scanner;

public class Problem_10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letter = scanner.nextLine().toCharArray();


        for (char i = 0; i < letter.length; i++) {
            char letterToPrint = letter[i];
            int position = (int)letterToPrint - 97;
            System.out.printf("%c" + " -> " + "%d", letterToPrint, position);
            System.out.println();

        }
    }
}
