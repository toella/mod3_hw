package mod3_hw;
import java.util.Scanner;
public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			1. Write an if/else statement for the following requirements:
//			If student gets 90 or higher: console log  A
//			If students get 80 or above: console log B
//			If students get 70 or above: console log C
//			If students get 55 or above: console log D
//			Any grade lower than 55 is F
		
		int score;  /*test score*/
		char grade; /*letter grade*/
		
		/*create scanner object*/
		Scanner input = new Scanner (System.in); 
		
//		enter/retrieve test score
		System.out.println("Enter test score");
		score = input.nextInt();
		
//		calculate grade
		if (score >= 90)
		{
			grade = 'A';
		}
		else if (score >= 80)
		{
			grade = 'B';
		}
		else if (score >= 70)
		{
			grade = 'C';
		}
		else if (score >= 55)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}

//		display grade
		System.out.println("Your grade is " + grade);
		
		
		
		
//			2. Using switch case, do the following:
//			Store a number between 1-7
//			If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
		
		  int day;
		
		  Scanner inputs = new Scanner(System.in);
		  System.out.print("Input Number: ");
		  day = inputs.nextInt();
		   
		  
		  String dayName = "";
		  switch(day)
		  {
		  case 1: dayName = "Monday"; break;
		  case 2: dayName = "Tuesday"; break;
		  case 3: dayName = "Wednesday"; break;
		  case 4: dayName = "Thursday"; break;
		  case 5: dayName = "Friday"; break;
		  case 6: dayName = "Saturday"; break;
		  case 7: dayName = "Sunday"; break;
		  default: dayName = "invalid day";
		  }
		  System.out.println(dayName);
		
		
		
		
		
//			3. Anything other than 1-7 would default to "Invalid Input"
//			Store a number in a variable called num and write an if statement: 
//			If num is odd, display "Cool"
//			If num is even and between 2-5, display "Not Cool"
//			If num is even and between 6-20, display "Cool"
//			If num is even and greater than 20, display "Not Coo
		  
		  
		  int num;
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Choose a number");
		  num = scan.nextInt();
		  
		  if(num%2==1) 
		  {
			  System.out.println("Cool");
		  }
		 
		  if (num%2==0 && num <=2-5)
		  {
			  System.out.println("Not Cool");
		  }
		  if (num%2==0 && num <= 6-20)
		  {
			  System.out.println("Cool");
		  }
		  if (num%2==0 && num > 20)
		  {
			  System.out.println("Not Cool");
		  }
		
		
		
	
		System.out.println("im working");
	}
}
