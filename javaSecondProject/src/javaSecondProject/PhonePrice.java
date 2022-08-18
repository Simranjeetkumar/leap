package javaSecondProject;
import java.util.Scanner;
public class PhonePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your mobile name");
		String mobilename = obj.nextLine();
		switch(mobilename) {
		case "Samsung":
			System.out.println("12000");
			break;
		case "iphone":
			System.out.println("write your iphone version");
			String p = obj.nextLine();
			switch(p) {
			case "13pro":
				System.out.println("200000");
				break;
				
			case "max":
				System.out.println("1500000");
				break;
			case "11":
				System.out.println("20000");
				break;
			default:
				System.out.println("your entered iPhone is not in our range!");
				break;
			}
			break;
			 
		case "redmi":
			 System.out.println("15000");
			 break;
		 default :
			 System.out.println("your phone price is not in our range");
		}
	}

}
