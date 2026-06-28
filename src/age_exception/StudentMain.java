package age_exception;

import java.util.Scanner;

public class StudentMain {

    public static void checkAge(String name, int age) throws AgeException {
        if (age < 18) {
            throw new AgeException(name + " age must be above 18");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Student Data Fill Program");

            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            checkAge(name, age);

            System.out.print("Enter Your Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Your Subject: ");
            String subject = sc.nextLine();

            Student student = new Student(name, age, address, subject);

            System.out.println();
            System.out.println("Student Data");
            student.showData();

        } catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program End");
            sc.close();
        }
    }
}