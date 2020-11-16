package Students2_ver2;

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
                Students rewriteStudent = fillStudentsList(currentStudent);
                int rememberIndex = getRememberIndex(students, firstName, lastName);
                students.set(rememberIndex, rewriteStudent);
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

    private static int getRememberIndex(List<Students> students, String firstName,
                                        String lastName) {
        int rememberIndex = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && students.get(i).getLastName().equals(lastName)) {
                rememberIndex = i;
                break;
            }
        }
        return rememberIndex;
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
