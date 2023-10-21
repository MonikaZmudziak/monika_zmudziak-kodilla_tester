package com.kodilla.execution_model.homework;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void testGetOrdersDateRange() {
        LocalDate startDate = LocalDate.of(2021, 10, 1);
        LocalDate endDate = LocalDate.of(2022, 10, 31);
        assertEquals(2, shop.getOrdersFromDateRange(startDate, endDate).size());
    }

    @Test
    public void testGetOrdersFromOutOfDateRange() {
        LocalDate startDate = LocalDate.of(2000, 10, 1);
        LocalDate endDate = LocalDate.of(2002, 10, 31);
        assertEquals(0, shop.getOrdersFromDateRange(startDate, endDate).size());
    }

    @Test
    public void testGetTotalOrdersValue() {
        assertEquals(200.00, shop.getTotalValue(), 0.01);
    }

    @Test
    public void testOrdersCount(){
        assertEquals(4, shop.getSize());
    }

    @BeforeEach
    public void initializeShops() {
        shop.addOrder(new Order("loginUserA",20.00, LocalDate.of(2020, 10, 21)));
        shop.addOrder(new Order("loginUserB",40.00, LocalDate.of(2021, 10, 21)));
        shop.addOrder(new Order("loginUserC",60.00, LocalDate.of(2022, 10, 21)));
        shop.addOrder(new Order("loginUserD",80.00, LocalDate.of(2023, 10, 21)));
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}