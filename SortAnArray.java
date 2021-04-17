package sortAnArray;


public class SortAnArray {

	public SortAnArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {20, 14, 48, 9, 5, 3, 25, 7};
		System.out.println("Numbers In Array Sorted As :");
		for(int i = 0; i < numbers.length; i++) {
			for(int j = (i+1); j < numbers.length; j++) {
				if(numbers[i] > numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] =temp;
				}
			}
			
		}
		for(int i = 0; i < numbers.length; i++)
		System.out.println(numbers[i] );
		
	}

}
