import java.util.Scanner;

public class day-1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int total = 0;
        double average;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Subject " + i + " Marks: ");
            int mark = sc.nextInt();
            total += mark;
        }

        average = total / 5.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}