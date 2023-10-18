package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));


        try {
            warehouse.getOrder("1");
            System.out.println("Order exist");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }


        try {
            warehouse.getOrder("50");
            System.out.println("Order exist");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");

        }
    }
}
