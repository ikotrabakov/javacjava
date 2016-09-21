class DoWhile {
    public static void main(String args[]) {
        boolean b = false;
        do {
            System.out.println("Statements are executed at least once - even if expression results in false.");
        } while (b);

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}