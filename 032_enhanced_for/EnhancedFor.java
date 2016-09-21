class EnhancedFor {
    public static void main(String args[]) {
        int numberArray[] = new int[11]; // reference variable numberArray assigned to array object of 11 int data type elements
		
        // load the array using a standard FOR statement
        // the array will contain all the even numbers from 0 to 20		
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i * 2 ;
        }

        // now we will read the array using the ENHANCED FOR statement
        System.out.print("numberArray element values: ");
        for (int tempVar : numberArray) {
            System.out.print(tempVar);
            System.out.print(" ");
        }
        System.out.println();		
    }
}