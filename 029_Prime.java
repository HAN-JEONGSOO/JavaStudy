package programizExample;

public class Prime {

	public static void main(String[] args) {
		
		// 함수를 이용한 구간 소수 표시
		// 두 정수 사이의 소수
		
		int low		= 20;
		int high 	= 50;
		
		while (low < high)
		{
			if (checkPrimeNumber(low))
				System.out.print(low + " ");
			
			low++;
			
		}

	}
	
	public static boolean checkPrimeNumber(int num) {
		
		boolean flag = true;
		
		for (int i = 2; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				flag = false;
				break;
				
			}
			
		}
		
		return flag;
		
	}

}


/*
<Output>
23 29 31 37 41 43 47
*/
