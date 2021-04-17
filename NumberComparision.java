package numberComparision;

public class NumberComparision {

	public NumberComparision() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int constantnumber = 60;
		int number = 20;

		if (number < constantnumber)
		 {
			System.out.println(number + " is less than " + constantnumber);
		 }
			
		else if (number > constantnumber)
		{
			System.out.println(number + " is greater than " + constantnumber);
		}

		else
		{
			System.out.println(number + " is equal to " + constantnumber);
		}
	}

}
