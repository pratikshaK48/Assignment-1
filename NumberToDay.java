package numberToDay;

public class NumberToDay {

	public NumberToDay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int number = 5;
		
		switch (number)
		{
		case 0:
			System.out.println("The day associated with the number " + number + " Is Sunday");
			break;
			
		case 1:
			System.out.println("The day associated with the number " + number + " Is Monday");
			break;
			
		case 2:
			System.out.println("The day associated with the number " + number + " Is Tuesday");
			break;
			
		case 3:
			System.out.println( "The day associated with the number " + number + " Is  Wednesday");
			break;
			
		case 4:
			System.out.println("The day associated with the number " + number + " Is Thursday");
			break;
			
		case 5:
			System.out.println("The day associated with the number " + number + " Is Friday");
			break;
			
		case 6:
			System.out.println("The day associated with the number " + number + " Is Saturday");
			break;
		
		default:
			System.out.println("Enter a numberbetween Zero to Nine");
			break;
	}

	}
	}
