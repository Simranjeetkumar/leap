import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				// For taking the input
				System.out.println("Enter the number for pattern");
				int a = sc.nextInt();
				int n =0;
				for(int i= 1; i<=a; i++)
				// Outer loop for Row
				{
					for(int j=1; j<=i;j++)
					
					{
						System.out.print(j);
					}
					n=n+1;
					System.out.println();
				}

		}

	}


