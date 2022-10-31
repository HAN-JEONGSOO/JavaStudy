public class PositiveNegative {

	// 숫자가 양수인지 음수인지 if..else문을 사용하여 체크하기
	public static void main(String[] args) {
		
		double number = 12.3;
		
		// 숫자가 0보다 작을 경우
		if (number < 0.0)
			System.out.println(number + "은(는) 음수입니다");
		
		// 숫자가 0보다 클 경우
		else if (number > 0.0)
			System.out.println(number + "은(는) 양수입니다");
		
		// 위의 두 테스트에 통과되지 못할 경우
		else
			System.out.println(number + "은(는) 0입니다");

	}

}


/*
<Output>
12.3은(는) 양수입니다
*/
