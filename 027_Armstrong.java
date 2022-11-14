package programizExample;

public class Armstrong {

	public static void main(String[] args) {

		// 암스트롱 숫자인지 확인하기
		// e.g.) 153은 1^3 + 5^3 + 3^3 이 참이므로 암스트롱 숫자가 맞다
		
		int num = 370;
		int originalNum;
		int remainder;
		int result = 0;
		
		originalNum = num;
		
		while (originalNum != 0)
		{
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum = originalNum / 10;
			
		}
		
		if (result == num)
			System.out.println(num + " : 암스트롱 숫자 맞음");
		else
			System.out.println(num + " : 암스트롱 숫자가 아님");
		
	}
	
}
