package programizExample;

import java.util.Arrays;

public class ConcatArrays {

	public static void main(String[] args) {
		
		// 두 배열을 연결하는 자바 프로그램
		
		// 예 1: arraycopy를 사용하여 두 배열 연결하기
		int[] arr1 = {11, 33, 55};
		int[] arr2 = {22, 44, 66};
		
		int aLen = arr1.length;
		int bLen = arr2.length;
		int[] result1 = new int[aLen + bLen];
		
		System.arraycopy(arr1, 0, result1, 0, aLen);		// arr1을 index0에서 aLen만큼 복사
		System.arraycopy(arr2, 0, result1, aLen, bLen);	// arr2를 index(aLen)에서 bLen만큼 복사
		
		System.out.println(Arrays.toString(result1));
		
		/*
		<Output>
		[11, 33, 55, 22, 44, 66]
		*/
		
		// ------------------------------------------
		
		// 예 2: arraycopy 없이 두 배열 연결하기
		int length = arr1.length + arr2.length;
		
		int[] result2 = new int[length];
		int pos = 0;
		
		for (int element : arr1)
		{
			result2[pos] = element;
			pos++;
			
		}
		
		for (int element : arr2)
		{
			result2[pos] = element;
			pos++;
			
		}
		
		System.out.println(Arrays.toString(result2));
		
		/*
		<Output>
		[11, 33, 55, 22, 44, 66]
		*/

	}

}
