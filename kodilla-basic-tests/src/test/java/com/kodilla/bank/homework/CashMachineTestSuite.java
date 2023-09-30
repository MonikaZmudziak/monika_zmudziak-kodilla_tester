package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {



    @Test // poprawne zliczanie salda
    public void shouldSumTransactionValueCorrectly() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(500);
        cashMachines.add(500);
        cashMachines.add(-200);
        assertEquals(10800, cashMachines.balance());
    }

    @Test // nie uwzględnia transkacji wypłąt ponad saldo
    public void shouldSumOnlyCorrectTransactions() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(500);
        cashMachines.add(-12000);
        assertEquals(10500, cashMachines.balance());
    }

    @Test // poprawnie zlicza ilość transakcji w bankomacie (+ saldo początkowe)
    public void shouldCountNumberAllTransactions() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(500);
        cashMachines.add(500);
        cashMachines.add(-200);
        assertEquals(4, cashMachines.howManyTransactions());
    }

    @Test // poprawnie zlicza ilość wypłat
    public void shouldCountNumberAllPayments() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(500);
        cashMachines.add(-500);
        cashMachines.add(-200);
        cashMachines.add(20);
        assertEquals(2, cashMachines.paymentsCount());
    }

    @Test // poprawnie zlicza ilość wpłat(+ saldo początkowe)
    public void shouldCountNumberAllDeposits() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(500);
        cashMachines.add(-500);
        cashMachines.add(-200);
        cashMachines.add(500);
        assertEquals(3, cashMachines.depositsCount());
    }

    @Test //zwraca tylko saldo jak nie ma transakcji
    public void shouldReturnInitialSaldoIfNoTransactionWereMade() {
        CashMachine cashMachines = new CashMachine();
        assertEquals(10000, cashMachines.balance());
    }

    @Test // średnia wpłat
    public void shouldCountDepositsAverageCorrectly() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(100);
        cashMachines.add(100);
        cashMachines.add(-1007);
        assertEquals(3400, cashMachines.averageOfDeposits(), 0.01);
    }

    @Test // średnia wypłat z
    public void shouldCountPaymentsAverageCorrectly() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(100);
        cashMachines.add(-200);
        cashMachines.add(-100);
        cashMachines.add(-9999999);
        assertEquals(-150, cashMachines.averageOfPayments(), 0.01);
    }

    @Test // zwraca średnią wypłat zero kiedy nie ma wypłat
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoPayments() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(10);
        cashMachines.add(100);
        cashMachines.add(30);
        assertEquals(0.0, cashMachines.averageOfPayments(), 0.01);
    }

}