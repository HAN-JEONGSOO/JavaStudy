public class SumNatural {

	// 자연수들의 합을 구하는 자바 프로그램
	public static void main(String[] args) {
		
		// 예 1: for 루프로 자연수들의 합 구하기
		int num = 100, sum =  0;
		
		for (int i = 1; i <= num; ++i)
		{
			// 합계 = 합계 + i;
			sum += i;
			
		}
		
		System.out.println("합계 = " + sum);


		/*
    <Output>
    합계 = 5050
    */
		


		// 예 2: while 루프로 자연수들의 합 구하기
		int num = 50, i = 1, sum = 0;
		
		while (i <= num)
		{
			sum += i;
			i++;
			
		}
		
		System.out.println("합계 = " + sum);
		
	}


    /*
    <Output>
    합계 = 1275
    */

}
