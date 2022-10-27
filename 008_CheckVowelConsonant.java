// 예 1: if..else 구문으로 알파벳이 모음인지 자음인지 체크하기

public class VowelConsonant {

	public static void main(String[] args) {
		
		// Example 1: if..else 구문으로 알파벳 모음 자음 체크하기
		
		char ch = 'i';
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + "은(는) 모음입니다");
		else
			System.out.println(ch + "은(는) 자음입니다");

	}

}


/*
<Output>
i은(는) 모음입니다
*/
