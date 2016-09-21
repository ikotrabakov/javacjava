class EncapsulationOne {
    public static void main(String args[]) {    
        Box b = new Box(); // single statement - declare reference variable and allocate new Box object

        //b.length = 10; // directly set the instance variable
        //b.height = -2; // directly set the instance variable to value we didn't expect
        //b.width = 5; // directly set the instance variable

        if (b.setLength(10) && b.setHeight(2) && b.setWidth(5)) {
            System.out.println("The volume of our box is: " + b.calculateVolume());
            System.out.println("The height of our box is: " + b.getHeight());
        } else {
            System.out.println("Unexpected value in one of the dimension arguments.");
        }
    }
}