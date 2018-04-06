package exception;

public class ThrowsExample {
	public static void main(String[] args) {
/*		try {
			findClass();
		}catch (ClassNotFoundException e) {
			
		}*/
	
		
		
		try {
			findClass();
			findClass2();
			
		
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound -main");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException -main");
		}
	}
	
	public static void findClass () throws ClassNotFoundException,  NumberFormatException{
		Class clazz = Class.forName("java.lang.String2");
	
	}
	
	public static void findClass2 () throws ClassNotFoundException{
		
		Class clazz = Class.forName("java.lang.String2");
		
	
	}
/*	public static void findClass() { //throws ClassNotFoundException{
		try {
			Class clazz = Class.forName("java.lang.String2");
		
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound");
		}
		
		public static void findClass2() { //throws ClassNotFoundException{
			try {
				Class clazz = Class.forName("java.lang.String2");
			
			}catch (ClassNotFoundException e) {
				System.out.println("ClassNotFound");
			}
	}
*/		

	
}
