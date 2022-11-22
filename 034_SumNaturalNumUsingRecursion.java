package programizExample;

public class SumNaturalNumUsingRecursion {

	public static void main(String[] args) {
		
		// 재귀를 사용하여 자연수의 합 구하는 자바 프로그램
		
		int number = 5;
		int sum = addNumbers(number);
		
		System.out.println("합은 = " + sum);

	}
	
	public static int addNumbers(int num)
	{
		if (num != 0)
			return num + addNumbers(num - 1);
		else
			return num;
		
	}

}


/*
<Output>
합은 = 15
*/
