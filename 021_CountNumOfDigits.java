package programizExample;

import java.util.Scanner;

public class NumOfDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 예 1: while 루프로 정수의 자릿수 구하기
		
		int count = 0;
		int num = scanner.nextInt();
		
		while (num != 0)
		{
			num /= 10;
			++count;
			
		}
		
		System.out.println(count + "자리입니다");


/*
<Output>
102938291
9자리입니다
*/


		
		// 예 2: for 루프로 정수의 자릿수 구하기
		
		int count = 0;
		int num = scanner.nextInt();
		
		for (; num != 0; num /= 10, ++count)
		{
			
		}
		
		System.out.println(count + "자리입니다");
		

/*
<Output>
12412
5자리입니다
*/


	}

}
