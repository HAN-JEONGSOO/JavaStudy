// GCD : 최대공약수(Greatest Common Divisor)

public class GCD {

	public static void main(String[] args) {
		
		
		// 예 1: for 루프와 if 문으로 두 수간의 최대공약수 찾기
		
		// n1과 n2간의 최대공약수 찾기
		int n1 = 81, n2 = 153;
		
		// 초기 최대공약수 설정
		int gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; ++i)
		{
			// i가 n1과 n2에 완벽하게 나뉘어지는지 체크
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
			
		}
		
		System.out.println(n1 + "와(과) " + n2 + "의 최대공약수는 " + gcd);

/*
<Output>
81와(과) 153의 최대공약수는 9
*/
		
		
		
		// 예 2: while 루프와 if..else 문으로 두 수간의 최대공약수 찾기
		
		// n1과 n2간의 최대공약수 찾기
		int n1 = 81, n2 = 153;
		
		while (n1 != n2)
		{
			if (n1 > n2)
				n1 -= n2;
			
			else
				n2 -= n1;
			
		}
		
		System.out.println("최대공약수는 " + n1);

/*
<Output>
최대공약수는 9
*/
		
		
		
		// 예 3: 양수와 음수 모두의 최대공약수 구하기
		
		int n1 = 81, n2 = -153;
		
		// 항상 양수로 되도록 설정하기
		n1 = (n1 > 0) ? n1 : -n1;
		n2 = (n2 > 0) ? n2 : -n2;
		
		while (n1 != n2)
		{
			if (n1 > n2)
				n1 -= n2;
			
			else
				n2 -= n1;
			
		}
		
		System.out.println("최대공약수는 " + n1);

/*
<Output>
최대공약수는 9
*/

	}

}
