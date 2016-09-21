class ReferenceVariables {
    public static void main(String args[]) {
        // What happens if we declare a primitive and a reference variable with no assignment?
        int a; // primitive data type 
        //System.out.println(a); // error: variable a might not have been initialized
        Box x; // object data type, class type specifically
        //System.out.println(x); // error: variable x might not have been initialized
        // Great, we now know that both types need to be assigned a value before use.
    
        // What if I want to assign a 'harmless' default initial value to the variable?
        a = 0; // for the primitive numeric types, 0 is a great 'harmless' default value
        x = null; // null is basically nothing, a great 'harmless' default value. x 'refers' to nothing.
        System.out.println("a = " + a); // a = 0
        System.out.println("x = " + x); // x = null

        // Now what if we assign our reference variable to an actual object type and display the reference variable to the console?
        x = new Box();
        System.out.println("x = " + x); // x = Box@659e0bfd, where the 659e0bfd will be a different hexadecimal number in your console.
        // very interesting ... so x refers to a Box object at what might be a memory location (more to come in later tutorials).  
        // let's try something real quick
        Box y = null;
        Box z = new Box();
        System.out.println("----------");
        System.out.println("x = " + x); // x = Box@659e0bfd
        System.out.println("y = " + y); // y = null
        System.out.println("z = " + z); // z = Box@2a139a55
        System.out.println();

        System.out.println("----------");
        // I can plainly see that we have two Box objects, Box@659e0bfd and Box@2a139a55 (your numbers will differ).
        // Now I will assign some values to the instance variables for each Box object.
        x.length = 8;
        x.height = 2;
        x.width = 6;
        z.length = 5;
        z.height = 3;
        z.width = 7;
        System.out.println("x volume = " + x.displayVolume()); // 96
        System.out.println("z volume = " + z.displayVolume()); // 105
        System.out.println();

        System.out.println("----------");
        // What will happen if I assign y to the x reference variable?
        y = x;
        System.out.println("x = " + x); // x = Box@659e0bfd
        System.out.println("y = " + y); // y = Box@659e0bfd
        System.out.println("z = " + z); // z = Box@2a139a55
        System.out.println("x volume = " + x.displayVolume()); // 96
        System.out.println("y volume = " + y.displayVolume()); // 96
        System.out.println("z volume = " + z.displayVolume()); // 105
        // So y doesn't necessarily equal x, it 'refers' to the Box object that x 'refers' to
        System.out.println();

        System.out.println("-----Assign x to z -------");
        // What will happen to y if I assign x to z?
        x = z;
        System.out.println("x = " + x); // x = Box@2a139a55
        System.out.println("y = " + y); // y = Box@659e0bfd
        System.out.println("z = " + z); // z = Box@2a139a55
        System.out.println("x volume = " + x.displayVolume()); // 105
        System.out.println("y volume = " + y.displayVolume()); // 96
        System.out.println("z volume = " + z.displayVolume()); // 105
        // y still has a reference to the object that we originally assigned to x
        // x now has a reference to the object that we originally assigned to z
        System.out.println();

        // 

    }
}

class Box {
    int length = 0;
    int height = 0;
    int width = 0;
    
    int displayVolume() {
       return (length * width * height);
    }    
}