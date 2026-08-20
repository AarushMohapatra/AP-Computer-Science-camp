package Unit2.Lesson2;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎓 Welcome to the Student Management System! 🎓");
        System.out.print("\nEnter Student Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter GPA: ");
        double gpa1 = sc.nextDouble();
        Student student1 = new Student(name1, age1, gpa1);
        student1.displayStudentDetails();
        System.out.println("\nProcessing another student...");
        System.out.print("\nEnter Student Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter GPA: ");
        double gpa2 = sc.nextDouble();
        Student student2 = new Student(name2, age2, gpa2);
        student2.displayStudentDetails();
        System.out.println("\nComparing Students...");
        if (student1.getName().compareTo(student2.getName()) < 0) {
            System.out.println(student1.getName() + " comes before " + student2.getName() +
                " in alphabetical order.");
        } else if (student1.getName().compareTo(student2.getName()) > 0) {
            System.out.println(student2.getName() + " comes before " +

                student1.getName() + " in alphabetical order.");
        } else {
            System.out.println("Both students have the same name.");
        }
        System.out.println("\n Thank you for using the Student Management System!");
        sc.close();
    }
}