package oddNumberInReverse;

public class OddNumberInReverse {

	public OddNumberInReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int numberFrom = 30;
        int numberTo = 0;
        
        System.out.println("Odd number list in reverse format from :" + numberFrom + " to " + numberTo + " is ");
        for (int i = numberFrom; i >= numberTo; i--)
        {
        	if(!(i % 2 == 0))
        	{
        		System.out.print(i);
        	}
        }
        
	}

}
