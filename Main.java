package compass;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compass c=new Compass();
		while(true)
		{
			System.out.println("1. Rotate\n2. Print\n3. Exit");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter choice");	
			int choice = s.nextInt(); 

			if(choice>=1 && choice<=2)
			{
				switch(choice)
				{
				case 1:c.rotate();
				break;
				case 2:c.print();
				break;
				}
			}
			else if(choice==3)
			{
				break;
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
	}

}
