
import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOne = 0;
		int numberTwo = 0;
		int result = 0;
		
		System.out.print("Enter a number: ");
		numberOne = input.nextInt();
		
		System.out.print("Enter another number: ");
		numberTwo = input.nextInt();
		
		System.out.print("Enter +, -, *, or /: ");
		char calc = input.next().charAt(0);
		
		if (calc == '+')
		{
			result = numberOne + numberTwo;
			System.out.print(result);
		}
		else if (calc == '-')
		{
			result = numberOne - numberTwo;
			System.out.print(result);
		}
		else if (calc == '*')
		{
			result = numberOne * numberTwo;
			System.out.print(result);
		}
		else if (calc == '/')
		{
			result = numberOne / numberTwo;
			System.out.print(result);
		}
		
	}

}
