import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = reader.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + "은 짝수입니다");
		else
			System.out.println(num + "은 홀수입니다");

	}

}


/*
숫자를 입력하세요: 
813
813은 홀수입니다
*/
