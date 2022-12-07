package programizExample;

public class MultiplyMatrices {

	public static void main(String[] args) {
		
		// 두 배열의 곱셈
		
		int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // 두 배열을 곱한다
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // 계산 결과
        System.out.println("두 행렬의 곱셈은 : ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

	}

}


/*
<Output>
두 행렬의 곱셈은 : 
24    29    
6    25    
*/
