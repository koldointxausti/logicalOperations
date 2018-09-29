
import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		boolean c;
		
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		
		while (a == 1 && b == 2) {
			System.out.println("Try other numbers");
			a = sc.nextInt();
			System.out.println("Enter second number");
			b = sc.nextInt();
		}
		if (a == 4 || b==4) {
			System.out.println("This is a 4");
		}
		
		System.out.println("Enter true or false:");
		c = sc.nextBoolean();
		
		if (! c == false) {
			System.out.println("You said it's not "+ c);
		}
		System.out.println("this is over.");
		
	}
}
