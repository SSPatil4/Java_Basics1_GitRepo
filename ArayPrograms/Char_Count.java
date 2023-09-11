package ArayPrograms;

public class Char_Count {
    public static void main(String[] ags) {
        String str = " Java Programming ";
        char[] ch = new char[str.length()];
        int[] count = new int[500];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int c = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((ch[i] == str.charAt(j)) && ((ch[i] != ' '))) {
                    c++;
                }
                }
            if (c == 1) {
                System.out.println(str.charAt(i) + "=" + count[str.charAt(i)]);

            }
        }


    }
}

class sho{
    public static void main(String[] ags) {
        String str = " Java Programming ";
//        int c = 0;
        int[] count = new int[256];
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int c = 0;
            ch[i] = str.charAt(i);

            for (int j = 0; j < i; j++) {
                if ((ch[j] == str.charAt(i)) && ((ch[i] != ' '))) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.println(str.charAt(i) + "=" + count[str.charAt(i)]);

            }
        }


    }
}