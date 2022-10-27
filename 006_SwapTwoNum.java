public class SwapNumbers {

	public static void main(String[] args) {
		
		float first = 1.20f, second = 2.45f;
		
		System.out.println("--뒤바꾸기 전--");
		System.out.println("첫 번째 숫자 = " + first);
		System.out.println("두 번째 숫자 = " + second);
		
		// 첫 번째 값은 임시로 할당됨
		float temporary = first;
		
		// 두 번째 값은 첫 번째로 할당됨
		first = second;
		
		// 임시 값(첫 번째 값의 초기 값을 포함한 것)이 두 번째에 할당됨
		second = temporary;
		
		System.out.println("--뒤바꾼 후--");
		System.out.println("첫 번째 숫자 = " + first);
		System.out.println("두 번째 숫자 = " + second);

	}

}


/*
<Output>
--뒤바꾸기 전--
첫 번째 숫자 = 1.2
두 번째 숫자 = 2.45
--뒤바꾼 후--
첫 번째 숫자 = 2.45
두 번째 숫자 = 1.2
*/
