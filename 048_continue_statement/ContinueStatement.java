class ContinueStatement {
    public static void main(String args[]) {
        String stringArray[] = {"Duck", "Duck", "Duck", "Duck", "Goose", "Duck", "Duck", "Duck", "Duck" };
        for(int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("Goose")) {
                continue; // don't display Goose to the console.
            }
            System.out.print(stringArray[i] +" ");
        }
        System.out.println("\nOnly Ducks here, no Geese.");
        System.out.println();

        // build a number ladder of odd numbers
        int maxNumber = 11; 
       
        myLabel:
        for (int x=1; true; x++){
            inner:
            for (int y=1; y<=x; y++) {
                if (x > maxNumber) { // break if we are at our target number
                    break myLabel;
                }
                if (x % 2 == 0) { // skip row if number is even
                    continue myLabel;
                }
                if (y % 2 == 0) { // skip column if number is even
                    continue inner;
                }
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Program is over");
    }
}