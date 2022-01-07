package Employee;

public class Interface3 implements Interface,Interface2 {

	@Override
	public void PersonalLoan() {
		System.out.println("5%");
	}

	@Override
	public void HomeLoan() {
		System.out.println("8%");
	}

	@Override
	public void CarLoan() {
		System.out.println("10%");
	}
 public static void main(String[] args) {
	 Interface3 i = new Interface3();
	 i.CarLoan();
	 i.HomeLoan();
	 i.PersonalLoan();
	
}
	
}
