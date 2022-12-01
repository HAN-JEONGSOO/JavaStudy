package programizExample;

public class LargestElemOfArr {

	public static void main(String[] args) {
		
		// 배열 내에서 가장 큰 원소 찾기
		
		double[] numArray = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
		double largest = numArray[0];
		
		for (double num: numArray)
		{
			if (largest < num)
				largest = num;
			
		}
		
		System.out.format("가장 큰 원소 = %.2f", largest);
		
		// <Output> 가장 큰 원소 = 55.50

	}

}
