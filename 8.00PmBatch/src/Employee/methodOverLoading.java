package Employee;

public class methodOverLoading {
    public void employee(int Id) {
	   System.out.println("Em[ployee Id :"+Id);	
    }
    public void employee(String  Name) {
		System.out.println("Employee Name :"+Name);
	}
    public void employee(char initial,String Name,int Id,float s) {
    	System.out.println("Employee details:"+initial +"." +Name+":"+Id+s) ;
    	
    }
    public static void main(String[] args) {
		methodOverLoading m = new methodOverLoading();
		m.employee(6597);
	    m.employee("Prasanna");
	    m.employee('O',"Prasanna",6597,12.5f);
	}
    
}
