package interviewQuestions;

public class stirngSplit {

	public static void main(String[] args) {
		
		String str = "udaya kumar goud";
		String[] parts =str.split(" ");
		
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
     
	}

}