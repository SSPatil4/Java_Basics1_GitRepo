package flowControl_If_Else;
/*Write a program to calculate the salary as per the following table
        Gender Year of Service Qualifications Salary
        Male >= 10 Post - Graduate 15000
        < 10 Graduate 10000
>= 10 Post -  Graduate 10000
< 10  Graduate 7000
        Female >= 10 Post - Graduate 12000
        < 10 Graduate 9000
>= 10 Post - Graduate 10000
< 10  Graduate 6000*/

public class Question27 {

    public static void main(String[] args) {
        double experience = 9;
        String gender = "male";
        String edu = "graduation";


        if (experience >= 10 && gender == "male" && edu == "post-graduation") {
            System.out.println("salary = " + 15000);}
            else if (experience < 10 && gender == "male" && edu == "graduation") {
                System.out.println("salary = " + 10000);}
               else if (experience >= 10 && gender == "male" && edu == " post-graduation") {
                    System.out.println("salary = " + 10000);}
                 else if (experience < 10 && gender == "male" && edu == "graduation") {
                    System.out.println("salary = " + 7000);}



        if (experience >= 10 && gender == "female" && edu == "post-graduation") {
            System.out.println("salary = " + 12000);}
            else if (experience <= 10 && gender == "female" && edu == "graduation") {
                System.out.println("salary = " + 9000);}
                else if (experience >= 10 && gender == "female" && edu == " post-graduation") {
                    System.out.println("salary = " + 10000);
                } else if (experience < 10 && gender == "female" && edu == "graduation") {
                    System.out.println("salary = " + 6000);
                }
            }
        }
