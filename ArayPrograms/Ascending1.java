package ArayPrograms;

public class Ascending1 {
    public static void main(String[] args) {
        int [] array = new int []{5,4,3,2,1,7,8,11};
        int n = array.length;
        int i,j,k;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (array[i]>array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("Ascending Array="+array[i]);
        }
        System.out.println("MIN NO ="+array[0]);

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (array[i]<array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("Descending Array="+array[i]);
        }
        System.out.println("MAX NO ="+array[0]);
    }

}
