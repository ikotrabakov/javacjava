class NewOperator {
    public static void main(String args[]) {
        Acme a = new Acme(); 
        System.out.println(a);
    }
}
class Acme {
    Acme(){ // constructor
        System.out.println("The Acme constructor just executed all statements in its code block!");
    }
}