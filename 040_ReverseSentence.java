package programizExample;

public class ReverseSentence {

	public static void main(String[] args) {
		
		// 재귀를 사용한 문장 뒤집기
		String sentence = "Show me the money";
		String reversed = reverse(sentence);
		System.out.println("뒤집은 문장은 : " + reversed);
		
		/*
		뒤집은 문장은 : yenom eht em wohS
		*/

	}
	
	public static String reverse(String sentence)
	{
		if (sentence.isEmpty())
			return sentence;
		
		return reverse(sentence.substring(1)) + sentence.charAt(0);
		
	}

}
