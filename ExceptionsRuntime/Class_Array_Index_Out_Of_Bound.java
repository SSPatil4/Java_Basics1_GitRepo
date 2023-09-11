package ExceptionsRuntime;

public class Class_Array_Index_Out_Of_Bound {
    public static void main(String[] args)
    {
        int[ ] list = new int[4];
        list[0]=10;
        list[1]=20;
        list[2]=30;
        list[3]=40;


      try {
          list[4]=50;
          System.out.println(list[4]);
      }catch (Exception e){
          System.out.println("hello catch ");
      }
        System.out.println("executed after try catch block ");
    }
}
