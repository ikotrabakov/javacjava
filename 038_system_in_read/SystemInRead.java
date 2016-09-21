class SystemInRead {
    public static void main(String args[]) throws java.io.IOException {
        System.out.print("Please enter a single character:");
        char c = (char) System.in.read();
        System.out.println("You pressed: " + c);
    }
}