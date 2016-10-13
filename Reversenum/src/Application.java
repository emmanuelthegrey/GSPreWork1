import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// get user input for integer to be reversed
		System.out.println("Enter a Number: ");
		
		//wait for user to input a number
		int num = input.nextInt();
		
		// verifying number to client
		System.out.println("Your number is: " + num);
		
		//place holder for number to be reversed
		int reverseNum = 0;
		
		/* integer inputed by client gets divided by 10 leaving the remainder of
		whatever is in the tens place to be added to the reverseNum. reverseNum is multiplied by 10 
		making room for the next tens place if it is available. The inputed number is divided by 10 
		removing the tens place in order to move on to the next number in the lowest tens place.
		
		*/
		while(num != 0){
			reverseNum = reverseNum * 10 + num%10;
			num = num / 10;
		}
		System.out.println("Your number in reverse is: " + reverseNum);
	}

}
