package StringLiterals;

import java.util.Scanner;

//// heap memory and string constant pool
public class prog2 {
//    public static void main(String[] args) {
//        String a = new String("java");
//        String aa="saurabh";
//        String aaa = new String("java");
//        String s = "ssp";
//        System.out.println(s==a); //false
//        System.out.println(s==aa); //false
//        System.out.println(s==aaa); //false
//        System.out.println(s.equals(a)); //false
//        System.out.println(aaa.equals(aa)); //false
//    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        int size = word.length();

        for (int i=0; i<size; i++) {
            for (int j=0; j<=size/2; j++) {
                if(i == size/2 ){
                    System.out.print(word);
                    break;
                } else {
                    if(j == size/2)
                        System.out.print(word.charAt(i));
                    else
                        System.out.print(" "); // one space
                }
            }
            System.out.println(); // new line
        }
    }



}
