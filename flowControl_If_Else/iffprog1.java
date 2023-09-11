package flowControl_If_Else;

public class iffprog1 {

    public static void main(String[] args) {
        int totalSeats = 300;
        int govforms = 151;

        int seatsWon = 90;
        int loss = 150;

        if (seatsWon >= govforms) {
            System.out.println("forms gov");
        } else if (govforms <= loss) {
            System.out.println("defeat");
        } else {
            System.out.println("no clear majority");

        }
    }
}
