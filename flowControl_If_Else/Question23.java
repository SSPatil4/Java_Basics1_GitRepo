package flowControl_If_Else;
//The current year and the year in which the employee joined the organization are entered through the keyboard.
// If the number of years for which the employee has served the organization is greater
// than 3 then a bonus of Rs. 2500/- is given to the employee.
// If the years of service are not greater than 3, then the program should do nothing
public class Question23 {
    public static void main(String[] args) {
        int currentYr=2003;
        int joiningYr=2000;
        int salary=10000;
        if (currentYr-joiningYr>3){
            System.out.println("salary with bonus ="+(salary+2500));
        }else{
            System.out.println("do nothing");
        }
    }
}
