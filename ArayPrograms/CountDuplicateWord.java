package ArayPrograms;

//count number of similar words in java
public class CountDuplicateWord {

    public static void main(String[] args) {

        String str = "aajavacvsjavaa";

        String text = "java";
        int counts = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(text)) {
                counts++;
            }
        }
        System.out.println(str + " contains " + text + " " + counts + " times");
    }

}


class testttt {


    public static void main(String[] args) {

        String str = "javaghjavatyjavartjava";
        String word = "java";
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf(word, index);
            if (index != -1) {
                count++;
                index += word.length();
            }
        }
        System.out.println("the word " + word + " count is " + count);

    }


}

class Teaty {
    public static void main(String[] args) {
        String str="ramaxxramaxxramaxx";
        String word ="rama";
        int count =0;
        int index=0;
        while (index!=-1){
            index = str.indexOf(word,index);
            if (index!=-1){
               count++;
               index+=word.length();
            }
        }
        System.out.println(word+" word is repeated "+count+" times");

    }
}



