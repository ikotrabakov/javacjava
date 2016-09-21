class TypeConversion {
    public static void main(String args[]) {
        byte b = 127, b1 = 0;
        short s = 32_767, s1 = 0;
        char c = 65_535, c1 = 0;
        int i = 2_147_483_647, i1 = 0;
        long L = 9_223_372_036_854_775_807L, L1 = 0;
        float f = 2_147_483_646.99F, f1 = 0.0F;
        double d = 9_223_372_036_854_775_806.99D, d1 = 0.0D;
        
        // long section
        System.out.println("----long section----");
        L1 = i;
        System.out.println("Assignment from int: "+L1);
        L1 = c;
        System.out.println("Assignment from char: "+L1);
        L1 = s;
        System.out.println("Assignment from short: "+L1);
        L1 = b;
        System.out.println("Assignment from byte: "+L1);
        System.out.println("");

        // int section
        System.out.println("----int section----");
        i1 = c;
        System.out.println("Assignment from char: "+i1);
        i1 = s;
        System.out.println("Assignment from short: "+i1);
        i1 = b;
        System.out.println("Assignment from byte: "+i1);
        System.out.println("");

        // short section
        System.out.println("----short section----");
        s1 = b;
        System.out.println("Assignment from byte: "+s1);
        System.out.println("");

        // double section
        System.out.println("----double section----");
        d1 = L;
        System.out.println("Assignment from long: "+d1); 
        d1 = L;
        System.out.println("Assignment from long: "+(long)d1);
        d1 = f;
        System.out.println("Assignment from float: "+d1);
        d1 = i;
        System.out.println("Assignment from int: "+d1);
        d1 = c;
        System.out.println("Assignment from char: "+d1);
        d1 = s;
        System.out.println("Assignment from short: "+d1);
        d1 = b;
        System.out.println("Assignment from byte: "+d1);
        System.out.println("");

        // float section
        System.out.println("----float section----");
        f1 = i;
        System.out.println("Assignment from int: "+f1); // defaults to scientific notation
        f1 = i;
        System.out.println("Assignment from int: "+(int)f1);
        f1 = c;
        System.out.println("Assignment from char: "+f1);
        f1 = s;
        System.out.println("Assignment from short: "+f1);
        f1 = b;
        System.out.println("Assignment from byte: "+f1);
        System.out.println("");
    }
}