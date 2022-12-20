package programizExample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeString {

	public static void main(String[] args) {
		
		// 예 1: 미리 정의된 형식을 사용하여 문자열을 날짜로 변환하기
		
		// y-M-d 혹은 yyyy-MM-d 구성 방식
		String str1 = "2022-12-20";
		LocalDate date1 = LocalDate.parse(str1, DateTimeFormatter.ISO_DATE);
		
		System.out.println(date1);
		
		/*
		<Output>
		2022-12-20
		*/
		
		
		// 예 2: 패턴 포맷터를 사용하여 문자열을 날짜로 변환하기
		String str2 = "December 20, 2022";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date2 = LocalDate.parse(str2, formatter);
		
		System.out.println(date2);
		
		/*
		<Output>
		2022-12-20
		*/

	}

}
