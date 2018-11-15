
public class HelloWorld {

	/**
	 * test comment 1 This comment with 2 stars at beginning can be evaluated and
	 * deployed in a documentation
	 * 
	 * @param args
	 */
	/*
	 * test comment 2: Strg+Shift+F: Auto format code
	 */
	// test comment 3
	/*
	 * TODO if todo is written it is marked with a blue beam at the right edge ->
	 * and an info symbol at the right edge.
	 */

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("arg1: " + args[0]);
		} else {
			System.out.println("Hello World!");
		}
		
		// neues Objekt der Klasse Calculator anlegen: 
		Calculator calc = new Calculator(); 
		int result = calc.add(5, 7); 
		System.out.println(result); 
		result = calc.add(2); 
		System.out.println(result); 
		result = calc.add(3); 
		System.out.println(result); 

	}

}
