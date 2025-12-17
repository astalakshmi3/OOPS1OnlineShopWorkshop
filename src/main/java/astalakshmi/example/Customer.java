package astalakshmi.example;

public class Customer {
    private int CustomerID;
    private String CustomerName;
    private String CustomerEmail;
    private String CustomerAddress;


    public Customer(int customerID, String customerName, String customerEmail, String CustomerAddress) {
        this.CustomerID = customerID;
        this.CustomerName = customerName;
        this.CustomerEmail = customerEmail;
        this.CustomerAddress = CustomerAddress;
    }
    public int getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
}
