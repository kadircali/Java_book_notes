package kadircali.controlFlows;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * control flows :Directing our code based on conditions
		 * 
		 * if-else if-else
		 */

		Scanner scanner = new Scanner(System.in);

//		System.out.print("Please enter your grade: ");
//		double averageGrade = scanner.nextDouble();
//
//		String letterGrade;
//
//		if (averageGrade >= 90) {
//			letterGrade = "AA";
//		} else if (averageGrade >= 80) {
//			letterGrade = "BB";
//		} else if (averageGrade >= 70) {
//			letterGrade = "CC";
//		} else if (averageGrade >= 60) {
//			letterGrade = "DD";
//		} else {
//			letterGrade = "FF";
//		}
//
//		System.out.println("Your Letter Grade: " + letterGrade);

//		System.out.print("Please enter the first number: ");
//		double firstNumber = scanner.nextDouble();
//
//		System.out.print("Please enter the second number: ");
//		double secondNumber = scanner.nextDouble();
//
//		if (firstNumber > secondNumber) {
//			System.out.println("The first number is larger.");
//		} else if (firstNumber < secondNumber) {
//			System.out.println("The second number is larger.");
//		} else {
//			System.out.println("Both numbers are equal.");
//		}

		// switch
//		 System.out.print("Please enter a number (1-7) for the day of the week: ");
//	        int day = scanner.nextInt();
//	        
//	        String dayName;
//	        
//	        switch (day) {
//	            case 1:
//	                dayName = "Monday";
//	                break;
//	            case 2:
//	                dayName = "Tuesday";
//	                break;
//	            case 3:
//	                dayName = "Wednesday";
//	                break;
//	            case 4:
//	                dayName = "Thursday";
//	                break;
//	            case 5:
//	                dayName = "Friday";
//	                break;
//	            case 6:
//	                dayName = "Saturday";
//	                break;
//	            case 7:
//	                dayName = "Sunday";
//	                break;
//	            default:
//	                dayName = "Invalid input! Please enter a number between 1 and 7.";
//	                break;

		// new switch

//		int n1 = 3;
//		switch (n1) {
//		
//		case 1,3,5,7,9 -> System.out.println("odd");
//		case 0,2,4,6,8 -> System.out.println("even");
//		}

		// swtich can return values
//		int weekDay = 7 ;
//		String msg = switch(weekDay) {
//		case 1,2,3,4,5 -> "work all day";
//		case 6 -> "work half day";
//		case 7 -> "holiday";
//		default ->"unknown day" ;
//		} ;
//		System.out.println(msg);

		/*
		 * If multiple lines of code need to be written within a case of a switch
		 * expression that returns a value, the yield keyword is used to return the
		 * value.
		 */

//		int n1 = 5;
//		String msg = switch (n1) {
//
//		case 1, 3, 5, 7, 9 -> {
//			System.out.println("odd");
//			yield "odd";
//
//		}
//		case 2, 4, 6, 8 -> {
//			System.out.println("even");
//			yield "even";
//		}
//		
//		default -> "nothing" ;
//		};
//		System.out.println(msg);
	}
}
