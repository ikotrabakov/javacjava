class ShortCircuitAndOr {
    public static void main(String args[]) {
        int a=5, b=6, c=7, d=8, e=9;
        if ((c>b) && (b>a)) {
            System.out.println("c is greater than a and b");
        }
        System.out.println();

        if ((e>d) && (d>c) && (c>b) && (b>a)) { 
            System.out.println("e is greater than a, b, c, and d");
        }
        System.out.println();

        if ((e==d) && (d>c) && (c>b) && (b>a)) { 
            System.out.println("This will never print");
        } else {
            System.out.println("(d>c) && (c>b) && (b>a) were not evaluated");
        }
        System.out.println();

        int currentTempFarenheit = 75;
        int maxComfort = 85;
        int minComfort = 54;
        if ((currentTempFarenheit <= maxComfort) || (currentTempFarenheit >= minComfort++)) { 
            System.out.println("The temperature outside is nice.");
            System.out.println("(currentTempFarenheit >= minComfort++) was not evaluated");  
            System.out.println("minComfort is still equal to "+minComfort);          
        } else {
            System.out.println("The temperature outside is uncomfortable.");
        
        }
    }
}
