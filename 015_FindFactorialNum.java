// ex: 5 팩토리얼은 5*4*3*2*1 = 120

    // 예 1: for 루프로 팩토리얼 구하기
		
		int num = 5;
		long factorial = 1;
		for (int i = 1; i <= num; ++i)
		{
			// factorial = factorial * i
			factorial *= i;
			
		}
		System.out.printf("%d 팩토리얼은 %d", num, factorial);
		

/*
<Output>
5 팩토리얼은 120
*/



		// 예 2: BigInteger로 팩토리얼 구하기
		
		int num = 10;
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= num; ++i)
		{
			// factorial = factorial * i
			factorial = factorial.multiply(BigInteger.valueOf(i));
			
		}
		System.out.printf("%d 팩토리얼은 %d", num, factorial);
		

/*
<Output>
10 팩토리얼은 3628800
*/



		// 예 3: while 루프로 팩토리얼 구하기
		
		int num = 5, i = 1;
		long factorial = 1;
		while (i <= num)
		{
			factorial *= i;
			i++;
			
		}
		System.out.printf("%d 팩토리얼은 %d", num, factorial);
		

/*
<Output>
5 팩토리얼은 120
*/
