import student.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        Student s = new Student(a, b, c, d, e);

        System.out.println("Total Marks = " + s.totalMarks());
        System.out.println("Percentage = " + s.percentage() + "%");
        System.out.println("Grade = " + s.grade());

        sc.close();
    }
}