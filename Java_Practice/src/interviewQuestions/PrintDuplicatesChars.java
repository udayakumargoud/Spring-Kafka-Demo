package interviewQuestions;

public class PrintDuplicatesChars {

	public static void main(String[] args) {
		
		String s = "UdayakumarGoud";
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length-1; i++)
		{
			for(int j=i+1;j<ch.length-1; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}

	}

}
