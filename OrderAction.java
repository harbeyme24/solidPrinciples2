public class OrderAction implements  Order, Invoicer, Notifier, Calculator
{

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order has now been placed for: " + customerName + " in " + address);
  
    }

    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice has been generator for: " + fileName);

    }

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Sent an Email Notification for: " + email);

    }
    @Override
    public void calculateTotal(double price, int quantity) {
        System.out.println("The Total Comes Down to: " + "₱" + price + quantity);
  
    }


}
