// 이차방정식의 모든 해 찾는 자바프로그램
public class Main {

	public static void main(String[] args) {
		
		// a,b,c의 값
		double a = 2.3, b = 4, c = 5.6;
		double root1, root2;
		
		// 결정적인 식 계산
		double determinant = b * b - 4 * a * c;
		
		// 결정식이 0보다 큰지 확인
		if (determinant > 0)
		{
			
			// 두 식으로 나눠서 계산
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
			
		}
		
		// 결정식이 0일 경우
		else if (determinant == 0)
		{
			
			// -b + 0 == -b다
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f", root1);
			
		}
		
		// 결정식이 0보다 작을 경우
	    else
	    {

	      // 해는 복소수
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	    
	    }

	}

}
