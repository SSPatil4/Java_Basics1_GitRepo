package flowControl_If_Else;

public class ternaryOperator {

    public static void main(String[] args) {
       /* String dummy = "rrr";
        if (dummy.equals("")) {
            System.out.println("print if condition");
            dummy = "java";
        } else {
            System.out.println("print else condition");
            dummy = "test";
        }*/

        int n1=10,n2=20,bigger_no,summation;

        System.out.println("first number ="+n1);
        System.out.println("second number ="+n2);

        bigger_no=(n1>n2)?n1:n2;
        System.out.println("bigger_no is "+bigger_no);


        summation=(n1<n2)?n1+n2:n1-n2;
        System.out.println("result ="+summation);


    }

}
