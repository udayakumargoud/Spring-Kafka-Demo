package interviewQuestions;

public class RemoveNumbersFromString {

	public static void main(String[] args) {
		
		String str = "121224323Remove Numbers from the string";
		System.out.println("The new String with only chars:" + str.replaceAll("[0-9]", ""));
		System.out.println("The new String wiht only numbers:" + str.replaceAll("[^0-9]", ""));
		

	}

}
