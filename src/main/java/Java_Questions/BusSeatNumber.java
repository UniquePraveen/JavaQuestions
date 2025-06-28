package Java_Questions;

public class BusSeatNumber {

    public static void main(String[] args) {

        int row = 20;
        int seatEachRow = 5;

        for (int i = 0; i <= 20; i++) {

            System.out.print((i+1) + "  Row Left Windows Seat Number: " + ((i*seatEachRow)+1) + "  Right Windows Seat Number: " + ((i+1)*seatEachRow));

            System.out.println();
        }


    }
}
