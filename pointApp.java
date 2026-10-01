import java.util.Date;
import java.awt.Point;

public class pointApp {
	public static void main(String[] args) {
		byte  myAge = 30;
		int viewCount = 2564853;
		double price = 10.99;
		char letter = 'a';
		boolean isEligible = false;
		
		Date now = new Date();
		//now.getTime();
		
		Point point1 = new Point(1 , 1);
		Point point2 = point1;
		point1.x = 2;
		
		System.out.println(point2);
	}
}