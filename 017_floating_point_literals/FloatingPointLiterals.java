class FloatingPointLiterals {
    public static void main(String args[]) {
        double a = 1234.75;
        double b = 5_100.333_333; 
        double c = 1234.75D;
        float e = 1234.76F;
        int x = 10;
        double y = .27;
        int iResult = 0;
        double dResult = 0.0;

        iResult = (int) (x * y); // example of primitive type casting
        dResult = (x * y);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println("iResult = "+iResult);
        System.out.println("dResult = "+dResult);
    }
}