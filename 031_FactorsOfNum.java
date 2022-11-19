package programizExample;

public class FactorsOfNum {

	public static void main(String[] args) {
		
		// 인수 구하는 자바 프로그램
		
		// 예 1: 양의 정수의 인수 구하기
		
		// 1) 양수를 설정한다
		int number = 24;
		
		System.out.print(number + "의 인수는 : ");
		
		// 2) 1부터 24까지 루프를 돌린다
		for (int i = 1; i <= number; i++)
		{
			// 만약 number가 i로 나누어 떨어진다면
			// i는 인수가 됨
			if (number % i == 0)
				System.out.print(i + " ");
			
		}


/*
<Output>
24의 인수는 : 1 2 3 4 6 8 12 24 
*/
		
		
		// 예 2: 음수의 인수 구하기
		
		// 1) 음수를 설정한다
		int number = -24;
		System.out.print(number + "의 인수는 : ");
		
		// 2) -24부터 24까지 루프를 돌린다
		for (int i = number; i <= Math.abs(number); i++)
		{
			// i = 0 이 반복되므로 건너뛴다
			if (i == 0)
				continue;
			else
			{
				if (number % i == 0)
					System.out.print(i + " ");
				
			}
			
		}

/*
<Output>
-24의 인수는 : -24 -12 -8 -6 -4 -3 -2 -1 1 2 3 4 6 8 12 24 
*/
		

	}

}
