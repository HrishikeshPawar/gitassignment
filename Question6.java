package Assignment2;
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 ...
public class Question6 {

	public static void main(String[] args) {
		 int n = 10, firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) 
		    {
		      System.out.print(firstTerm + ", ");
			 int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
	

}
