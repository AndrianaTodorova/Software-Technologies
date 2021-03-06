import java.util.Random;
import java.util.Scanner;

public class Problem_21_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] town = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            int phraseIndex = rnd.nextInt(phrases.length);
            int eventIndex = rnd.nextInt(events.length);
            int authorIndex = rnd.nextInt(author.length);
            int townIndex = rnd.nextInt(town.length);
            System.out.printf("%s %s %s - %s%n",phrases[phraseIndex],events[eventIndex], author[authorIndex], town[townIndex]);
        }


    }
}
