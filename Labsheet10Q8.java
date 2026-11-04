import java.io.FileReader;
import java.io.IOException;

public class Labsheet10Q8 {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        try {
            FileReader reader = new FileReader("input.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = Character.toLowerCase((char) ch);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else if (c >= 'a' && c <= 'z') {
                    consonants++;
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (Character.isWhitespace(c)) {
                    spaces++;
                }
            }
            reader.close();
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
