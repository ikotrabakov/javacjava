class ConstructorsOne {
    public static void main(String args[]) {
        Acme a = new Acme();
    }
}

class Acme {
    Acme() {
        System.out.println("This code statement executed when the Acme object was initialized!");
    }    
}