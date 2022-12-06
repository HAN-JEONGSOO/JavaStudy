package programizExample;

public class AddMatrices {

	public static void main(String[] args) {
		
		int rows = 2, columns = 3;
		int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6} };
		int[][] secondMatrix = { {7, 8, 9}, {10, 11, 12} };
		
		// 두 배열을 합침
		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				
			}
			
		}
		
		// 결과 출력
		System.out.println("두 배열을 합치면 :");
		for (int[] row : sum)
		{
			for (int column : row)
			{
				System.out.print(column + "	");
				
			}
			System.out.println();
			
			/*
			두 배열을 합치면 :
			8	10	12	
			14	16	18
			*/
			
		}

	}

}
