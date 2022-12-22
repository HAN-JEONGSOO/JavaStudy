package programizExample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckArrContainsValue {

	public static void main(String[] args) {
		
		// 배열에 지정된 값이 포함돼있는지 확인하는 자바 프로그램
		
		// 예 1: Int 배열에 지정된 값이 포함돼있는지 확인
		int[] num = {1, 2, 3, 4, 5};
		int toFind1 = 3;
		boolean found1 = false;
		
		for (int n : num)
		{
			if (n == toFind1)
			{
				found1 = true;
				break;
				
			}
			
		}
		
		if (found1)
			System.out.println(toFind1 + " : 포함돼있습니다");
		else
			System.out.println(toFind1 + " : 포함돼있지 않습니다");
		
		/*
		<Output>
		3 : 포함돼있습니다
		*/
		
		// -------------------------------------------------
		
		// 예 2: Stream을 사용하여 배열에 지정된 값이 포함돼있는지 확인
		int toFind2 = 7;
		boolean found2 = IntStream.of(num).anyMatch(n -> n == toFind2);
		
		if (found2)
			System.out.println(toFind2 + " : 포함돼있습니다");
		else
			System.out.println(toFind2 + " : 포함돼있지 않습니다");
		
		/*
		<Output>
		7 : 포함돼있지 않습니다
		*/
		
		// -------------------------------------------------------------
		
		// 예 3: 배열에 원시 유형이 아닌 유형에 대해 지정된 값이 포함되어 있는지 확인
		String[] strings = {"One","Two","Three","Four","Five"};
	    String toFind= "Four";

	    boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

	    if(found)
	      System.out.println(toFind + " : 포함돼있습니다");
	    else
	      System.out.println(toFind + " : 포함돼있지 않습니다");
	    
	    /*
	    <Output>
	    Four : 포함돼있습니다
	    */

	}

}
