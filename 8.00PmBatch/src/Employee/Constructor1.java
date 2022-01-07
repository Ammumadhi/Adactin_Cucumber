package Employee;

public class Constructor1 extends Consturctor{
	public void empId() {

		System.out.println("EmployeeId is 123");

	}
	
	public static void main(String[] args) {
		Constructor1 cu = new Constructor1();
		cu.empId();
		//when we create object the non parameterized constructor will automatically executed
	}

}
