package javaSecondProject;
import java.util.Scanner;
enum months{
	january,
	febuaray,
	march,
	april,
	may,
	jun,
	july,
	august,
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner obj = new Scanner(System.in);
//		System.out.println("enter your month");
//		int x = obj.nextInt();
	
		months a = months.january;
		switch(a) {
		case january:
			System.out.println("january");
			break;
		case febuaray:
			System.out.println("Feb");
			break;
		case march:
			System.out.println("march");
		default:
			System.out.println("hello");
		}

	}

}
