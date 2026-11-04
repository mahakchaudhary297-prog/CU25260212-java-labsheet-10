import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("student_records.txt");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student " + i + ":");
                System.out.print("Roll Number: ");
                String roll = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Course: ");
                String course = scanner.nextLine();
                System.out.print("Marks: ");
                String marks = scanner.nextLine();
                writer.write(roll + "," + name + "," + course + "," + marks + "\n");
            }
            writer.close();
            System.out.println("Records successfully written to student_records.txt.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        scanner.close();

        System.out.println("Reading student records from file:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
