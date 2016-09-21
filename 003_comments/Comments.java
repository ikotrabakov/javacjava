/*
	Multiline comments are nested inside a forward slash and asterisk,
	the comment is closed out with another asterisk and a forward slash
*/

// A single line comment trails a pair of forward slashes
class Comments {
	// The main method 
	public static void main (String args[]) {
		/*
			System.out.println("This will not display");
			System.out.println("Neither will this");
		*/
			//System.out.pr/* comment */intln("Will this work?"); //No it won't 
			System.out.println("No not nest commetns inside of an expression statement");
	}
}