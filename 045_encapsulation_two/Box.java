class Box {
    private int length = 0; // private access modifier must come before the data type
    private int height = 0; // only the methods in this Box class can access the scope of these variables 
    private int width = 0; // private instance variables cannot be accessed directly outside of this class

    boolean setLength (int lengthParam) {
        if (lengthParam >= 1) {
            length = lengthParam;
            return true;
        } else {
            return false;
        }
    }
    int getLength () {
        return length;
    }

    boolean setHeight (int heightParam) {
        if (heightParam >= 1) {
            height = heightParam;
            return true;
        } else {
            return false;
        }
    }
    int getHeight () {
        return height;
    }

    boolean setWidth (int widthParam) {
        if (widthParam >= 1) {
            width = widthParam;
            return true;
        } else {
            return false;
        }
    }
    int getWidth () {
        return width;
    }

    // create a method to get the volume of the box
    int calculateVolume() {
       return (length * height * width);	
    }
}