package ArayPrograms;

public class CharCountInString {
    public static void main(String[] args) {
        int count = 0;
        String str = "programming";
      //  str = str.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    count++;

                }
            }
            if (count != 0) {
                System.out.println(i + "=" + count);
                count = 0;
            }
        }
    }
}

