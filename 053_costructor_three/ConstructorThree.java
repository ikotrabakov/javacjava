class ConstructorThree {
    public static void main(String args[]) {
        System.out.println("The volume of our box is: " + new Box(5, 10, 2).calculateVolume());
        System.out.println("The volume of our box is: " + (new Box(5, 5, 5)).calculateVolume());
        System.out.println("The volume of our box is: " + (new Box(4, 8, 3)).calculateVolume());
	
        // Think really hard about this
        int boxVolumeA = new Box(5, 10, 2).calculateVolume();
        System.out.println(boxVolumeA);
	
        // The parenthesis should help
        int boxVolumeB = (new Box(5, 5, 5)).calculateVolume();
        System.out.println(boxVolumeB);
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