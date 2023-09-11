package ArayPrograms;

public class Duplicate1 {
    void call(){
        int [] array = new int []{4,5,45,4,8,7,4,8};
        int n=array.length;
        int i,j,k;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
    public static void main (String [] args ) {
        Duplicate1 obj = new Duplicate1();
        obj.call();


        String[] array = new String[]{"saurabh", "shankarrao", "patil", "saurabh", "shankarrao", "patil"};
        int n = array.length;
        int i,j;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]==array[j]) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
