package ru.otus.javabasic.myTest;


public class Example01 {
    public static void main(String[] args) {
        Customer customer = new Customer(
                CustomerType.CORPORATE,
                "ABC corporation",
                "John",
                "123-45-67",
                "123123");

        var discount = customer.getDiscount();
        System.out.println(discount);

        Customer ivanov = new Customer(
                CustomerType.PERSONAL,
                "Ivanov",
                null,
                null,
                null);

        var discountIvanov = ivanov.getDiscount();
        System.out.println(discountIvanov);
    }
}

enum CustomerType {
    CORPORATE,
    PERSONAL
}

class Customer {
    private CustomerType customerType;
    private String name;
    private String contactName;
    private String contactPhone;
    private String creditCardNumber;

    public Customer(
            CustomerType customerType,
            String name,
            String contactName,
            String contactPhone,
            String creditCardNumber) {

        this.customerType = customerType;
        this.name = name;
        if (customerType == CustomerType.CORPORATE) {
            this.contactName = contactName;
            this.contactPhone = contactPhone;
        } else if (customerType == CustomerType.PERSONAL) {
            this.creditCardNumber = creditCardNumber;
        }
    }

    public int getDiscount() {
        int discount = 0;

        switch (customerType) {
            case CORPORATE:
                discount = 10;
                break;
            case PERSONAL:
                discount = 50;
                break;
        }

        return discount;
    }
}
