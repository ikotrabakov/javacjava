class Box {
    int length = 0; // instance variable - every Box object will have its own "instance" (copy) of this variable
    int height = 0; // height could be directly set to a negative value - that's not good!
    int width = 0; // width could be directly set to a negative value - that's not good!

    boolean setLength (int lengthParam) {
        if (lengthParam >= 1) {
            length = lengthParam;
            return true;
        } else {
            return false;
        }
    }

    boolean setHeight (int heightParam) {
        if (heightParam >= 1) {
            height = heightParam;
            return true;
        } else {
            return false;
        }
    }

    boolean setWidth (int widthParam) {
        if (widthParam >= 1) {
            width = widthParam;
            return true;
        } else {
            return false;
        }
    }

    // I will create a getter method to get the height
    // Who knows why ... we might want to know if a box is too tall to fit on a shelf
    int getHeight () {
        return height;
    }

    // create a method to get the volume of the box
    int calculateVolume() {
       return (length * height * width);	
    }
}