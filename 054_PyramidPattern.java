package programizExample;

public class PyramidPattern {

	public static void main(String[] args) {
		
		// 예 1: *로 하프 피라미드 만들기
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
		/*
		<Output>
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		
		*/

	}

}
