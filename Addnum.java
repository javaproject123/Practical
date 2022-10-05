//WAP to add two numbers.
import java.util.Scanner;
public class Addnum {

	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter any two numbers: ");
		Scanner sc=new Scanner (System.in);
		a =  sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Sum of two numbers: "+c);
		
		
	}

}
