import java.awt.*;
import java.util.Date;
import java.util.*;;

public class user
{
	public static void main(String[] args) {
		byte  myAge = 30;
		int viewCount = 2564853;
		double price = 10.99;
		char letter = 'a';
		boolean isEligible = false;
		String message = " Hello World " + " !! ";
		
		Date now = new Date();
		//now.getTime();
		
		Point point1 = new Point(1 , 1);
		Point point2 = point1;
		point1.x = 2;
		
		System.out.println(	message );
		System.out.println(	message.toUpperCase() );
		System.out.println(	message.endsWith("!!") );
		System.out.println(	message.startsWith("!!") );
		System.out.println(	message.length() );
		System.out.println(	message.indexOf("H") );
		System.out.println(	message.replace("!" , "*") );
		System.out.println(	message.trim() );
		
// 		System.out.println(now);
// 		System.out.println(point2);
	}
}