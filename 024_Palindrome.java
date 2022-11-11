package programizExample;

public class Palindrome {

	public static void main(String[] args) {
		
		// 예 1: 문자열의 대칭 여부 확인하기
		String str = "Hannah";
		String reverseStr = "";
		
		int strLength = str.length();
		
		for (int i = strLength; i > 0; i--)
		{
			reverseStr = reverseStr + str.charAt(i - 1);
			
		}
		
		if (str.toLowerCase().equals(reverseStr.toLowerCase()))
			System.out.println(str + " : 대칭 문자열입니다");
		else
			System.out.println(str + " : 대칭 문자열이 아닙니다");
		
		
		
		// 예 2: 숫자의 대칭 여부 확인하기
		int num = 1234321;
		int reversedNum = 0;
		int remainder;
		
		// 원본 숫자 저장하기
		int originalNum = num;
		
		// 원본 숫자를 뒤집은 대칭 숫자를 만들고 변수에 저장하기
		while (num != 0)
		{
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
			
		}
		
		// 만들어진 대칭 숫자와 원본 숫자가 같은지 확인하기
		if (originalNum == reversedNum)
			System.out.println(originalNum + " : 대칭 숫자열입니다");
		else
			System.out.println(originalNum + " : 대칭 숫자열이 아닙니다");

	}

}



/*
<Output>
Hannah : 대칭 문자열입니다
1234321 : 대칭 숫자열입니다
*/
