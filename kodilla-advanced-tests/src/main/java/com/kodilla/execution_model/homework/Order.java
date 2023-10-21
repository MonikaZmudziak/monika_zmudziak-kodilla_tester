package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double value;
    private LocalDate date;
    private String login;

    public Order(String login,double cost, LocalDate date) {
        this.value = cost;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(value, order.value) == 0 && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, login);
    }

    @Override
    public String toString() {
        return "Order{" +
                "cost=" + value +
                ", data='" + date + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
