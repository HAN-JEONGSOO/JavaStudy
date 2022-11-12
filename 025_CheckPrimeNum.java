package programizExample;

public class CheckPrimeNum {

	public static void main(String[] args) {
		
		// 예 1: for 루프로 소수 판별하기
		int num = 29;
		boolean flag = false;
		for (int i = 2; i <= (num / 2); i++)
		{
			// 소수가 아닌 숫자인지 체크
			if (num % i == 0)
			{
				flag = true;
				break;
				
			}
			
		}
		
		if (!flag)
			System.out.println(num + " : 소수가 맞습니다");
		else
			System.out.println(num + " : 소수가 아닙니다");
		
		
		
		// 예 2: while 루프로 소수 판별하기
		int num = 42;
		int i = 2;
		boolean flag = false;
		
		while (i <= num / 2)
		{
			if (num % i == 0)
			{
				flag = true;
				break;
				
			}
			
			i++;
			
		}
		
		if (!flag)
			System.out.println(num + " : 소수가 맞습니다");
		else
			System.out.println(num + " : 소수가 아닙니다");

	}

}
