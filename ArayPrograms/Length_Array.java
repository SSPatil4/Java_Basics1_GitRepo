package ArayPrograms;

public class Length_Array {
    public static void main (String [] args){
        double [] a = new double [] {4,7,5,68,45,7,454,10,40,568,78964,7846,8787,545,175,5422};
        System.out.println("Length of the array using method is "+a.length);

        int i=0,count=0;
       try {
           while (a[i] !='s') {
               count++;
               i++;
           }
       }catch(Exception e){
           System.out.println("Number of elements in an array 'a' without using method is "+ count);

       }
    }
}
