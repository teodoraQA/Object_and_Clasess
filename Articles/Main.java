package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int numLines = Integer.parseInt(scanner.nextLine());
        Articles article = new Articles(input[0], input[1], input[2]);
        for (int i = 0; i < numLines ; i++) {
            String command = scanner.nextLine();
            String[] getCommand = command.split(": ");
            String newData = getCommand[1];
            if(getCommand[0].equals("Edit")){
                article.editContent(newData);
            } else if(getCommand[0].equals("ChangeAuthor")){
                article.changeAuthor(newData);
            } else {
                article.rename(newData);
            }
        }

        System.out.println(article);
    }
}
