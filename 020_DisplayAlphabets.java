package programizExample;

public class DisplayAlphabets {

	public static void main(String[] args) {
		
		char alp;
		
		// 대문자 출력
		for (alp = 'A'; alp <= 'Z'; alp++)
		{
			System.out.print(alp + " ");
			
		}
		
		System.out.println();
		
		// 소문자 출력
		for (alp = 'a'; alp <= 'z'; alp++)
		{
			System.out.print(alp + " ");
			
		}

	}

}


/*
<Output>
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
a b c d e f g h i j k l m n o p q r s t u v w x y z 
*/
