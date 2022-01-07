package Employee;

public class Abstract1 extends Abstract{
	@Override
	public void PersonalLoan() {
		System.out.println("30%");
		
	}
	public static void main(String[] args) {
		Abstract1 a = new Abstract1();
		a.CarLoan();
		a.HomeLoan();
		a.PersonalLoan();
	}
	}


