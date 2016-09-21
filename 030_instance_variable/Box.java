class Box {
    int length = 0; // instance variable - every Box object will have its own "instance" (copy) of this variable
    int height = 0; // instance variable - every Box object will have its own "instance" (copy) of this variable
    int width = 0; // instance variable - every Box object will have its own "instance" (copy) of this variable

    // create a method to display the volume to the console
    void displayVolume() {
        System.out.println(length * height * width);	
    }
}