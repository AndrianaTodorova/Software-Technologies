import java.util.Scanner;

public class Problem_15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] email = scanner.nextLine().split("@");
        String text = scanner.nextLine();

        String username = email[0];
        String domain = email[1];
        String emailString = username + "@" + domain;

        String replacementString = repeatString("*", username.length()) + "@" + domain;
        String result = text.replaceAll(emailString,replacementString);
        System.out.println(result);


    }

    public static String repeatString(String text, int times) {
        StringBuilder result = new StringBuilder();

        while (times > 0) {
            result.append(text);

            times--;
        }

        return result.toString();
    }

}
