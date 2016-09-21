class Not {
    public static void main(String args[]) {
        boolean trueVar = true;
        boolean falseVar = false;
        System.out.println(!trueVar); 
        System.out.println(!falseVar);
        System.out.println(trueVar); // the ! does not change the value of trueVar, just the evaluation
        System.out.println();
        
        // video game example
        /* I haven't talked about Java methods yet, 
           so don't be concerned that the following code won't make all that much sense. 
           you will understand the logic on what I talk about in the video.
        */
        String gameTypeSelected="HARD";

        boolean healthy = true;
        double currentLife = 1000.0;
        //.... As the game is being played you take a lot of damage.
        currentLife = 308.76; 
        healthy = isHealthy(currentLife, gameTypeSelected); //Don't worry about understanding this statement right now.

        if(!healthy) {
            // call routines to alter the normal flow of the game
            System.out.println("Blur the Screen");
            //blurScreen();
            System.out.println("Simulate the player staggering");
            //simStagger();
            System.out.println("Make the controller seem choppy");
            //choppyController();
        }
        
    }

    public static boolean isHealthy(double lifeLeft, String gameMode ) {     
        boolean returnVal = true;
        if(gameMode == "HARD") {
            if (lifeLeft <= 400.0) {
                returnVal = false;
            }
        } else if (gameMode == "MEDIUM") {
            if (lifeLeft <= 300.0) {
                returnVal = false;
            }
        } else if(gameMode == "EASY") {
            if (lifeLeft <= 200.0) {
                returnVal = false;
            }
        }
        return returnVal;
    }
}