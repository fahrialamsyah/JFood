package fahrialamsyah.jfood;

/**
 * <h1>Price Calculator<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek Invoice
 * dan menghitung order yang ada.
 *
 * @author Fahri Alamsyah
 * @version 27-February-2020
 *
 */
public class PriceCalculator implements Runnable {
    Invoice input;

    PriceCalculator(Invoice input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.println("Calculating Invoice ID = "+ input.getId());
       // input.setTotalPrice();
        System.out.println("Finish calculating Invoice ID:" +input.getId());
    }
}
