package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testOrderExist() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        // when
        Order order = warehouse.getOrder("1");
        // then
        Order expected = new Order("1");
        assertEquals(expected, order);
    }

    @Test
    public void testOrderDoesntExistException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("55"));
    }


}