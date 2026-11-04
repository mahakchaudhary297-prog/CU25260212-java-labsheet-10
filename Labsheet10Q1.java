import java.io.FileWriter;
import java.io.IOException;

public class Labsheet10Q1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Student Name: John Doe\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: Computer Science\n");
            writer.write("Semester: 4th\n");
            writer.close();
            System.out.println("File student.txt created successfully and data written.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
