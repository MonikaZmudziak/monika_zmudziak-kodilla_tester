package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Shop {

    private List<Order> orders = new ArrayList<>();

    //dodanie nowego zamówienia
    public void addOrder(Order order) {
        orders.add(order);
    }

    //zwrócenie listy zamówień z zakresu dwóch dat

    public Set<Order> getOrdersFromDateRange(LocalDate firstDate, LocalDate secondDate) {
        return orders.stream()
                .filter(order -> order.getDate().isAfter(firstDate) && order.getDate().isBefore(secondDate))
                .collect(Collectors.toSet());
    }

    //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)

    public Set<Order> getOrderFromValueRange(double firstValue, double secondValue) {
        return orders.stream()
                .filter(order -> order.getValue() > firstValue && order.getValue() < secondValue)
                .collect(Collectors.toSet());
    }

    //zwrócenie liczby zamówień
    public int getSize() {
        return orders.size();
    }

    //zsumowanie wartości wszystkich zamówień

    public double getTotalValue() {
        double totalValue = 0;
        for (Order order : orders) {
            totalValue = totalValue + order.getValue();
        }
        return totalValue;
    }
}