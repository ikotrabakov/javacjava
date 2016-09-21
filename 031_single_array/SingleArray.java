class SingleArray {
    public static void main(String args[]) {
        int numberArray[]; // declare a reference variable
        numberArray = new int[5]; // allocate an int type array of 5 elements and assign to numberArray
        numberArray[0] = 67;
        numberArray[1] = 1398;
        numberArray[2] = 5;
        numberArray[3] = 10_300;
        numberArray[4] = 731;

        System.out.println("The number of elements in numberArray: "+ numberArray.length);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of element #" + (i+1) + ", index " + i + " is: "+ numberArray[i]);
        }
        System.out.println();
		
        String stringArray[] = { "Arrays ", "are ", "made ", "up ", "of ", "elements." };
        
        for (int x = 0; x < stringArray.length; x++) {
            System.out.print(stringArray[x]);
        }
        System.out.println();		
    }
}