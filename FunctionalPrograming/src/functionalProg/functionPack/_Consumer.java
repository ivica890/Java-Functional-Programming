package functionalProg.functionPack;

import java.util.function.Consumer;

public class _Consumer {

    //Consumer prima eden argument i ne vrakja nisto odnosno e isto kako void function
    public static void main(String[] args) {

        Customer customer = new Customer("ivica","075392303");
        greetCustomer(new Customer("Ivica","123456789"));

        customerConsumer.accept(customer);
        greetCustomerConsumer.accept(customer);
    }

    //Consumer so lambda
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getCustomerName() +
            " and my number is " +
            customer.getCustomerPhoneNumber());
    //Consumer so peski

    static Consumer<Customer> customerConsumer = new Consumer<Customer>() {
        @Override
        public void accept(Customer customer) {
            System.out.println("Hello " + customer.getCustomerName() +
                    " and my number is " +
                    customer.getCustomerPhoneNumber());
        }
    };

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.getCustomerName() +
                " and my number is " +
                customer.getCustomerPhoneNumber());
    }
}

class Customer{
    private String customerName;
    private String customerPhoneNumber;

    public Customer(String customerName, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}
