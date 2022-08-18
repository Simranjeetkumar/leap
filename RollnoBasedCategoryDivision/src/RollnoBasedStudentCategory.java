import java.util.Scanner;
public class RollnoBasedStudentCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the Rollno to find the group");
				int RollNo = sc.nextInt();
				 
				if (RollNo%4==0)
				{
					System.out.println("Emerald");
				}
			
				else if(RollNo%2==0)
				{
					System.out.println("Perl");
				}
				
				else if(RollNo%3==0)
				{
					System.out.println("Ruby");
				}
				
				else
				{
					System.out.println("Sapphire");
				}
			}
			
		}

	


