/*
    Demonstrate proper and improper names for identifiers
*/
class Identifiers {
    public static void main(String args[]) {
        int fourGSpeed; 
       // int 4GSpeed; // Not legal! Begins with a number
        int g4Speed; 
       // int #highScore; //Not legal! Begins with a prohibited character
        int _highScore; 
        int $highScore;
       // int high@Score; // Not legal! Contains a prohibited character
      //  int goto; // Not legal! goto is a Java keyword
        int $__$;
        int _7$_;
        
        System.out.println("The first character of the identifier must begin with one of the following:");
        System.out.println("the letters a-z, an underscore _, or a currency character $.");
        System.out.println(); // empty println - what will that do?
        System.out.println("After the first character, the identifier can contain the following: ");
        System.out.println("the numbers 0-9, the letters a-z, an underscore _, or a currency character $.");
    }
}