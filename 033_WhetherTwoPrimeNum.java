package programizExample;

public class WhetherTwoPrimeNum {

	public static void main(String[] args) {
		
		// 어떤 수가 두 소수의 합으로 표현될 수 있는지 없는지에 대한 자바 프로그램
		
		int number = 34;
		boolean flag = false;
		for (int i = 2; i <= number; i++)
		{
			// i가 소수인지를 체크
			if (checkPrime(i))
			{
				// n-i 또한 소수인지를 체크
				if (checkPrime(number - i))
				{
					// n = primeNumber1 + primeNumber2
					System.out.printf("%d = %d + %d\n", number, i, number - i);
					flag = true;
					
				}
				
			}
			
		}
		
		if (!flag)
			System.out.println(number + "는 두 소수의 합으로 표현할 수 없습니다");

	}
	
	// 소수인지 확인을 위한 함수
	static boolean checkPrime(int num)
	{
		boolean isPrime = true;
		
		for (int i = 2; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				isPrime = false;
				break;
				
			}
			
		}
		
		return isPrime;
		
	}

}


/*
<Output>
34 = 3 + 31
34 = 5 + 29
34 = 11 + 23
34 = 17 + 17
34 = 23 + 11
34 = 29 + 5
34 = 31 + 3
*/
