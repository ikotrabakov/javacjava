class StringIntro {
    public static void main(String args[]) {
        String s1 = "The String class ";
        String s2 = "has many methods.";
        String s3 = s1+s2;
        String s4 = "0123456789";
        String s5 = "  Car    ";
        String s6 = "  pet";
        int stringLength;

        System.out.println(s1+s2);
        System.out.println(s3);
    
        System.out.println(s3.length()); //display the length of s3;
    
        System.out.println(s3.charAt(2)); //display character at index position 2
        System.out.println(s3.charAt(0)); //charAt index begins at 0

        //substring includes the first index character up until, but not including the last index character
        System.out.println(s4.substring(3,8)); 

        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

        System.out.println(s5.trim()+s6.trim());

    }
}