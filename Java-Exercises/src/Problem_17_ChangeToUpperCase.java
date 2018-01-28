import java.util.Scanner;

public class Problem_17_ChangeToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String openTag = "<upcase>";
        String closeTag = "</upcase>";


        int firstPosition = text.indexOf(openTag);
        int lastPosition = text.indexOf(closeTag);
        while (firstPosition >= 0) {

            String content = text.substring(firstPosition, lastPosition  + 9);
            firstPosition = text.indexOf(openTag, firstPosition + 1);
            lastPosition = text.indexOf(closeTag,lastPosition + 1);

            text = text.replace(content, content.toUpperCase());

        }
        text = text.replace("<UPCASE>", "");
        text = text.replace("</UPCASE>", "");


        System.out.println(text);
    }


}



