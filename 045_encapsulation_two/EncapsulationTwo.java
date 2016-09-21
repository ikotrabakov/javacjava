class EncapsulationTwo {
    public static void main(String args[]) {
    
        Box b = new Box(); // single statement - declare reference variable and allocate new Box object
        
        //b.length = 10; // we can no longer set the value of the instance variable directly!

        if (b.setLength(10) && b.setHeight(2) && b.setWidth(5)) {
            System.out.println("The length of our box is: " + b.getLength());
            System.out.println("The height of our box is: " + b.getHeight());
            System.out.println("The width of our box is: " + b.getWidth());
            System.out.println("The volume of our box is: " + b.calculateVolume());
        } else {
            System.out.println("Unexpected value in one of the dimension arguments.");
        }

    }
}