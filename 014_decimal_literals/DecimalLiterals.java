class DecimalLiterals {
    public static void main(String args[]) {
        // byte range: -128 to 127
        byte b1 = -128;
        byte b2 = 127;

        // short range: -32,768 to 327,67
        short s1 = -32_768; //note the optional use of the underscore for better readability.
        short s2 = 32_767;

        //char range 0 to 65535 
        char c1 = 0;
        char c2 = 65_535;

        // int range: -2,147,483,648 to 2,147,483,647.
        int i1 = -2_147_483_648;
        int i2 = 2_147_483_647;

        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // long is special!!!
        // You must include the postfix letter L or l at the end of the literal,
        // if the literal is larger than 2_147_483_647
        long x1 = -9_223_372_036_854_775_808L; 
        long x2 = 9_223_372_036_854_775_807l; 
        long x3 = 2_147_483_647;

        // underscore usage rules for decimal literals
        //int z1 = _100; // cannot be the first digit of the decimal literal
        //int z2 = 100_; // cannot be the last digit of the decimal literal
        int z3 = 1_0_00_00_0; // no limit to how many or where they are placed
        int z4 = 1___0; // multiple underscore characters can be placed together.

        System.out.println("byte");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();
        System.out.println("short");    
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println("char");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
        System.out.println("int");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println();
        System.out.println("long");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(z3);
        System.out.println(z4);
    }
}