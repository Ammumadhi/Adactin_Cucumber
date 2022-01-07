package Employee;

public class methodRiding2 extends methodRiding { 
	@Override
	public void empId() {
		System.out.println("Papa");
		super.empId();
	}
	public static void main(String[] args) {
		methodRiding2 m = new methodRiding2();
		m.empId();
	}
}
