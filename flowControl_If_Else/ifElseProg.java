package flowControl_If_Else;



public class ifElseProg {
    public static void main(String[] args) {
        int totalSeats = 300; //a
        int govforms = 151; //b
        int seatsWon = 151; //c

        if (seatsWon > govforms) {
            System.out.println("forms gov");
        } else if (govforms > seatsWon) {
            System.out.println("defeat");

        } else {
            System.out.println("no clear majority");

        }

        //ternary operator
      //  int r =  d > 100 ? 200 : 300;

    }
}
