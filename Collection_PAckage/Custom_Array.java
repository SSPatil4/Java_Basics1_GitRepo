package Collection_PAckage;

import java.util.Iterator;
import java.util.ListIterator;

public class Custom_Array {
    Object[] array;
    int s;
    int capacity;

    Custom_Array(){
        capacity=7;
        s=0;
        array = new Object[capacity];
    }

    void add1(Object item01){
        array[s++]=item01;
    }

    Object get1(int index){
        return array[index];
    }

    Object remove (int index){
        if (index < 0 ||index >=s){
          throw new IndexOutOfBoundsException("Enter valid index");
        }
        Object removeArray = array[index];
        for (int i = index; i <s-1 ; i++) {
            array[i]=array[i+1];
        }
        s--;
        return removeArray;

    }
    int size1(){
        return s;
    }

    public static void main(String[] args) {
        Custom_Array obj = new Custom_Array();
        obj.add1(1001);
        obj.add1(1002);
        obj.add1(1003);
        obj.add1(1004);
        obj.add1(1005);
        obj.add1(1006);
        obj.add1(1007);
      //  obj.add1(1008);
        System.out.println(obj.remove(1));
        for (int i = 0; i <obj.size1() ; i++) {
            System.out.println(obj.get1(i));
        }







    }


}
