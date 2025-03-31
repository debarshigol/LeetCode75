import java.util.Scanner;

public class NameToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter a name: ");
        String name = scanner.nextLine().toUpperCase(); // Convert to uppercase to handle lowercase letters

        StringBuilder numberRepresentation = new StringBuilder();

        // Convert each character to corresponding number
        for (char ch : name.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') { // Ensure it's a letter
                numberRepresentation.append(ch - 'A' + 1);
            }
        }

        // Print result
        System.out.println("Converted Number: " + numberRepresentation);

        scanner.close();
    }
}
