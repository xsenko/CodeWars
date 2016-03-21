package TransportaionOnVacation;

/**
 * Created by SCabuk on 10.02.2016.
 */
public class TransportaionOnVacation {

    public static int rentalCarCost(int d) {
        // Your solution here
        int price = 0;


        if (d < 3) {
            price = (d* 40);
        }

        if (d >= 3 && d < 7) {
            price = (d * 40) - 20;
        }

        if (d >= 7) {
            price = (d * 40) - 50;
        }


        return price;

    }

}
