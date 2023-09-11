package Encapsulation;

public class encap5 {
    private String myName;

    public String getMyName (){
        return myName = myName;
    }
    public void setMyName (String myName){
        this.myName=myName;
    }

    private String email;

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    private int acc ;
    public int getAcc(){
        return acc;
    }
    public void setAcc(int acc){
        this.acc = acc;

    }

    public static void main (String [] args){

        encap5  obj = new encap5();
        obj.setMyName("Saurabh");
        System.out.println("My Name is "+obj.getMyName());

        obj.setEmail("SAurabh@Gmail.com");
        System.out.println("Email Id is "+obj.getEmail());

        obj.setAcc(1001);
        System.out.println("My Acc no is "+obj.getAcc());
    }
}
