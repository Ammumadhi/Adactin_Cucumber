package Employee;

public class Interface1 implements Interface {
@Override
public void HomeLoan() {
	System.out.println("5%");
}
@Override
	public void CarLoan() {
		System.out.println("8%");
	}
public static void main(String[] args) {
	Interface1 i = new Interface1();
	i.CarLoan();
	i.HomeLoan();
}
}


