package programizExample;


public class PrimeNumBetTwoInt {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 80;
		
		while (num1 < num2)
		{
			boolean flag = false;
			
			for (int i = 2; i <= num1/2; i++)
			{
				if (num1 % i == 0)
				{
					flag = true;
					break;
					
				}
				
			}
			
			if (!flag && num1 != 0 && num1 != 1)
				System.out.print(num1 + " ");
			
			num1++;
			
		}

	}

}



/*
<Output>
23 29 31 37 41 43 47 53 59 61 67 71 73 79 
*/
