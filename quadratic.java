import java.util.Scanner;
import java.lang.Math; 
public class quadratic
{
	public static void main(String[] args)
	{	
		double root1,root2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the coefficient: a"); 
		double a = sc.nextDouble();
		System.out.println("enter the coefficient: b");
		double b = sc.nextDouble();
		System.out.println("enter the coefficient: c ");
		double c = sc.nextDouble();
		double disc;
		disc = (b * b) - (4 * a * c);
		if(disc > 0)
		{
			root1 = (-b + Math.sqrt(disc)) / (2 * a);
			root2 = (-b - Math.sqrt(disc)) / (2 * a);
			System.out.println("root 1 : " +root1);
			System.out.println("root 2 : " +root2);
			
		}
		else if (disc == 0)
		{
			root1 = -b/(2*a);
			System.out.println("the root of the quadratic equation is %.2f"+ root1);
		}
		else
		{
			System.out.println("the roots are complex");
		}
	}

}
