package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();

        for (int i = 1; i <= numSongs; i++) {
            String[] songInput = scanner.nextLine().split("_");
            String type = songInput[0];
            String name = songInput[1];
            String time = songInput[2];

            Songs song = new Songs(type, name, time);
            songs.add(song);
        }

        String searchtypeList = scanner.nextLine();

        if (searchtypeList.equals("all")) {
            for (Songs song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Songs song : songs) {
                if (song.getTypeList().equals(searchtypeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
