package programizExample;

public class GCDRecursion {

	public static void main(String[] args) {
		
		// 재귀를 사용한 최대공약수 구하기
		
		int n1 = 365;
		int n2 = 60;
		int hcf = hcf(n1, n2);
		
		System.out.printf("%d와 %d의 최대공약수는 %d", n1, n2, hcf);

	}
	
	public static int hcf(int n1, int n2)
	{
		if (n2 != 0)
			return hcf(n2, n1 % n2);
		else
			return n1;
		
	}

}


/*
<Output>
365와 60의 최대공약수는 5
*/
