public class LeapYear {

	// 윤년을 체크하는 자바 프로그램
	public static void main(String[] args) {
		
		// 체크할 연도 선택
		int year = 1992;
		boolean leap = false;
		
		// 연도가 4로 나눠떨어진다면
		if (year % 4 == 0)
		{
			// 연도가 세기 시작과 맞아떨어진다면
			if (year % 100 == 0)
			{
				// 연도가 400으로 나눠 떨어진다면
				// 윤년으로 계산함
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
				
			}
			
			// 연도가 세기 시작이 아니라면
			else
				leap = true;
			
		}
		
		else
			leap = false;
		
		if (leap)
			System.out.println(year + "년은 윤년입니다");
		else
			System.out.println(year + "년은 윤년이 아닙니다");

	}

}


/*
<Output>
1992년은 윤년입니다
*/
