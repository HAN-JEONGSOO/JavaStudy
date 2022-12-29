package programizExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime {

	public static void main(String[] args) {
		
		// 현재 날짜와 시각 표시하기
		
		// 예 1: default format 으로 현재 날짜와 시각 구하기
		LocalDateTime current = LocalDateTime.now();
		
		System.out.println("현재 날짜와 시각은 : " + current);
		
		/*
		<Output>
		현재 날짜와 시각은 : 2022-12-29T10:24:58.914897900
		*/
		
		
		
		// 예 2: pattern 으로 현재 날짜와 시각 구하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String formatted = current.format(formatter);
		
		System.out.println("현재 날짜와 시각은 : " + formatted);
		
		/*
		<Output>
		현재 날짜와 시각은 : 2022-12-29 10:24:58.914
		*/
		
		
		
		// 예 3: 미리 정의된 상수를 사용하여 현재 날짜와 시각 구하기
		DateTimeFormatter formatter2 = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted2 = current.format(formatter2);
        
        System.out.println("현재 날짜와 시각은 : " + formatted2);
        
        /*
        <Output>
        현재 날짜와 시각은 : 20221229
        */
        
        
        
        // 예 4: 현지화된 스타일로 현재 날짜와 시각 구하기
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted3 = current.format(formatter3);
        
        System.out.println("현재 날짜와 시각은 : " + formatted3);
        
        /*
        <Output>
        현재 날짜와 시각은 : 2022. 12. 29. 오전 10:24:58
        */

	}

}
