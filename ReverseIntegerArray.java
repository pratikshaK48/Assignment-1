package reverseIntegerArray;


public class ReverseIntegerArray {

	public ReverseIntegerArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num[] = {11, 22, 33, 44, 55};
        int startIndex = 0;
        int endIndex = num.length - 1;
        int temp = 0;
       
        System.out.println("Before swaping array contains values as :  ");
        for (int i = 0; i< num.length; i++) {
        	System.out.println(num [i] + " " );
        }
   for(int i = 0; i< (num.length)/2; i++) 
       {
	   temp = num[startIndex];
       num[startIndex] = num[endIndex];
       num[endIndex] = temp;
       startIndex++;
       endIndex--;
       }
		
      System.out.println("After swaping array contains values as :  ");
      for (int i = 0; i< num.length; i++) {
      	System.out.println(num [i] + " " );
      
		
		
		
		
		
		
	}

}
}
