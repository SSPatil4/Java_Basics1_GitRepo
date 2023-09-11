package ArayPrograms;

public class duplicatePro2 {
    public static void main(String[] args) {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i].equals(my_array[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + my_array[j]);
                }
            }
        }
    }

}


class dep {

    public static void main(String[] args) {
        String[] array = {"ssp", "ssp","vsp", "ssp", "vsp", "spp", "spp", "bsp", "bsp"};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) && (i!=j)) {
                    System.out.println("print duplicate word=" + array[j]);
                }
            }
        }
    }
}
