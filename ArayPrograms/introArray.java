package ArayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class introArray {
    //An array is a collection of similar types of data.
    //An array is a collection of similar types of elements stored in a contiguous memory location.
    //array should be declared in a method
   /* int [] arr ={1,2,3,4,5,6,7,8,9};  //initialize  array in single line
    Double avg;
    double[] array = new double[10];   //declare and allocate array in a single line
    array[0]=1;      //initialize array
    array[10]=12;   //initialize array
    double[] ar;     //declare array
    ar= new double[10];  //allocate memory*/
     /*int [] array1;    //array declaration type
        array1 = new int [100];
        System.out.println(array1);*/

    public static void main(String[] args) {
        /*int [] array = new int [10];
        int num=145;
        array[5]=num;
        System.out.println(array[5]);*/





      /* // ArrayStoreException
        Object[ ] arr = new String[3];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = 20;
        System.out.print(Arrays.toString(arr));*/





        double[] dArray = new double[10];

        dArray[0] = 10;
        dArray[1] = 20;
        dArray[2] = 30;
        dArray[3] = 40;
        dArray[4] = 50;
        dArray[5] = 60;
        dArray[6] = 90;
        dArray[7] = 80;
        dArray[8] = 70;
        dArray[9] = 100;

     //   dArray [10]=110;
       /* for (int i = 0; i < dArray.length; i++) {
            System.out.println(dArray[i]);
        }*/

      //  System.out.println("using to string method ="+Arrays.toString(dArray));
       Arrays.sort(dArray);
        System.out.println(dArray);


        /*// Reverse Array
        for (int i = dArray.length-1; i>=0 ;i--) {

            System.out.println(dArray[i]);
        }*/

       // System.out.println(dArray[6]);
       // System.out.println(dArray.length);

       /* String[] s1 = {"Ivaan", "John", "Helly", "Ricky"};
        System.out.println(s1.getClass().getName());*/


//        String[ ] str = new String[5];
//        str[0] = "A";
//        str[1] = "20";
//        str[2]="30";
//        str[3] = "B";
//        str[4] = "C";
//        System.out.println(Arrays.toString(str));






    }
}
