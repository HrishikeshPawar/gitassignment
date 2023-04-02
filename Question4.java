package Assignment2;
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
//The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; 
//otherwise it should terminate.(while loop)
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum = 0;
	    char choice;
	    do{
	      System.out.println("Enter two numbers");
	      int num1= sc.nextInt();
	      int num2 = sc.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");
	      choice =sc.next().charAt(0);
	    }while(choice =='Y'||choice=='y');
	    System.out.println("sum "+sum);
	  }
}
