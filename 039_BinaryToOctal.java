package programizExample;

public class BinaryToOctal {

	public static void main(String[] args) {
		
		// 이진수를 팔진수로 변환하는(반대로도) 자바 프로그램
		
		// 예 1: 이진수를 팔진수로 변환
		long binary = 1010010;
		int octal = convertBinaryToOctal(binary);
		System.out.println("이진수 " + binary + " = 팔진수 " + octal);
		
		/*
		<Output>
		이진수 1010010 = 팔진수 122
		*/
		
		// 예 2: 팔진수를 이진수로 변환
		int octal = 67;
		long binary = convertOctalToBinary(octal);
		System.out.println("팔진수 " + octal + " = 이진수 " + binary);
		
		/*
		<Output>
		팔진수 67 = 이진수 110111
		*/

	}
	
	public static int convertBinaryToOctal(long binaryNumber)
	{
		int octalNumber = 0;
		int decimalNumber = 0;
		int i = 0;
		
		while (binaryNumber != 0)
		{
			decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
			i++;
			binaryNumber /= 10;
			
		}
		
		i = 1;
		
		while (decimalNumber != 0)
		{
			octalNumber += (decimalNumber % 8) * i;
			decimalNumber /= 8;
			i *= 10;
			
		}
		
		return octalNumber;
		
	}
	
	
	public static long convertOctalToBinary(int octalNumber)
	{
		int decimalNumber = 0, i = 0;
		long binaryNumber = 0;

		while (octalNumber != 0)
		{
			decimalNumber += (octalNumber % 10) * Math.pow(8, i);
		    ++i;
		    octalNumber /= 10;
		    
		}

		i = 1;

		while (decimalNumber != 0)
		{
			binaryNumber += (decimalNumber % 2) * i;
		    decimalNumber /= 2;
		    i *= 10;
		    
		}

		return binaryNumber;
		    
	  }

}
