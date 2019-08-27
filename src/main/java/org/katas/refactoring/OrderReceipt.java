package org.katas.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    private double getSalesTax(Order order) {
        double taxRate = 0.1;
        double totalTax = 0.0;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * taxRate;
            totalTax += salesTax;
        }
        return totalTax;
    }
    
    
    private double getTotalAmount(Order order) {
        double taxRate = 0.1;
        double totalAmount = 0.0;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * taxRate;
            totalAmount += lineItem.totalAmount() + salesTax;
        }
        return totalAmount;
    }
    
    private StringBuilder printLineItems(Order order) {
        StringBuilder result = new StringBuilder();
        for (LineItem lineItem : order.getLineItems()) {
            result.append(lineItem.getDescription());
            result.append('\t');
            result.append(lineItem.getPrice());
            result.append('\t');
            result.append(lineItem.getQuantity());
            result.append('\t');
            result.append(lineItem.totalAmount());
            result.append('\n');
        }
        return result;
    }
    
    
    
    public String printReceipt() {
        StringBuilder receipt = new StringBuilder();
        double salesTax = getSalesTax(order);
        double totalAmount = getTotalAmount(order);       
        receipt.append("======Printing Orders======\n");
        receipt.append(order.getCustomerName());
        receipt.append(order.getCustomerAddress());
        receipt.append(printLineItems(order));        
        receipt.append("Sales Tax").append('\t').append(salesTax);
        receipt.append("Total Amount").append('\t').append(totalAmount);
        return receipt.toString();
    }
}