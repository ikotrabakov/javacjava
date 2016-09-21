class BinaryLiterals {
    public static void main(String args[]) {
        byte a = 0B00000001; // the leading zeros are optional
        byte b = 0b11; //the 0b prefix can be either uppercase B or lowercase b
        short c = 0B0100001;
        short d = 0b1111111;
        int e = 0b01_000011111010101_0101; // the optional underscore can be used with binary literals as well.
        int f = 0b00000000;
        char upperA = 0B1000001;
        char upperB = 0b1000010;
        long g = 0b1111111_11111111_11111111_11111111;
        long h = 0b11111111_11111111_11111111_11111111_11111111_10101010L;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(upperA);
        System.out.println(upperB);
        System.out.println(g);
        System.out.println(h);
    }
}