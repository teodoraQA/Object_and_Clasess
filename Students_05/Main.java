package Students_05;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();

        for (int i = 1; i <= numStudents; i++) {
            Students student = getStudent(scanner);
            students.add(student);
        }

        students.sort(Comparator.comparingDouble(Students::getGrade));
        Collections.reverse(students);
        students.forEach(System.out::println);
    }

    public static Students getStudent(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        String firstName = input[0];
        String lastName = input[1];
        double grade = Double.parseDouble(input[2]);
        return new Students(firstName, lastName, grade);
    }
}
