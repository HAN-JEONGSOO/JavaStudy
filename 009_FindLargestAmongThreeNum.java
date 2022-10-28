// 예1: if..else문으로 세 개의 수 중에 가장 큰 수 찾기

public class Largest {

	public static void main(String[] args) {
		
		double n1 = -4.5, n2 = 3.9, n3 = 2.5;
		
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + "이(가) 가장 큰 수입니다");
		
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + "이(가) 가장 큰 수입니다");
		
		else
			System.out.println(n3 + "이(가) 가장 큰 수입니다");

	}

}


/*
<Output>
3.9이(가) 가장 큰 수입니다
*/



// 예2: 내포된 if..else문으로 세 개의 수 중에 가장 큰 수 찾기

public class Largest {

	public static void main(String[] args) {

		double n1 = -4.5, n2 = 3.9, n3 = 5.5;
		
		if (n1 >= n2)
		{
			if (n1 >= n3)
				System.out.println(n1 + "이(가) 가장 큰 수입니다");
			else
				System.out.println(n3 + "이(가) 가장 큰 수입니다");
			
		}
		else
		{
			if (n2 >= n3)
				System.out.println(n2 + "이(가) 가장 큰 수입니다");
			else
				System.out.println(n3 + "이(가) 가장 큰 수입니다");
			
		}

	}

}


/*
<Output>
5.5이(가) 가장 큰 수입니다
*/
