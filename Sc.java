import java.util.Scanner;
public class Sc{
    public static void main(String[] argv){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Name: ");
       String name = scanner.nextLine().trim();
       System.out.print("You are " + name);
       scanner.close();
    }
}