package ArayPrograms;
// duplicate letter counting program
public class Char_count_InString {

    public static void main(String[] args) {
        String str ="GeeksForGeeks";
        char [] ch = new char [str.length()];
        int [] count = new int [256];
        for(int i=0;i<str.length();i++){
            count [str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
            int c =0;
            for (int j=0;j<str.length();j++){
               if (ch[j]==str.charAt(i)&& ch[j]!=' '){
                   c++;}

            }
            if (c==1){
                System.out.println(str.charAt(i)+ "="+ count[str.charAt(i)]);
            }
        }



    }


}
