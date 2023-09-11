package Collection_PAckage;
//create custom arraylist
public class Custom_array1 {
    Object [] array;
    int s=0;
    int capacity;
    Custom_array1(){
        capacity=100;
        s=0;
        array = new Object[capacity];

    }

    void add(Object items){
        array[s++]=items;
    }
    void remove(Object items1){
        array[s--]=items1;
    }

    Object get(int index){
        return array[index];
    }
    int size(){
        return s;
    }
}

class Custom_child{

    public static void main(String[] args) {
        Custom_array1 obj = new Custom_array1();
        obj.add("saurabh");
        obj.add(1001);
        obj.add("saurabh@gmail.com");
        System.out.println("print value at the mentioned index "+obj.get(1));
        obj.remove("saurabh@gmail.com");

        for (int i=0;i<obj.s;i++){
            System.out.println("get all index information "+obj.get(i));

        }
        System.out.println(obj.size());
    }

}