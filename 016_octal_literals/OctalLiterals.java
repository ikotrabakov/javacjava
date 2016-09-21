class OctalLiterals {
    public static void main(String args[]) {
        byte a = 01; 
        byte b = 07; 
        short c = 010; // 8 
        short d = 020; // 16
        int e = 030; // 24
        int f = 040; // 32
        int g = 041; // 33
        int h = 050; // 40
        int i = 060; // 48
        int j = 070; // 56
        int k = 0100; // 64
        char upperA = 0101; // 65
        char upperB = 0102; // 66
        long m = 055555555555555555555L; // 823515360433462125 
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(upperA);
        System.out.println(upperB);
        System.out.println(m);
    }
}