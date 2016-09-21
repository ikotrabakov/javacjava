class AndOr {
    public static void main(String args[]) {
        int a=5, b=6, c=7, d=8, e=9;
        if ((c>b) & (b>a)) {
            System.out.println("c is greater than a and b");
        }

        if ((e>d) & (d>c) & (c>b) & (b>a)) { 
            System.out.println("e is greater than a, b, c, and d");
        }

        if ((e==d) & (d>c) & (c>b) & (b>a)) { 
            System.out.println("This will never print");
        } else {
            System.out.println();
        }

        String favoriteColor = "blue"; 
        if (favoriteColor == "green" | favoriteColor == "blue" | favoriteColor == "red" | ++a == 11) {
            System.out.println("At least one expression evaluated to true");
        }
        System.out.println("a is now equal to "+a);
        System.out.println();

        favoriteColor = "purple"; 
        if (favoriteColor == "green" | favoriteColor == "blue" | favoriteColor == "red" | ++a == 11) {
            System.out.println("This will not print, all expressions evaluated to false.");
        }
        System.out.println("a is now equal to "+a);
    }
}