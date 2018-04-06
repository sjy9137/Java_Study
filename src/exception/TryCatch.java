package exception;

public class TryCatch {
	public static void main(String[] args) {
		/*try {
			
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz.getName());
		} catch (ClassNotFoundException e){
			
			System.out.println("No Class");
			
		}*/
		
		
		try {
			
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz.getName());
			
			int[] arr = new int [3];
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException error");
		}
		catch(Exception e){
			System.out.println("Array error");
		}
	}
}
