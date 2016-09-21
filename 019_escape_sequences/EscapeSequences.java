class EscapeSequences {
    public static void main(String args[]) {
        String a = "Using the \"Tab\" escape sequence to align columns."; // example of the double quote \" escape sequence
        String b = "Odd\tEven\n1\t2\n3\t4\n5\t6\n7\t8"; // example of the \t tab and the \n new line
        String c = "Let\'s create more escape sequence examples."; // example of the \' single quote
        String d = "Your cursor should be at C:\\Java\\EscapeSequences>"; // example of the \\ backslash
        String e = "ASCII A using an Octal escape sequence = \101"; // note the lack of a leading 0
        String f = "ASCII A using an Hexadecimal escape sequence = \u0041"; 
        String typo = "I can\'t spelll\b at the moment."; // \' single quote and \b backspace	

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(typo);
    }
}