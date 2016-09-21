class TernaryOperator {
    public static void main(String args[]) {
        String tooHotOut = "";
        int temperature = 101;
        tooHotOut = (temperature > 87) ? "I am staying inside today." : "I am going for a walk." ;
        System.out.println(tooHotOut); 

        // Acme Bank charges a 10% monthly service fee on balances below $100, let's calculate the fee (if any).
        double balance = 52.50D, fee = 0.0D;
        fee = (balance >= 100.00D) ? 0.0 : (balance * .1D) ; // parenthesis are optional, but highly recommended
        System.out.println("Your monthly service fee is: $" + fee);        
    }
}