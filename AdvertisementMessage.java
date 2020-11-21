import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = new String[]{"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        int numMessages = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numMessages; i++) {
            String printMessage = generateRandomMessage(phrases[rnd.nextInt(phrases.length)],
                    events[rnd.nextInt(events.length)], authors[rnd.nextInt(authors.length)],
                    cities[rnd.nextInt(cities.length)]);
            System.out.println(printMessage);

        }
    }

    private static String generateRandomMessage(String phrase1, String event1, String author1, String city1) {
        String phrase = phrase1;
        String event = event1;
        String author = author1;
        String city = city1;
        return String.format("%s %s %s - %s", phrase, event, author, city);
    }
}
