package ArayPrograms;

public class Array_test {
    public static void main(String[] args) {
        int [] array = new int []{5,4,3,2,1,6,9,8,7};
        int n= array.length;
        int i,j,k;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("Ascending array "+array[i]);
        }
        System.out.println("minimum no is "+array[0]);

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]<array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("descending array "+array[i]);
        }
        System.out.println("maximum no is "+array[0]);
    }
    }



