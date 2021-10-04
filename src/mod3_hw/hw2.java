package mod3_hw;
import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
//		1. Write Fibonnaci series between 
//		the user entered start and end values
		
		
		
		int start, finish, N =10, counter = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting & ending Value");
		
		
		start= scan.nextInt();
		finish= scan.nextInt();
		
		
		
		
		int i = 1;
        while (i<-1)
        {
            int sum = start + finish;
            start = finish;
            finish = sum;
            System.out.print(" " + sum);
            i++;
        }
		
		
		
		
		
		
				
//		
//		While (counter < N); {
//			System.out.print(start + " ");
//			int fib = start + finish;
//			start =finish;
//			finish = fib;
//			counter = counter + 1;
		
		
		
	
	
		
			System.out.println(" is a fibonacci number");{
			
			}
		
		
//
//		2. Determine whether a user entered number 
//		is an Armstrong number
		
		

	
		int num, originalNumber, remainder, result = 0;
		
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter a number, is it an Armstrong number?");
		num = scann.nextInt();
		
		originalNumber = num;
				
		while (originalNumber !=0)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		
		if(result == num)
			System.out.println(num + "is an Armstrong number");
		else
			System.out.println(num +"is not an Armstrong number");
		
	
	
	
		
		
	
//
//		3. Write a program to see if a user entered 
//		string is a palindrome or not
		
		
		String str, rev ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a string is it a palindrome?");
		str = sc.nextLine();
		
		
		int length = str.length();
		
		for(int ii = length - 1; i >=0; i-- )
			rev = rev + str.charAt(i);
		
		
		if(str.equals(rev))
			System.out.println(str + "is a palindrome!!");
		else
			System.out.println(str + "is not a palindrome!!");
	}
	

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

	}


