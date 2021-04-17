package countOfPrimeNumber;

public class CountOfPrimeNumber {

	public CountOfPrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,5,6,8,11,14,17,18,20};
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (checkNumIsPrime(numbers[i])) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}
	public static boolean checkNumIsPrime(int a)
	{
		if (a>=2) {
			int temp = 0;
			for(int i = 2; i<a-1; i++) {
				if(a % i == 0) {
					temp = temp+1;
				}
			}
			if(temp == 0) {
				return true;
				}
			else {
			    return false;
				}
		}
		else {
			return false;
	}

}}
