package ForLoop_Diagrams;

public class patternStar {
    private String name;
    private int num;
    private double salary;

    public String getName(){
        return  name;

    }
    public void setName(String name){
        this.name=name;
    }
public int getNum(){
        return num;
}
public void setName(int num){
        this.num=num;
}
public double getSalary(){
        return salary;
}
public void setSalary(double salary){
        this.salary=salary;
}

    public static void main(String[] args) {
        patternStar ps=new patternStar();
        ps.setName(10);
        ps.setName("vijay");
        ps.setSalary(40000d);
        System.out.println(ps.getName());
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
