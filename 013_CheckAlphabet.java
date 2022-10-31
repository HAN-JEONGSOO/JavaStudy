public class Alphabet {

	// 알파벳인지 아닌지 체크하는 자바 프로그램
	public static void main(String[] args) {
		
		char something = '&';
		
		if ((something >= 'a' && something <= 'z') || (something >= 'A' && something <= 'Z'))
			System.out.println(something + "은(는) 알파벳입니다");
		else
			System.out.println(something + "은(는) 알파벳이 아닙니다");

	}

}


/*
<Output>
&은(는) 알파벳이 아닙니다
*/
