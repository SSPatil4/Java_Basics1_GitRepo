package AA_SelfDemo;
class RevStr{
    void check(){
        String name ="saurabh patil";
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i)  );
        }
    }

    //Alternate Approach
    static void check01(){
        String str = "check_Out*";
        String reverse="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            reverse= ch+reverse;
        }
        System.out.println(" Reverse String = " +reverse);


    }
    public static void main(String [] args ){
        RevStr obj = new RevStr();
        obj.check();

        check01();

    }
}
