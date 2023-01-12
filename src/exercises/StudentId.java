package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentId {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;


        System.out.println("Enter your students (or ENTER to finish): ");

        //It takes in student names and ID numbers (as integers) instead of names and grades.
        do {
            System.out.println("Student Name: ");
            studentName = input.next();
            System.out.println("Student ID: ");
            int studentId = input.nextInt();
            input.nextLine();
            students.put(studentId, studentName);

//            if (!(studentName.equals(""))) {
//                System.out.println("Student ID: ");
//                int studentId = input.nextInt();
//                students.put(studentId, studentName);
//                input.nextLine();
//                continue;
//            }
        }
            while (studentName == "") ;
                //System.out.println("\nClass Roster:");

            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + ": " + student.getValue());
            }
//The keys should be the IDs and the values should be the names.
//Modify the roster printing code accordingly
        }
    }


