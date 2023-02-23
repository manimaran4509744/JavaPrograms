package org.javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int number=sc.nextInt();
//		int number1=number;

//		while(number>0) {
//			rem=number%10;
//			number=number/10;
//			rem=rem*rem*rem;
//			newNumber=newNumber+rem;
//			
//		}
//		if(number1==newNumber) {
//			System.out.println("This given number is armstrong number");
//		}
//		else {
//			System.out.println("This given number isn't armstrong number");
//		}

		// Print the armstrong number from 1 to 1000
		int rem = 0;
		int newNumber = 0;
		int number = 0;
		for (int i = 1; i <= 1000; i++) {
			number = i;

			while (number > 0) {
				rem = number % 10;
				rem = rem * rem * rem;
				newNumber = newNumber + rem;
				number = number / 10;

			}

			if (i == newNumber) {
				System.out.println(i);
			}

			newNumber = 0;
		}
	}
}
