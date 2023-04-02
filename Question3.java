package Assignment2;
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
//For example, if the input is 12345, the output should be 54321.
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The NOs:");
		int a=s.nextInt();
		int reversenum =0;
		while( a != 0 )
		{
		reversenum = reversenum * 10;
		reversenum = reversenum + a%10;
		a = a/10;
		}
		System.out.println("Reverse of specified number is: "+reversenum);
		}

}
