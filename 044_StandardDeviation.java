package programizExample;

public class StandardDeviation {

	public static void main(String[] args) {
		
		// 표준편차 계산하는 자바 프로그램
		
		double[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double SD = calculateSD(numArray);
		
		System.out.format("표준편차 = %.6f", SD);
		
		// <Output> 표준편차 = 2.872281

	}
	
	
	public static double calculateSD(double numArray[])
	{
		double sum = 0.0;
		double standardDeviation = 0.0;
		int length = numArray.length;
		
		for (double num: numArray)
		{
			sum += num;
			
		}
		
		double mean = sum / length;
		
		for (double num: numArray)
		{
			standardDeviation += Math.pow(num - mean, 2);
			
		}
		
		return Math.sqrt(standardDeviation / length);
		
	}

}
