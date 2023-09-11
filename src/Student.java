

import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int idCounter = 1000;
    
    private static Scanner input = new Scanner(System.in);

    public Student() {
    	
        System.out.print("Enter student's first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = input.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's grade level: ");
        this.gradeYear = input.nextInt();
        input.nextLine();

        setStudentID();
    }

    private void setStudentID() {
        idCounter++;
        this.studentID = gradeYear + "" + idCounter;
    }

    public void enroll() {

        while (true) {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = input.nextLine();

            if (course.equalsIgnoreCase("Q")) {
                break;
            } else {
                courses += "\n  " + course;
                tuitionBalance += courseCost;
            }
        }
    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter the payment amount: $");
        int payment = input.nextInt();
        input.nextLine();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public void showInfo() {
        System.out.println("\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance);
    }
}
