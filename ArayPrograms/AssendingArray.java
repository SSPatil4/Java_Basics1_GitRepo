package ArayPrograms;

public class AssendingArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int i, j, k;
        int array = arr.length;

        for (i = 0; i < array; i++) {
            for (j = i + 1; j < array; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
            System.out.println("ascending "+arr[i]);
        }

    }
}


class For_Each {
    public static void main(String[] arg) {
        {
            int[] marks = {125, 132, 95, 116, 110};

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }

    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers) {
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
