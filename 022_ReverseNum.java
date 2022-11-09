package programizExample;

public class ReverseNum {

	public static void main(String[] args) {
		
// while 루프
		int num = 1234;
		int reversed = 0;
		
		System.out.println("기존의 수는: " + num);
		
		// 수가 0이 될 때까지 루프 돌리기
		while (num != 0)
		{
			// 마지막 숫자 알아내기
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			
			// 마지막 숫자 지우기
			num = num / 10;
			
		}
		
		System.out.println("뒤집은 결과는: " + reversed);


/*
<Output>
기존의 수는: 1234
뒤집은 결과는: 4321
*/


// for 루프
		int num = 1234567;
		int reversed = 0;
		
		for (; num != 0; num /= 10)
		{
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			
		}
		
		System.out.println("뒤집은 결과는: " + reversed);


/*
<Output>
뒤집은 결과는: 7654321
*/
		

	}

}
