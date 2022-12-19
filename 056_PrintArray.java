package programizExample;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		// 예 1: for 루프로 배열 출력하기
		int[] array = {14, 52, 23, 75, 95};
		
		for (int element: array)
		{
			System.out.println(element);
			
		}
		
		/*
		<Output>
		14
		52
		23
		75
		95
		*/
		
		
		// 예 2: 표준 라이브러리 배열을 사용하여 배열 출력하기
		System.out.println(Arrays.toString(array));
		
		/*
		<Output>
		[14, 52, 23, 75, 95]
		*/
		
		
		// 예 3: 다차원 배열 출력하기
		int[][] MulArr = {{1, 2}, {3, 4}, {5, 6, 7}};
		
		System.out.println(Arrays.deepToString(MulArr));
		
		/*
		<Output>
		[[1, 2], [3, 4], [5, 6, 7]]
		*/

	}

}
