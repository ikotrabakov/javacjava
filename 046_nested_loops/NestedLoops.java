class NestedLoops {
    public static void main(String args[]) {

        System.out.println("Nested for loop: ");
        for (int i = 0; i < 5; i++) {
            char upperA = 'A';
            for (int a = 0; a < 26; a++) {
                System.out.print(upperA);
                upperA++; 
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Nested while loop: ");
        int x = 0;
        while (x < 5) {
            char upperA = 'A';
            int y = 0;	
            while (y < 26) {
                System.out.print(upperA);
                upperA++; 
                y++;
            }
            System.out.println();
            x++;
        }
        System.out.println();

        System.out.println("Nested do-while loop: ");
        int c = 0;
        do {
            char upperA = 'A';
            int d = 0;
            do {
                System.out.print(upperA);
                upperA++; 
                d++;
            } while(d < 26);
            System.out.println();
            c++;
        } while(c < 5);
        System.out.println();	
    	
    }
}