class IfStatement {
    public static void main(String args[]) {
        int currentSpeed; //declaration statement
        int speedLimit; //declaration statement
        int speedDifference; //declaration statement
        
        currentSpeed = 72; //assignment statement
        speedLimit = 65; //assignment statement
        
        System.out.println("The speed limit is "+speedLimit+", you are traveling "+currentSpeed);

        if (currentSpeed == 65) {
            System.out.println("You are traveling at exactly the speed limit.");
            System.out.println("Good driving.");
        } 

        if (currentSpeed > 65) {
            System.out.println("You are traveling over the speed limit.");
            speedDifference = currentSpeed - speedLimit;

            // let's display different messages based on the severity of the speeding.
            if(speedDifference >= 5) { 
                System.out.println("Better slow down, you are at risk for getting a speeding citation.");
            } 
            else { 
                System.out.println("Minor speeding - just like most other drivers on the road.");
            }
        } 

        if (currentSpeed < 65) {
            System.out.println("You are traveling under the speed limit.");
        } 

        System.out.println();
        System.out.println("-------------");
        System.out.println("if-else if-else");

        // we can perform essentially the same thing by using if-"else if"-else syntax.
        
        if (currentSpeed == 65) {
            System.out.println("You are traveling at exactly the speed limit.");
            System.out.println("Good driving.");
        } 
        else if (currentSpeed > 65) {
            System.out.println("You are traveling over the speed limit.");
        } 
        else {
            System.out.println("You are traveling under the speed limit.");
        }

        System.out.println();
        System.out.println("-------------");
        System.out.println("optional code block syntax - curly opening and closing braces");

        // code blocks indicated by a pair of curly braces are optional 
        // only if you are only going to execute a single statement after the if statement.
        
        if (currentSpeed == 65)
            System.out.println("You are traveling at exactly the speed limit.");

        if (currentSpeed > 65) 
            System.out.println("You are traveling over the speed limit.");

        if (currentSpeed < 65) System.out.println("You are traveling under the speed limit.");

        if (currentSpeed > 65) 
            System.out.println("You are speeding.");
        else
            System.out.println("You are not speeding.");
    }
}