import java.text.NumberFormat;

public class numberForm {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(125468.652);
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.5);
        
        
        System.out.println(result1);
    }
}