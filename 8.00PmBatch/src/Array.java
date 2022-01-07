
public class Array {

	int i=10;
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[4]=60;
		a[4]=70;
		
		System.out.println(a[3]);
		System.out.println(a.length);
	
		int length = a.length;
		System.out.println(length);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
	}
}
