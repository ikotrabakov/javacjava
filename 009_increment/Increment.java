class Increment {
    public static void main(String args[]) {

        System.out.println("Prefix and Postfix differences");   
        int x = 1;
        System.out.print("x= "); 
        System.out.println(++x); // Prefix - will this print out 2?
        int y = 1;
        System.out.print("y= "); 
        System.out.println(y++); // Postfix - will this print out 2?
        System.out.println("Why did x and y print different values?");
        System.out.println("The prefix ++x version changed the value of x before ");
        System.out.println("the complete execution of the entire statement.");
        System.out.println("The postfix y++ version changed the value of y after");
        System.out.println("the complete execution of the end of the statement.");
        System.out.println("To prove this, we will simply print the current value of y: "+y);

    }
}