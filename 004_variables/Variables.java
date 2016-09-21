/*
    Simple program to convert miles to kilometers
    We create a variable called miles and assign it an int data type and initialize it to 0.
    We create another variable called kilometers and assign it a double data type and initialize it to 0.
*/

class Variables {
    public static void main(String args[]) {
        int miles = 0; // (data type int) (variable miles) (assignment operator =) (value 0) (semicolon)
        double kilometers = 0.0d; // (data type double) (variable kilometers) (assignment operator =) (value 0.0) (semicolon)
        double distance; // (data type double) (variable distance) default value is 0.0d;

        miles = 11; // change the value of the miles variable 
        kilometers = 1.609344d; // change the value of the kilometers variable
        distance = miles * kilometers; // multiply variable values using the multiplication operator (*) and store the value to the distance variable

        System.out.println("There are " + distance + " kilometers in " + miles +" miles." );

    }
}