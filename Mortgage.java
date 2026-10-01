import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($): ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Mortgage Formula: M = P [ i(1 + i)^n ] / [ (1 + i)^n - 1 ]
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double monthlyPayment = principal * (monthlyInterest * mathPower) / (mathPower - 1);

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Monthly Payment: " + monthlyPaymentFormatted);
        
        scanner.close();
    }
}
