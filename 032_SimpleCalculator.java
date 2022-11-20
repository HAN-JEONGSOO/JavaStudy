package programizExample;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		char operator; // 연산자
		Double number1, number2, result;
		
		// 1) 스캐너 클래스의 객체를 생성한다
		Scanner input = new Scanner(System.in);
		
		// 2) 사용자에게 연산자의 입력을 요청한다
		System.out.println("+, -, *, / 중의 연산자 중 한가지를 고르세요");
		operator = input.next().charAt(0);
		
		// 3) 사용자에게 숫자의 입력을 요청한다
		System.out.println("첫 번째 수를 입력하세요");
		number1 = input.nextDouble();
		
		System.out.println("두 번째 수를 입력하세요");
		number2 = input.nextDouble();
		
		
		switch (operator)
		{
		// 두 수의 합을 구현
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // 두 수의 차를 구현
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // 두 수의 곱을 구현
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // 두 수의 나눔을 구현
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("올바르지 않은 연산자입니다");
	        break;
		
		}
		
		input.close();

	}

}



/*
<Output>
+, -, *, / 중의 연산자 중 한가지를 고르세요
*
첫 번째 수를 입력하세요
4
두 번째 수를 입력하세요
9
4.0 * 9.0 = 36.0
*/
