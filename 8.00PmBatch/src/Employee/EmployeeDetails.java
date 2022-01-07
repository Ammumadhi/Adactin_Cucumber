package Employee;

public class EmployeeDetails {							
public void empNo() {
	System.out.println("Employee Number is 15");	
}
public void empName() {
	System.out.println("Employee Name is Geetha");
}
public static void main(String[] args) {
	//classname object = new classname();
	
	EmployeeDetails ed = new EmployeeDetails();
	ed.empNo();
	ed.empName();
}
}
