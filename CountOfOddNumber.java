package countOfOddNumber;

public class CountOfOddNumber {

	public CountOfOddNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberFrom = 0;
		int numberTo = 20;
		
		System.out.println(" Total Sum of odd numbers from " + numberFrom + " to number " + numberTo +  " by using For Loop ");
	
        int Sum = 0;
		
		for (int i=numberFrom; i <= numberTo; i++) 
		{
			if(i % 2 != 0)
			{
				Sum = Sum + i;
				System.out.println(Sum);
	}

}}} 
