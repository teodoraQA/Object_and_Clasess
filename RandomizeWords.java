import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputWords = scanner.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int i = 0; i < inputWords.length; i++) {
            int rndIndex = rnd.nextInt(inputWords.length);
            swapWords(inputWords, i, rndIndex);
        }
        System.out.println(String.join(System.lineSeparator(), inputWords));
    }

    private static void swapWords(String[] inputWords, int i, int rndIndex) {
        String temp = inputWords[i];
        inputWords[i]= inputWords[rndIndex];
        inputWords[rndIndex] = temp;
    }
}
