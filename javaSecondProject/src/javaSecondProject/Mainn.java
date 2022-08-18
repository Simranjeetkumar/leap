package javaSecondProject;
import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no  of row");
		int row = obj.nextInt();
		for (int i = 0; i<row;i++) {
			for(int j= 0; j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
	}

}
}