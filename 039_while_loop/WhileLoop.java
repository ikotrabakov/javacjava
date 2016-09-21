class WhileLoop {
    public static void main(String args[]) throws java.io.IOException {
        int x = 0;
        System.out.print("Use while like a for statement: ");
        while(x < 10) {
            System.out.print(x);
            x++;
        }
        System.out.println();

        x = 0;
        System.out.print("Use break to terminate a while loop: ");
        while(true) { // infinite loop
            if(x == 5) {
                break; // terminate the while loop
            }
            System.out.print(x);
            x++;
        }
        System.out.println("\n"); // two line feeds in one
	
        System.out.print("Would you like to terminate this program? (Y/N): ");
        while(true) { // infinite loop
            char inputChar = (char) System.in.read();
            if (inputChar == 'Y' || inputChar == 'y') {
                System.out.println("Whew... glad that\'s over with!");
                break; // terminate the while loop
            } else if (inputChar == 'N' || inputChar == 'n') {
                System.out.print("Really? Okay, how about now? (Y/N):");
            } else {
                System.out.print("What??? Would you like to terminate this program? (Y/N): ");
            }
		
            // when you type a letter into the console the read() method buffers all keystrokes
            // If you type in N then press Enter read() buffers 'N' and '\n' (newline escape sequence)
            // this nested loop will empty any remaining characters in the read() buffer
            while(true) {
                char ignore = (char) System.in.read();
                if (ignore == '\n') {
                    break;
                }
            }				
        }
    }
}