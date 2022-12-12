package programizExample;

public class SortDicOrder {

	public static void main(String[] args) {
		
		// 사전 순서대로 단어 소트하기
		
		String[] words = { "Ruby", "C", "Python", "Java" };

	    for(int i = 0; i < 3; ++i)
	    {
	    	for (int j = i + 1; j < 4; ++j)
	    	{
	          
	    		if (words[i].compareTo(words[j]) > 0)
	    		{
	    			// words[i]를 words[j]로 뒤바꿈
	    			String temp = words[i];
	    			words[i] = words[j];
	    			words[j] = temp;
	    			
	    		}
	    		
	    	}
	    	
	    }

	    System.out.println("사전순으로 나열하면 : ");
	    
	    for(int i = 0; i < 4; i++)
	    {
	      System.out.println(words[i]);
	      
	    }

	}

}

/*
사전순으로 나열하면 : 
C
Java
Python
Ruby
*/
