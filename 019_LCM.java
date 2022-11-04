// LCM : 최소공배수 (Least Common Multiple/ Lowest Common Multiple)

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
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

	}

}

/*
<Output>
2512
5737
2512와(과) 5737의 최소공배수는 14411344
*/
