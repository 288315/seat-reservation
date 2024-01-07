import java.util.*;

public class SeatReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char seat [][] = new char[11][5];
        
        System.out.println("Bus Seat Reservation:");

        for (int colnum = 1; colnum <= 4; colnum++) {
            System.out.print("\tColumn " + colnum);
        }

        System.out.println();

        for (int rownum = 1; rownum <= 10; rownum++) {
            System.out.print("Row " + rownum + "\t|");

            for (int i = 1; i <= 4; i++) {
                seat[rownum][i] = '*';
                System.out.print(seat[rownum][i] + "\t\t");
            }
            System.out.println();
        }
        
        while (true) {

            System.out.print("Enter row and column to reserve separated by space (Enter a negative number to exit): ");
            int rowInput = scan.nextInt();
            int columnInput = scan.nextInt();

            if (rowInput > 0 && columnInput > 0) {
                System.out.println("Bus Seat Reservation:");
            } else {
                System.out.println("Program exit!");
                break;
            }

            for (int colnum = 1; colnum <= 4; colnum++) {
                System.out.print("\tColumn " + colnum);
            }

            System.out.println();

            for (int rownum = 1; rownum <= 10; rownum++) {
                System.out.print("Row " + rownum + "\t|");
                
                for (int i = 1; i <= 4; i++) {
                    seat[rowInput][columnInput] = 'X';
                    System.out.print(seat[rownum][i] + "\t\t");
                }
                System.out.println();
            }
        }
    }
}
