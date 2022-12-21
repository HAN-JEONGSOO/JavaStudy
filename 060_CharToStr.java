package programizExample;

import java.util.Arrays;

public class CharToStr {

	public static void main(String[] args) {
		
		// 문자를 문자열로 변환하는 자바 프로그램 (+ 그 반대로도 변환)
		
		// 예 1: char ==> String 변환
		char ch1 	= 'h';
		String st 	= Character.toString(ch1);
		// 또는 st 	= String.valueOf(ch);
		
		System.out.println("String으로 바꾼 결과는 : " + st);
		
		/*
		<Output>
		String으로 바꾼 결과는 : h
		*/
		
		// ---------------------------------------
		
		// 예 2: char배열 ==> String 변환
		char[] ch2 = {'a', 'e', 'i', 'o', 'u'};
		
		String st1 = String.valueOf(ch2);
		String st2 = new String(ch2);
		
		System.out.println(st1);
		System.out.println(st2);
		
		/*
		<Output>
		aeiou
		aeiou
		*/
		
		// ---------------------------------------
		
		// 예 3: String ==> char배열
		String st3 = "I am Legend";
		
		char[] ch3 = st3.toCharArray();
		System.out.println(Arrays.toString(ch3));
		
		/*
		<Output>
		[I,  , a, m,  , L, e, g, e, n, d]
		*/

	}

}
