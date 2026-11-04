import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("employees.txt", true);
            System.out.print("Enter Employee ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();
            System.out.print("Enter Salary: ");
            String salary = scanner.nextLine();
            writer.write(id + "," + name + "," + dept + "," + salary + "\n");
            writer.close();
            System.out.println("Employee record added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.print("Enter Employee ID to search: ");
        String searchId = scanner.nextLine();
        scanner.close();

        boolean found = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(searchId)) {
                    System.out.println("Employee record found: " + line);
                    found = true;
                    break;
                }
            }
            reader.close();
            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Employee record not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
