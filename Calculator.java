
public class Calculator {
	
	private int result = 0; 

	public int add(int a, int b) {
		return a + b; 
	}
	
	public int add(int a) {
		return (result += a); 
	}
}
