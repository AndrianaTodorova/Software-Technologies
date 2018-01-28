import java.util.Scanner;

public class Problem_03_ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine();
        String secondLetter = scanner.nextLine();
        String thirdLetter = scanner.nextLine();

        String joinedLetters = String.join("",firstLetter,secondLetter,thirdLetter);
        String result = new StringBuilder(joinedLetters).reverse().toString();
        System.out.println(result);

    }
}
