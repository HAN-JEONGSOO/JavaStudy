package programizExample;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundNum {

	public static void main(String[] args) {
		
		// 소숫점 n의 자릿수에서 반올림하는 자바 프로그램
		
		// 예 1: format을 사용하여 반올림 하기
		double num = 3.14159;
		
		System.out.format("%.4f", num); // 소숫점 네 번째 자리까지 표시
		
		/*
		<Output>
		3.1416
		*/
		
		
		// 예 2: DecimalFormat을 사용하여 반올림 하기
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println(df.format(num));
		
		/*
		<Output>
		3.142
		*/

	}

}
