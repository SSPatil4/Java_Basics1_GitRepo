package ArayPrograms;

public class PossibleOutcomes1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int a = 0;

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print(arr[k + a] + " ");
                }
                System.out.println();
            }
            System.out.println();
            a++;
        }

    }

}



class test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int array = arr.length;


        for (int i = 0; i < array; i++) {

            for (int j = i; j < array; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]);

                }

                System.out.println(arr[j]);

            }
            System.out.println();
        }

    }
}