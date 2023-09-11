package ArayPrograms;

//print duplicate no in array
public class duplicatePro {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 4,5,2,2,2};
        System.out.println("print duplicate arrays =");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}


//print all values in array
class dup {
    // new program to get all marks
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};

//      for calling array members
        for (int i = 0; i < marks.length; i++) {
//            for (int j=i;j<=marks.length;j++){
            System.out.println(marks[i]);
//            }
        }
//      for calling array members
        for(int s:marks){
            System.out.println(s);
        }

//      for calling array members in reverse order
        for (int i=marks.length-1;i>=0;i--){
            System.out.println("reverse array "+marks[i]);
        }
    }

}



