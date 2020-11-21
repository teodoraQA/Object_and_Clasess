package Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArticles = Integer.parseInt(scanner.nextLine());
        List<Articles> articles = new ArrayList<>();

        for (int i = 1; i <= numArticles; i++) {
            Articles article = getArticles(scanner);
            articles.add(article);
        }

        String typeToSort = scanner.nextLine();

        printSortedByType(typeToSort, articles);
    }

    private static void printSortedByType(String typeToSort, List<Articles> articles) {
        if (typeToSort.equals("title")) {
            articles.stream()
                    .sorted(Comparator.comparing(Articles::getTitle))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

        } else if (typeToSort.equals("content")) {
            articles.stream()
                    .sorted(Comparator.comparing(Articles::getContent))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } else {
            articles.stream()
                    .sorted(Comparator.comparing(Articles::getAuthor))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        }

    }

    public static Articles getArticles(Scanner scanner) {
        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        return new Articles(title, content, author);
    }
}
