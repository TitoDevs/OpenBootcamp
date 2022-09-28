package removeassign.good;

import removeassign.bad.Order;

public class Main {

    double calculateDiscount(Order order, double totalPrice){
        double result = totalPrice;

        if (order == null || order.getPrice() == null)  // programación defensiva
            return result;

        if (order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer();  // sobreescribe totalPrice
        return result;
    }
}