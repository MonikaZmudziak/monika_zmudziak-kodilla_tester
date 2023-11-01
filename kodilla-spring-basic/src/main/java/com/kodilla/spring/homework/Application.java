package com.kodilla.spring.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryServiceApp();
        NotificationService notificationService = new NotificationServiceApp();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Lublin", 25.5);
        shippingCenter.sendPackage("Warsaw", 50.0);
        shippingCenter.sendPackage("Cracow", 52.0);
        shippingCenter.sendPackage("Gdansk", 166.0);
        shippingCenter.sendPackage("Radom", 20.0);


    }
}
