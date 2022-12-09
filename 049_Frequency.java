package programizExample;

public class Frequency {

	public static void main(String[] args) {
		
		// 알파벳 빈도수 찾기
		
		String str = "Han Jeongsoo";
		char ch = 'o';
		int frequency = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (ch == str.charAt(i))
				++frequency;
			
		}
		
		System.out.println(str + "에서 " + ch + "는 " + frequency + "개 있습니다");

	}

}


/*
Han Jeongsoo에서 o는 3개 있습니다
*/
