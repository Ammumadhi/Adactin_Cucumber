package Employee;

public class Consturctor {
	//class name and constructor name will be same 
	public Consturctor() {
		
		System.out.println("non parameterized constructor");
	}
    
	public Consturctor(String name) {
		System.out.println("parameterized constructor:"+name);
	}
	
	public static void main(String[] args) {
		Consturctor c = new Consturctor();
		Consturctor c1 = new Consturctor("abi");
		
	}
//without calling method we will get output in constructor
}
