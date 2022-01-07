
public class stringMethod {
	
	public static void main(String[] args) {
		
		String s = "God is great";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("God is great");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("god is great");
		System.out.println(equalsIgnoreCase);
		
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		int indexOf = s.indexOf("r");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("g");
		System.out.println(lastIndexOf);
		
		boolean contains = s.contains("is");
		System.out.println(contains);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();		
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("G");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("t");
		System.out.println(endsWith);
		
		String replace = s.replace("s", "n");
		System.out.println(replace);
		
		String replace2 = s.replace("great", "world");
		System.out.println(replace2);
		
		String substring = s.substring(5);
		System.out.println(substring);
		
	}
	

}
