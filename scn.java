import java.util.Scanner;

public class scn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }
}