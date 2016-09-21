class OwnClass {
    public static void main(String args[]) {	
        
        // declare reference variable (ownClassReference) and allocate a new OwnClass object 
        OwnClass ownClassReference = new OwnClass();
	
        ownClassReference.displayGreeting();
	
        int volumeArray[] = new int[3]; // This will go away
        volumeArray = ownClassReference.getBoxVolumes(); // This will go away

        ownClassReference.displayVolumes(volumeArray); // This will go away

        //ownClassReference.displayVolumes(ownClassReference.getBoxVolumes());
    
        ownClassReference.displayGoodbye();
    }

    void displayGreeting() {
        System.out.println("Welcome, this program will calculate the volume of three boxes.");
    }

    int[] getBoxVolumes() {	
        Box box1 = new Box(); // declare reference variable and allocate new Box object
        Box box2 = new Box(); 
        Box box3 = new Box();
		
        int returnArray[] = new int[3];
        returnArray[0] = box1.calculateVolume(5, 7, 3); // invoke the calculateVolume method
        returnArray[1] = box2.calculateVolume(10, 5, 4); 
        returnArray[2] = box3.calculateVolume(15, 4, 10); 
		
        return returnArray;
    }

    void displayVolumes(int[] arrayOfVolumes) {
        int counter = 1;
        System.out.println();
        for( int tempVar : arrayOfVolumes ) {				
            System.out.println("The volume of box #" + counter + " is: " + tempVar);
            counter++;
        }
        System.out.println();
    }

    void displayGoodbye() {
        System.out.println("Thank you for using the Acme volume calculation program!");
    }
}