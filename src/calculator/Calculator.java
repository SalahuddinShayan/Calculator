package calculator;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Welcome to the Calculator");
		int u = 1;
		while(u==1) {
			System.out.println("Please select the oppration you want to perform"+"\r\n" 
				+ "1.Addition" +"\r\n" 
				+ "2.Substraction" +"\r\n"
				+ "3.Multiplication" +"\r\n"
				+ "4.Division" +"\r\n"
				+ "0.Exit" );
			int c = Sc.nextInt();
			
			if (c==1) {
				System.out.println("Please select first number");
				int a = Sc.nextInt();
				System.out.println("Please select second number");
				int b = Sc.nextInt();
				int r = a+b;
				System.out.println("The sum of the given numbers is "+r);
			}
			else if (c==2) {System.out.println("Please select first number");
			int a = Sc.nextInt();
			System.out.println("Please select second number");
			int b = Sc.nextInt();
			int r = a-b;
			System.out.println("The diffrence of the given numbers is "+r);				
			}
			else if (c==3) {System.out.println("Please select first number");
			int a = Sc.nextInt();
			System.out.println("Please select second number");
			int b = Sc.nextInt();
			int r = a*b;
			System.out.println("The multiple of the given numbers is "+r);
			}
			else if (c==4) {System.out.println("Please select first number");
			int a = Sc.nextInt();
			System.out.println("Please select second number");
			int b = Sc.nextInt();
			int r = a/b;
			System.out.println("The quotient of the given numbers is "+r);
			}
			else if (c==0) {
				System.out.println("Calculator is closed. ");
				break;
			}
			else {
				System.out.println("Please select a valid option");
			}
		}
	}

}
