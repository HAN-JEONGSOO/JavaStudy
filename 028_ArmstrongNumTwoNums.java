package programizExample;

public class ArmstrongNumTwoNums {

	public static void main(String[] args) {
		
		// 두 정수 사이의 암스트롱 수 구하기
		
		int low = 999;
		int high = 99999;
		
		for (int number = low + 1; number < high; number++)
		{
			int digits = 0;
			int result = 0;
			int originalNumber = number;
			
			// 몇 자리 수인지 계산한다
			while (originalNumber != 0)
			{
				originalNumber /= 10;
				digits++;
				
			}
			
			originalNumber = number;
			
			// 각 숫자의 n제곱 합을 포함하는 결과를 도출한다
			while (originalNumber != 0)
			{
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
				
			}
			
			if (result == number)
				System.out.print(number + " ");
			
		}

	}

}


/*
<Output>
1634 8208 9474 54748 92727 93084 
*/
