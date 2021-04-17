package sumOfEvenNumber;

public class SumOfEvenNumber {

	public SumOfEvenNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberFrom = 0;
		int numberTo = 15;
		
		System.out.println("Sum of even numbers by using For Loop");
	
		int Sum = 0;
		
		for (int i=numberFrom; i <= numberTo; i++) 
		{
			if(i % 2 == 0)
			{
				Sum = Sum + i;
				System.out.println(Sum);	
				
			}
		}
		
	}

}
