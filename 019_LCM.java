package programizExample;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// while문을 써서 최소공배수 구하기

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int lcm = (num1 > num2) ? num1 : num2;
		
		while (true)
		{
			if (lcm % num1 == 0 && lcm % num2 == 0)
			{
				System.out.printf("%d와(과) %d의 최소공배수는 %d", num1, num2, lcm);
				break;
				
			}
			lcm++;
		}
		
		
		// 최대공약수(GCD)를 사용하여 최소공배수 구하기
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int gcd = 1;
		
		for (int i = 1; i <= num1 && i <= num2; i++)
		{
			if (num1 % i == 0 && num2 % i == 0)
			{
				gcd = i;
				
			}
			
		}
		
		int lcm = (num1 * num2) / gcd;
		System.out.printf("%d와(과) %d의 최소공배수는 %d", num1, num2, lcm);

	}

}


/*
<Output>
15
96
15와(과) 96의 최소공배수는 480
*/
