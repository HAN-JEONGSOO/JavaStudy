package programizExample;

public class OctalToDecimal {

	public static void main(String[] args) {
		
		// 팔진수를 십진수로 변환하는 자바 프로그램
		
		// 예 1: 십진수를 팔진수로 변환
		int decimal = 78; // 십진수
		int octal 	= convertDecimalToOctal(decimal);
		System.out.printf("십진수 %d = 팔진수 %d", decimal, octal);

/*
<Output>
십진수 78 = 팔진수 116
*/
		
		// 예 2: 팔진수를 십진수로 변환
		int octal = 116;
		int decimal = convertOctalToDecimal(octal);
		System.out.printf("팔진수 %d = 십진수 %d", octal, decimal);

/*
<Output>
팔진수 116 = 십진수 78
*/

	}
	
	public static int convertDecimalToOctal(int decimal)
	{
		int octalNumber = 0;
		int i = 1;
		
		while (decimal != 0)
		{
			octalNumber += (decimal % 8) * i;
			decimal /= 8;
			i *= 10;
			
		}
		
		return octalNumber;
		
	}
	
	
	
	public static int convertOctalToDecimal(int octal)
	{
		int decimalNumber = 0;
		int i = 0;
		
		while (octal != 0)
		{
			decimalNumber += (octal % 10) * Math.pow(8, i);
			i++;
			octal /= 10;
			
		}
		
		return decimalNumber;
		
	}

}
