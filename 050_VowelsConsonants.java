package programizExample;

public class VowelsConsonants {

	public static void main(String[] args) {
		
		// 문장의 모음과 자음의 갯수 세는 프로그램
		
		String line = "It ain't over till it's over.";
	    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);

	      // check if character is any of a, e, i, o, u
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        ++vowels;
	      }

	      // check if character is in between a to z
	      else if ((ch >= 'a' && ch <= 'z')) {
	        ++consonants;
	      }
	      
	      // check if character is in between 0 to 9
	      else if (ch >= '0' && ch <= '9') {
	        ++digits;
	      }
	      
	      // check if character is a white space
	      else if (ch == ' ') {
	        ++spaces;
	      }
	    }

	    System.out.println("모음 : " + vowels);
	    System.out.println("자음 : " + consonants);
	    System.out.println("숫자 : " + digits);
	    System.out.println("공백 : " + spaces);

	}

}


/*
모음 : 9
자음 : 12
숫자 : 0
공백 : 5
*/
