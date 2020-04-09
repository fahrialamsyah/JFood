import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class CashInvoice extends Invoice {
    private PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    public CashInvoice(int id, ArrayList<Food> food, Customer customer) {
        super(id, food, customer);
    }

    public CashInvoice(int id, ArrayList<Food> food, Customer customer, int deliveryFee){
        super(id, food, customer);
        this.deliveryFee = deliveryFee;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice() {
        ArrayList<Food> listFood = super.getFoods();
        int total = 0;

        for (Food food: listFood) {
            total += food.getPrice();
        }


        if (deliveryFee > 0) {
            super.totalPrice = total + deliveryFee;
        } else {
            super.totalPrice = total;
        }
    }

    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Food> list = super.getFoods();
        for (Food food: list) {
            stringBuilder.append(food.getName()).append("\n");
        }
        setTotalPrice();
        return "\nId: " + super.getId() + "\n" +
                "Food Name: " + stringBuilder + "\n" +
                "Date: " + formatter.format(super.getDate().getTime()) + "\n" +
                "Delivery Fee: " + deliveryFee + "\n" +
                "Total Price: " + super.totalPrice + "\n" +
                "Customer Name: " + super.getCustomer().getName() + "\n" +
                "Invoice Status: " + super.getInvoiceStatus().toString() + "\n" +
                "Payment Type: " + PAYMENT_TYPE.toString();
    }

    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }
}