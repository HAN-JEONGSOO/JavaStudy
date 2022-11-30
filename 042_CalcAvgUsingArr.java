package programizExample;

public class CalcAvgUsingArr {

	public static void main(String[] args) {
		
		// 배열을 사용하여 평균 계산하는 프로그램
		
		double[] numArray = {24.6, 12.5, 75.3, -19.5, 24.9, -30.2};
		double sum = 0;
		
		for (double num: numArray)
		{
			sum += num;
			
		}
		
		double avg = sum / numArray.length;
		
		System.out.format("평균은: %.2f", avg);
		
		// <Output> 평균은: 14.60

	}

}
