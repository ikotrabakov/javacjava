class VariableScope {
    public static void main(String args[]) {
        int a = 0; // visible to entire method
        { // begin nested code block #1
            a++; // a is visible in code block #1
            int b = 0; // create b in code block #1

            { // begin nested code block #2
                a++; // a is visible in code block #2
                b++; // b is visible in code block #2
                int c = 0; // create c in block #2
                c++; // c is visible in code block #2
                System.out.println("in code block #2, a = " + a);
                System.out.println("in code block #2, b = " + b);
                System.out.println("in code block #2, c = " + c);
                if (args.length >= 1) {
                    System.out.println("method parameters are visible in every inner code block, args[0] = " + args[0]);
                }
            } // end nested code block #2

            a++; 
            b++; // c is out of scope            
            System.out.println("in code block #1, a = " + a);
            System.out.println("in code block #1, b = " + b);
            //System.out.println("in code block #1, c = " + c); // c is out of scope
        } // end nested code block #1

        a++; // b and c are out of scope
        System.out.println("in method body, a = " + a);
        //System.out.println("in method body, b = " + b); // b is out of scope
        //System.out.println("in method body, c = " + c); // c is out of scope
        
        System.out.println();
        if (a > 3) { // another nested code block
            System.out.println("if statement code block, a = " + a);
            int d = 6;
            System.out.println("if statement code block, d = " + d);
        }

        System.out.println();
        for (int i = 0; i < 4; i++) { // another nested code block, i is created in the for statement
            System.out.println("for statement code block, a = "+ a + ", i = " + i);
        }

        // System.out.println("in method body, d = " + d); // d is out of scope
        // System.out.println("in method body, i = " + i); // i is out of scope
    }
}