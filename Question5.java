<<<<<<< HEAD
package Assignment2;

// Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class Question5 {

	public static void main(String[] args) {
		int n=407;
		int m=n;
		int rem=0;
		int p=0;
		while(n!=0)
		{
		rem= n%10;
		//p+= rem*rem*rem;  //p= 3+3*3 +5*5*5 + 1*1*1
		p+=Math.pow(rem, 3);
		//System.out.println(rem);
		n=n/10; 
		}
		if( m==p)
		  System.out.println("number is armstrong");
		else 
		System.out.println(" not armstrong");
	}

	
		}
=======
package Assignment2;

// Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class Question5 {

	public static void main(String[] args) {
		int n=407;
		int m=n;
		int rem=0;
		int p=0;
		while(n!=0)
		{
		rem= n%10;
		//p+= rem*rem*rem;  //p= 3+3*3 +5*5*5 + 1*1*1
		p+=Math.pow(rem, 3);
		//System.out.println(rem);
		n=n/10; 
		}
		if( m==p)
		  System.out.println("number is armstrong");
		else 
		System.out.println(" not armstrong");
	}

	
		}
>>>>>>> 42ae72676e0c9886b0fbdf2527e5fcd93ea3cb0b
