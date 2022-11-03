// 피보나치 수 : 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열. 처음 여섯 항은 각각 1, 1, 2, 3, 5, 8. 편의상 0번째 항을 0으로 두기도 함.


public class Fibonacci {

	public static void main(String[] args) {
		
		// 예 1: for 루프로 피보나치 수열 출력하기
		
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("피보나치 수열을 " + n + "개까지 나열:");
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print(firstTerm + ", ");
			
			// 다음 term을 계산하기
			int nextTerm 	= firstTerm + secondTerm;
			firstTerm 		= secondTerm;
			secondTerm 		= nextTerm;
			
		}

/*
<Output>
피보나치 수열을 10개까지 나열:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
*/
		
		
		
		// 예 2: while 루프로 피보나치 수열 출력하기
		
		int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("피보나치 수열을 " + n + "개까지 나열:");
		
		while (i <= n)
		{
			System.out.print(firstTerm + ", ");
			
			int nextTerm 	= firstTerm + secondTerm;
			firstTerm 		= secondTerm;
			secondTerm 		= nextTerm;
			
			i++;
			
		}

/*
<Output>
피보나치 수열을 10개까지 나열:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
*/
		
		
		
		// 예 3: 주어진 숫자 내의 피보나치 수열 출력하기
		
		int n = 100, firstTerm = 0, secondTerm = 1;
		
		System.out.println(n + "까지의 피보나치 수열:");
		
		while (firstTerm <= n)
		{
			System.out.print(firstTerm + ", ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}

/*
<Output>
100까지의 피보나치 수열:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
*/
		
		
	}

}
