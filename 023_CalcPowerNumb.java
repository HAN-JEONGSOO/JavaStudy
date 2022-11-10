package programizExample;

public class CalcPowerNumb {

	public static void main(String[] args) {
		
		// 제곱 계산하기
		int base = 2;
		int exponent = 14;
		long result = 1;

		
		// 예 1: while 루프로 제곱 계산하기
		while (exponent != 0)
		{
			result = result * base;
			exponent--;
			
		}
		
		System.out.println("정답은 " + result);
		
		
		
		// 예 2: for 루프로 제곱 계산하기
		for (; exponent != 0; exponent--)
		{
			result = result * base;
			
		}
		
		System.out.println("정답은 " + result);
		
		
		
		// 예 3: pow() 메서드로 제곱 계산하기
		int base2 = 3, exponent2 = -4;
		double result2 = Math.pow(base2, exponent2); // double 요소들을 long으로 된 result로 못바꾸기에 result를 double 형태로 새로 생성
		
		System.out.println("정답은 " + result2);
		
		
		
		// 예 4: 음수의 제곱 계산하기
		int base3 = -3, exponent3 = 2;
		double result3 = Math.pow(base3, exponent3);
		
		System.out.println("정답은 " + result3);


	}

}


/*
<Output>
정답은 16384
정답은 16384
정답은 0.012345679012345678
정답은 9.0
*/
