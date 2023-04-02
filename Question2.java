package Assignment2;
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		if(n>0) {
	        for(int i=1; i <= 10; i++)
	        {
	            System.out.println(n+" * "+i+" = "+n*i);
	        }
	    }
		else
		{
			System.out.println("Negative No:");
	
		}
	}
}
