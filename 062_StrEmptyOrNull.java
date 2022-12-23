package programizExample;

public class StrEmptyOrNull {

	public static void main(String[] args) {
		
		// String이 비어있는지 null인지 확인하는 자바 프로그램
		
		// 1) null과 공백과 일반적인 String 만들기
	    String str1 = null;
	    String str2 = "";
	    String str3 = "  ";

	    // 2-1) str1이 null인지 비어있는지 확인
	    System.out.println("str1은 " + isNullEmpty(str1));

	    // 2-2) str2가 null인지 비어있는지 확인
	    System.out.println("str2는 " + isNullEmpty(str2));

	    // 2-3) str3이 null인지 비어있는지 확인
	    System.out.println("str3은 " + isNullEmpty(str3));
	  }

	  // string이 null인지 비어있는지 확인하는 메서드
	  public static String isNullEmpty(String str) {

	    // string이 null인지 확인
	    if (str == null) {
	      return "null입니다";
	    }

	    // string이 비어있는지 확인
	    else if(str.isEmpty()){
	      return "비어있습니다";
	    }

	    else {
	      return "null이 아니고 비어있지도 않습니다";
	    }
	    
	  }

}
