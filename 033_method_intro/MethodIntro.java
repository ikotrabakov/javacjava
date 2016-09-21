class MethodIntro {
    public static void main(String args[]) {
        Box small; // declare a reference variable to a Box object 
        small = new Box(); // allocate a new Box object and assign a reference to small
		
        Box medium = new Box(); // single statement - declare reference variable and allocate new Box object
        Box large = new Box();

        int smallVolume;
        smallVolume = small.calculateVolume(5, 5, 5); // invoke the calculateVolume method
        System.out.println("The volume of our small box is: " + smallVolume);

        int mediumVolume;
        mediumVolume = medium.calculateVolume(10, 10, 10); // invoke the calculateVolume method
        System.out.println("The volume of our medium box is: " + mediumVolume);

        int largeVolume;
        largeVolume = large.calculateVolume(20, 20, 20); // invoke the calculateVolume method
        System.out.println("The volume of our large box is: " + largeVolume);
		
    }
}