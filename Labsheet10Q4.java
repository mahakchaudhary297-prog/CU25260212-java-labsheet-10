import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String roll = scanner.nextLine();
        System.out.print("Enter Marks: ");
        String marks = scanner.nextLine();
        scanner.close();

        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + roll + ", Marks: " + marks + "\n");
            writer.close();
            System.out.println("Record appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
