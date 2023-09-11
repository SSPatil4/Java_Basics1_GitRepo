package ArayPrograms;


public class PossibleOutcomes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        for (int i = 0; i < (1 << n); i++) {
             System.out.print("{ ");
            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) > 0)
                    System.out.print(array[j] + " ");
            System.out.println("}");
        }


    }


}





