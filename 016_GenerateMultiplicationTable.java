public class MultiplicationTable {

	public static void main(String[] args) {
		// 예 1: for 루프로 구구단 만들기
		
		int dan = 5;
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
			
		}


/*
<Output>
5 * 1 = 5 
5 * 2 = 10 
5 * 3 = 15 
5 * 4 = 20 
5 * 5 = 25 
5 * 6 = 30 
5 * 7 = 35 
5 * 8 = 40 
5 * 9 = 45 
5 * 10 = 50 
*/
		
		
		// 예 2: while 루프로 구구단 만들기
		
		int num = 9, i = 1;
		while (i <= 10)
		{
			System.out.printf("%d * %d = %d \n", num, i, num * i);
			i++;
			
		}


/*
<Output>
9 * 1 = 9 
9 * 2 = 18 
9 * 3 = 27 
9 * 4 = 36 
9 * 5 = 45 
9 * 6 = 54 
9 * 7 = 63 
9 * 8 = 72 
9 * 9 = 81 
9 * 10 = 90 
*/

	}

}
