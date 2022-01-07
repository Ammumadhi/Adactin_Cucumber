package Employee;

public class employe1 extends employes {
	public void employeeSalary() {
	   System.out.println("Employee salary is 50000");
	   }
	public static void main(String[] args) {
		employe1 e = new employe1();
		e.empId();
		e.empName();
		e.employeeSalary();
	}

}
