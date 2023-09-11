package ForLoop_StringMethods;
// print in reverse sequence using meth and object
class practice{
    String str = "program";
    String reverse="";

    void show(){
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            reverse  = ch + reverse;
        }
        System.out.println("print in reverse direction in method ="+reverse);


    }

}
class prac extends practice{
     static void add(String rr){
         String r="hanuman";
         String rev="";

        for (int i=0;i<rr.length();i++){
            char c = r.charAt(i);
            rev  = c + rev;
        }
        System.out.println("print in reverse direction in method ="+rev);
    }

    public static void main(String[] args) {
         prac dd = new prac();
         dd.add("ssss");
         add("aaaaa");
   add("Ramayan");
   dd.show();

    }}
 public class prog1  {
    public static void main(String[] args) {
        practice ob = new practice();
ob.show();



        String str = "java";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt((i)));
        }


        String s = "SAURABH";
        for (int i = s.length()-1;i>=0;i--){
            System.out.println("print in reverse direction "+s.charAt(i));
        }


    }

}
