public class string {
    public static void main(String[] args) {
        String nam = "Pitam Ghosh"; // non primitiives declaring a string variable
        String name1 = "Raj Ghosh"; // non primitives declaring a string variable
        String name2 = "Pitam Ghosh"; // non primitives declaring a string variable
        String name3 = name1 + "and" + name2; // concatenating two strings
        //System.out.println(name3);
        
        
        //System.out.println(nam.charAt(4));// character position
        
        
        // replace
        // String name4 = nam.replace('a', 'b'); // replacing a character in a string
        // System.out.println(name4);//new string
        // System.out.println(nam);//old string

        //substring
        String name5="Raj and Pitam";
        System.out.println(name5.substring(0,3));

        //System.out.println(nam.length());

    }
}
