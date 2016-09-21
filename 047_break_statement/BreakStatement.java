class BreakStatement {
    public static void main(String args[]) {
        String stringArray[] = {"Duck", "Duck", "Duck", "Duck", "Goose", "Duck", "Duck", "Duck", "Duck" };

        for(int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] +" ");
            if (stringArray[i].equals("Goose")) {
                System.out.println();
                break;
            }
        }
        System.out.println("Game over");
        System.out.println();
      
        // build a number ladder
        int maxNumber = 5; 
       
        myLabel:
        for (int x=1; true; x++){
            for (int y=1; y<=x; y++) {
                if (x > maxNumber) {
                    break myLabel;
                }
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("Program is over");
    }
}