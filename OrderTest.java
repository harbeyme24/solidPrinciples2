public class OrderTest {
    public static void main(String[] args) {
        OrderAction order = new OrderAction();


        order.calculateTotal(10.0, 2);
        order.placeOrder("Edroso", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("edroso@example.com");
    }
}
