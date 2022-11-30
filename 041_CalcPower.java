package programizExample;

public class CalcPower {

	public static void main(String[] args) {
		
		// 제곱근 구하는 프로그램
		
		int base 		= 2;
		int powerRaised	= 10;
		
		int result = power(base, powerRaised);
		
		System.out.println(base + "의 " + powerRaised + "제곱은 " + result);
		
		// <Output>	2의 10제곱은 1024

	}
	
	public static int power (int base, int powerRaised)
	{
		if (powerRaised != 0)
			// 제곱을 재귀한다
			return (base * power(base, powerRaised - 1));
		else
			return 1;
		
	}

}
