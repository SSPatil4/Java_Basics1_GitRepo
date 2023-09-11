package ForLoop_StringMethods;
// methods of string class

public class prog2 {
    public static void main(String[] args) {
        String word1 = "Geeksforgeeks";
        String word2 = "ramayana";
        String word3 = " Java Is Oops Lang "; //spacing at the start and end of string
        String word4 = "Learn Share Learn";
       /* System.out.println("print word one " + word1.length());

        System.out.println("print word two " + word2.charAt(5));

        System.out.println("print word one =" + word1.charAt(11));

        System.out.println("print word three =" + word3.toLowerCase());

        System.out.println("print word one =" + word1.toUpperCase());

        System.out.println("print word one =" + word1.charAt(5));

        System.out.println("print word three =" + word3.trim());

        System.out.println("print word three =" + word3.indexOf('O'));
*/
        System.out.println("print word one 27 =" + word1.substring(3));

        System.out.println("word one substring 29=" + word1.substring(2,12));

       /* System.out.println("add two strings word1,word2 =" + word1.concat(word2));

        //  System.out.println("index of string word4 ="+word4.indexOf("Share"));

        System.out.println("index of string word3 =" + word3.indexOf("Oops"));

        System.out.println("index = " + word4.indexOf("Learn", 5));

        System.out.println("boolean =" + "Lang".equals("Lang"));

        System.out.println("equals ignore case="+"lang".equalsIgnoreCase("Lang"));

        System.out.println("compare strings ="+word3.compareTo(word4));

        System.out.println("replace letters 45="+"searn for searn".replace('s','l') );
*/

    }
}

