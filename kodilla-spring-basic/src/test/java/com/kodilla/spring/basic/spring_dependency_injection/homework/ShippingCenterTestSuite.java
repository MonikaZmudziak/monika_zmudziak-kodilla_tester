package com.kodilla.spring.basic.spring_dependency_injection.homework;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void testAllowedWeight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean message = bean.deliverPackage("Lublin", 30);
        Assertions.assertTrue(message);
    }

    @Test
    public void testOverWeight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean message = bean.deliverPackage("Lublin", 35);
        Assertions.assertFalse(message);
    }

    @Test
    public void testCorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("Lublin");
        Assertions.assertEquals("Package delivered to: Lublin", address);
    }

    @Test
    public void testWrongAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("Lublin");
        Assertions.assertEquals("Package not delivered to: Lublin", address);
    }
}