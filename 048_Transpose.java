package programizExample;

public class Transpose {

	public static void main(String[] args) {
		
		// 행렬 뒤집어 바꾸기 (예: 2*3 행렬 ==> 3*2 행렬)
		
		int row 	= 2;
		int column 	= 3;
		int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
	
		// 현재 행렬 출력
		display(matrix);
		
		// 행렬 뒤바꾸기
		int[][] transpose = new int[column][row];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				transpose[j][i] = matrix[i][j];
				
			}
			
		}
		
		// 뒤바뀌어진 행렬 출력
		display(transpose);

	}
	
	
	public static void display(int[][] matrix)
	{
		System.out.println("행렬은 : ");
		for (int[] row : matrix)
		{
			for (int column : row)
			{
				System.out.print(column + "		");
				
			}
			System.out.println();
			
		}
		
	}

}



/*
행렬은 : 
1		2		3		
4		5		6		
행렬은 : 
1		4		
2		5		
3		6
*/
