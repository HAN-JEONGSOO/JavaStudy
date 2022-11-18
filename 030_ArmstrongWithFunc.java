package programizExample;

public class ArmstrongWithFunc {

	public static void main(String[] args) {
		
		// 함수를 사용하여 암스트롱 수 표시하기
		int low 	= 999;
		int high 	= 99999;
		
		for (int number = low + 1; number < high; number++)
		{
			if (checkArmstrong(number))
				System.out.print(number + " ");
			
		}
		

	}
	
	public static boolean checkArmstrong(int num)
	{
		int digits = 0;
		int result = 0;
		int originalNum = num;
		
		// 자릿수 계산하기
		while (originalNum != 0)
		{
			originalNum /= 10;
			digits++;
			
		}
		
		originalNum = num;
		
		// 그 자릿수 별로 제곱을 하여 더한 결과
		while (originalNum != 0)
		{
			int remainder = originalNum % 10;
			result += Math.pow(remainder, digits);
			originalNum /= 10;
			
		}
		
		if (result == num)
			return true;
		
		return false;
		
	}

}


/*
<Output>
1634 8208 9474 54748 92727 93084
*/
