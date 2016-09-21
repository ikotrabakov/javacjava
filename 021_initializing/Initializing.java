class Initializing {
    public static void main(String args[]) {
        int a; // declaration statement
        a = 5; // assignment statement
        int b = 10; // initializing a variable
        boolean likesFish, likesVegetables = true, likesCoffee; // only likesVegetables = true is initialized
        String emptyString; // default value is null
        double hourlyWage = 15.75, hoursWorked = 41; // initializing variables
        double weeklyPay = hoursWorked * hourlyWage; // dynamic initialization

        System.out.println(a);
        System.out.println(b);
        //System.out.println(likesFish); // using variable before assigning a value - error. Uncomment to see error
        System.out.println(likesVegetables);
        //System.out.println(likesCoffee); // using variable before assigning a value - error. Uncomment to see error
        //System.out.println(emptyString); // using variable before assigning a value - error. Uncomment to see error
        System.out.println(weeklyPay);
    }
}