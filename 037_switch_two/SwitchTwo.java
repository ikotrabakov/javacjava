class SwitchTwo {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments");
            return; // return will terminate execution of the main method
        }
   
        switch(args[0]) {
            case "A":
                System.out.print("A");
            case "B":
                System.out.print("B");
            case "C":
                System.out.print("C");
            case "D":
                System.out.print("D");
            case "E":
                System.out.print("E");
            case "F":
                System.out.print("F");
            case "G":
                System.out.print("G");
            case "H":
                System.out.print("H");
            case "I":
                System.out.print("I");
            case "J":
                System.out.print("J");
            case "K":
                System.out.print("K");
            case "L":
                System.out.print("L");
            case "M":
                System.out.print("M");
            case "N":
                System.out.print("N");
            case "O":
                System.out.print("O");
            case "P":
                System.out.print("P");
            case "Q":
                System.out.print("Q");
            case "R":
                System.out.print("R");
            case "S":
                System.out.print("S");
            case "T":
                System.out.print("T");
            case "U":
                System.out.print("U");
            case "V":
                System.out.print("V");
            case "W":
                System.out.print("W");
            case "X":
                System.out.print("X");
            case "Y":
                System.out.print("Y");
            case "Z":
                System.out.print("Z");
                break; // stop execution before default if a valid letter argument was supplied. 

            default: 
                System.out.println("Invalid uppercase letter argument. Java is a case sensitive language.");
        }
    }
}