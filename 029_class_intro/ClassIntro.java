class ClassIntro {

    public static void main(String args[]) {

    	Box myBox; // declaring a variable of type Box
    	myBox = new Box(); // allocated a Box object

    	// myBox is now an object and we can access the Box method displayMessage		
        // We use the dot (.) operator to invoke the displayMessage method.
	    // object.member

        myBox.displayMessage();
    }
}