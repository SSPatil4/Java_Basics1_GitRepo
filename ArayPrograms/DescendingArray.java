package ArayPrograms;

public class DescendingArray {
    public static void main(String[] args) {
        int[] array= {1,2,3};
        int i,j,k;
        int arr= array.length;
        for (i=0;i<arr; i++){
            for (j=i+1;j<arr;j++){
                if (array[i]<array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("descending ="+array[i]);
        }
        System.out.println("largest number ="+array[0]);

    }


}
