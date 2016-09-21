class ConstructorTwo {
    public static void main(String args[]) {
        Box b = new Box(5, 10, 2);
        System.out.println("The volume of our box is: " + b.calculateVolume());

    }
}

class Box {
    private int length = 0;
    private int height = 0;
    private int width = 0;

    //constructor
    Box(int lengthParam, int heightParam, int widthParam) {
        length = lengthParam;
        height = heightParam;
        width = widthParam;
    }   
    
    int calculateVolume() {
        return (length * height * width);
    } 
}
