

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the number of students to enroll: ");
        int numOfStudents = input.nextInt();
        
        input.nextLine();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        System.out.println("\nStudent Database:");
        for (int i = 0; i < numOfStudents; i++) {
            students[i].showInfo();
        }
       input.close();
    }
}
