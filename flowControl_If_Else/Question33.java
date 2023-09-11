package flowControl_If_Else;
//A certain grade of steel is graded according to the following conditions
//
//Hardness must be greater than 50
//Carbon content must be less than 0.7
//Tensile strength must be greater than 5600
//The grades are as follows:
//
//Grade is 10 if all three conditions are met
//Grade is 9 if conditions (i) and (ii) are met
//Grade is 8 if conditions (ii) and (iii) are met
//Grade is 7 if conditions (i) and (iii) are met
//Grade is 6 if only one condition is met
//Grade is 5 if none of the conditions are met
//Write a program, which will require the user to give values of hardness,
// carbon content and tensile strength of the steel under consideration and output the grade of the steel

public class Question33 {
    public static void main(String[] args) {
        int hardness=0;
        double carboncontent=0.9;
        int tensile=0;
        if(hardness>50&&carboncontent<0.7&&tensile>5600){
            System.out.println("Grade is 10 if all three conditions are met");
        } else if (hardness>50&&carboncontent<0.7) {
            System.out.println("Grade is 9 if conditions (i) and (ii) are met");

        } else if (carboncontent<0.7&&tensile>5600) {
            System.out.println("Grade is 8 if conditions (ii) and (iii) are met");
        } else if (hardness>50&&tensile>5600) {
            System.out.println("Grade is 7 if conditions (i) and (iii) are met");
        }else if (hardness>50||carboncontent<0.7||tensile>5600){
            System.out.println("Grade is 6 if only one condition is met");
        }else {
            System.out.println("Grade is 5 if none of the conditions are met");
        }

    }
}
