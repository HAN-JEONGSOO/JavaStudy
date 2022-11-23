package programizExample;

import java.util.Scanner;

public class FindFactorialRecursion {

	public static void main(String[] args) {
		
		// 재귀를 사용하여 팩토리얼 수 찾기
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long factorial = multiplyNum(num);
		System.out.println(num + "팩토리얼은 : " + factorial);

	}
	
	public static long multiplyNum(int num) {
		
		if (num >= 1)
			return num * multiplyNum(num - 1);
		else
			return 1;
		
	}

}


/*
<Output>
10
10팩토리얼은 : 3628800
*/
