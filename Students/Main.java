package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student =scanner.nextLine();
        List<Students> students = new ArrayList<Students>();

        while (!student.equals("end")){

            String[] currentStudent = student.split("\\s+");

            students.add(fillStudentsList(currentStudent));

            student = scanner.nextLine();
        }

        String cityToSearch = scanner.nextLine();

        for (Students s: students) {
            if(s.getHomeTown().equals(cityToSearch)) {
                String print = String.format("%s %s is %s years old", s.getFirstName(), s.getLastName(),
                s.getAge());
                System.out.println(print);
            }
        }
    }

    private static Students fillStudentsList(String[] currentStudent) {
        String firstName = currentStudent[0];
        String lastName = currentStudent[1];
        String age = currentStudent[2];
        String homeTown = currentStudent[3];

        Students newStudent  = new Students(firstName, lastName, age, homeTown);
        return  newStudent;
    }

}
