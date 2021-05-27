package variables;

public class Variables {

	public static void main(String[] args) {
		
		//down casting
		
		int a= (int)100.12;
		System.out.println("printing values of a :"+ a);
		
		/*type casting 
		====== By default Java treats decimal values as Double so if you want to use
		float primitive type we need to type cast using below given methods=========		
		*/
		
		float b = (float) 33.45;
		
		System.out.println("printing values of b :"+ b);
		
		// other way of type casting
		
		float c = 48.56f;
		System.out.println("printing values of c :"+ c);
		
		// we can assign numbers to char data type, but it will return corresponding ASCI value
		
		char d = 65;
		
		System.out.println("printing values of d :"+ d);
		

	}

}
