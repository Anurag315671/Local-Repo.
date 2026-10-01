public class typeCasting {
    public static void main(String[] args) {
        String x1 = "1.1";
        //int y1 = Integer.parseInt(x1) + 2;
        
        double y2 = Double.parseDouble(x1) + 2;
        
        
        double x = 1.1;
        int y =  (int)x + 2;
        
        System.out.println(y);
       // System.out.println(y1);
        System.out.println(y2);
    }
}