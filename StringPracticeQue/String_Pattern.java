package StringPracticeQue;

import java.util.Scanner;

public class String_Pattern {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word =sc.nextLine();
        int size = word.length();
        for (int i=0;i<size;i++){
            for (int j=0;j<size/2;j++){
                if(i==size/2){
                    System.out.println(word);
                    break;
                }else{
                    if(j==size/2){
                        System.out.println(word.charAt(i));
                    }else{
                        System.out.println(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
