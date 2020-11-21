package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputInfo = scanner.nextLine();
        List<Person> persons = new ArrayList<>();

        while (!inputInfo.equals("End")){
            Person newPerson = getPerson(inputInfo);
            persons.add(newPerson);
            inputInfo= scanner.nextLine();
        }

        persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static Person getPerson(String inputInfo) {
        String[] input = inputInfo.split("\\s+");
        String name = input[0];
        String id = input[1];
        int age = Integer.parseInt(input[2]);
        return new Person(name, id, age);
    }
}
