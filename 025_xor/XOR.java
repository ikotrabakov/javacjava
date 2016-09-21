class XOR {
    public static void main(String args[]) {
        System.out.println( (5==5) ^ (5==6)); // displays true
        System.out.println( (5==5) ^ (6==6)); // displays false
        System.out.println( (4==5) ^ (5==6)); // displays false
        System.out.println( (5==5) ^ (5==6) ^ (6==7) ^ (7==8)); // displays true
        System.out.println( (5==6) ^ (6==7) ^ (7==7) ^ (7==8)); // displays true
        System.out.println( (5==5) ^ (6==6) ^ (7==8) ^ (8==9)); // displays false   
        System.out.println();

        boolean duck = false;
        boolean goose = true;
    
        if (duck ^ duck ^ duck) {
            System.out.println("Did three ducks run?");
        }
        if (duck ^ duck ^ goose) {
            System.out.println("duck duck goose ran");
        }
        if (duck ^ goose ^ goose) {
            System.out.println("can\'t have two geese in this game");
        }

    }
}