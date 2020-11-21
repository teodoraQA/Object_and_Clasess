package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Person currentPerson = getPerson(scanner);
            persons.add(currentPerson);
        }

        persons.stream()
                .filter(p-> p.getAge()>30)
                .sorted((p1 , p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);
    }

    public static Person getPerson(Scanner scanner) {
        String[] inputInfo = scanner.nextLine().split("\\s+");
        String name = inputInfo[0];
        int age = Integer.parseInt(inputInfo[1]);
        Person personInfo = new Person(name, age);
        return personInfo;
    }
}
