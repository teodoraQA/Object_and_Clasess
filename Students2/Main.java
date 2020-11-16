package Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        List<Students> students = new ArrayList<Students>();

        while (!student.equals("end")) {

            String[] currentStudent = student.split("\\s+");
            String firstName = currentStudent[0];
            String lastName = currentStudent[1];

            if (!studentIsPresent(students, firstName, lastName)) {
                students.add(fillStudentsList(currentStudent));
            } else {
                Students presentStudent = getStudent(students, firstName, lastName);
                rewriteStudent(currentStudent, firstName, lastName, presentStudent);
            }
            student = scanner.nextLine();
        }
        String cityToSearch = scanner.nextLine();

        for (Students s : students) {
            if (s.getHomeTown().equals(cityToSearch)) {
                String print = String.format("%s %s is %s years old", s.getFirstName(), s.getLastName(),
                        s.getAge());
                System.out.println(print);
            }
        }
    }

    private static void rewriteStudent(String[] currentStudent, String firstName, String lastName, Students rewriteStudent) {
        rewriteStudent.setFirstName(firstName);
        rewriteStudent.setLastName(lastName);
        rewriteStudent.setAge(currentStudent[2]);
        rewriteStudent.setHomeTown(currentStudent[3]);
    }

    private static Students getStudent(List<Students> students, String firstName, String lastName) {
        Students existingStudent = null;

        for (Students s : students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                existingStudent = s;
            }
        }
        return existingStudent;
    }

    private static boolean studentIsPresent(List<Students> students, String firstName, String lastName) {
        for (Students student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }


    private static Students fillStudentsList(String[] currentStudent) {
        String firstName = currentStudent[0];
        String lastName = currentStudent[1];
        String age = currentStudent[2];
        String homeTown = currentStudent[3];

        Students newStudent = new Students(firstName, lastName, age, homeTown);
        return newStudent;
    }

}
