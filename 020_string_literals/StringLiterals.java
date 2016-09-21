class StringLiterals {
    public static void main(String args[]) {
        String a = "This is how you surround a letter, word, or phrase with \"double quotes\" in a string literal."; // \" double quote escape sequence
        String b = "Dogs and Cats";
        String c = "\u0044\u006F\u0067\u0073\u0020\u0061\u006E\u0064\u0020\u0043\u0061\u0074\u0073"; // Dogs and Cats in Unicode escape sequences
        String s = "The euro character: \u20AC"; // \u20AC Unicode escape sequence with the hexadecimal euro value
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);

    }
}