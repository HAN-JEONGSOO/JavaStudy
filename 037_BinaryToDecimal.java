package programizExample;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		// 이진수에서 십진수로 바꾸기, 그 반대로도 가능하도록
		
		// 예 1: 커스텀 메서드를 사용해 이진수를 십진수로 변환하기
		// 이진수
		long num = 1001001001;
		
		// 이진수를 통하는 메서드 호출
		int decimal = convertBinaryToDecimal(num);
		
		System.out.println("이진수를 십진수로");
		System.out.println(num + " = " + decimal);

/*
<Outout>
이진수를 십진수로
1001001001 = 585
*/
		
		// -----------------------------------------
		// 예 2: parseInt()를 사용해 이진수를 십진수로 변환하기
				// 이진수
		String binary = "100110101";
		
		// 십진수로 변환하기
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(binary + "를 십진수로 변환하면 " + decimal);

/*
<Output>
100110101를 십진수로 변환하면 309
*/

		// -----------------------------------------		
		// 예 3: 커스텀 메서드를 사용해 십진수를 이진수로 변환하기
				// 십진수
		int num = 19;
		System.out.println("십진수를 이진수로");
		
		// 이진수를 변환시키기 위한 메서드 호출
		long binary = convertDecimalToBinary(num);
		
		System.out.println("\n" + num + " = " + binary);

/*
<Output>
십진수를 이진수로
1단계 : 19/2
몫 = 9, 나머지 = 1
2단계 : 9/2
몫 = 4, 나머지 = 1
3단계 : 4/2
몫 = 2, 나머지 = 0
4단계 : 2/2
몫 = 1, 나머지 = 0
5단계 : 1/2
몫 = 0, 나머지 = 1

19 = 10011
*/
		// -----------------------------------------
		// 예 4: toBinaryString()을 사용해 십진수를 이진수로 변환하기
		// 십진수
		int decimal = 91;
		
		// 십진수에서 이진수로 변환시키기
		String binary = Integer.toBinaryString(decimal);
		System.out.println("십진수 " + decimal + "은 이진수로 " + binary);

/*
<Output>
십진수 91은 이진수로 1011011
*/

	}
	
	public static int convertBinaryToDecimal(long num)
	{
		int decimalNumber = 0;
		int i = 0;
		long remainder;
		
		while (num != 0)
		{
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			i++;
			
		}
		
		return decimalNumber;
		
	}



	public static long convertDecimalToBinary(int n)
	{
		long binaryNumber = 0;
		int remainder = 1;
		int i = 1;
		int step = 1;
		
		while (n != 0)
		{
			remainder = n % 2;
			System.out.println(step++ + "단계 : " + n + "/2");
			
			System.out.println("몫 = " + n/2 + ", 나머지 = " + remainder);
			n /= 2;
			
			binaryNumber += remainder * i;
			i *= 10;
			
		}
		
		return binaryNumber;
		
	}

	
}
