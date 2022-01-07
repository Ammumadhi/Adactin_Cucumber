package Employee;

public class PrePostIncrement {

	public static void main(String[] args) {
		
		int i=10;
		
		System.out.println(i);
		System.out.println(i++);    //PRE
		System.out.println(i++);
		
		System.out.println(i);
		System.out.println(++i);    //POST
		System.out.println(++i);
	}
}
 