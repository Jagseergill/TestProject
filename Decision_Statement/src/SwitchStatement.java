import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		int day;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the day value>>");
		day = input.nextInt();
		
		String dayString;
		
		switch (day) {
		case 1:
		dayString = "Monday";
			
			break;
			case 2:
				dayString = "Tuesday";
				
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
				
			case 5:
				dayString ="Friday";
				break;

		default:
			dayString ="InvalidDay";
			break;
			
		}
		System.out.print(dayString);
		
		
	}

}
