package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test // zwraca wszystkie bankomaty
    public void shouldReturnAllCashMachines() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        assertEquals(2, bank.cashMachinesCount());
    }

    @Test // zwraca wszystkie transakcje uwzgledniając saldo początkowe każdego bankomatu (po 10k)
    public void shouldReturnValueOfAllTransactions() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(200);
        bankomat.add(300);
        bankomat1.add(600);
        bankomat1.add(-400);
        assertEquals(20700, bank.cashMachinesBalance());
    }

    @Test // zwraca wszystkie transakcje uwzgledniając saldo początkowe każdego bankomatu (po 10k)
    public void shouldReturnValueOfAllTransactionsWithoutPaymentsGreaterThanBalance() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(-200000);
        bankomat.add(300);
        bankomat1.add(600);
        bankomat1.add(400);
        assertEquals(21300, bank.cashMachinesBalance());
    }

    @Test // zwraca wszystkie transakcje związane z wypłatą pomijając transkacje większe niż saldo
    public void shouldReturnAmountOfPaymentsWithoutPaymentsGreaterThanBalance() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(-200000);
        bankomat.add(-300);
        bankomat1.add(-600);
        bankomat1.add(400);
        assertEquals(2, bank.allPayments());
    }

    @Test // zwraca wszystkie transakcje związane z wpłatą uwzględniając salda początkowe dwóch bankomatów
    public void shouldReturnAmountOfDeposites() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(20);
        bankomat.add(20);
        bankomat.add(20);
        bankomat.add(-300);
        bankomat1.add(-600);
        bankomat1.add(400);
        assertEquals(6, bank.allDeposits());
    }

    @Test // zwraca średnią wartość wypłat ze wszystkich bankomatów pomijając transkacje większe niż saldo
    public void shouldReturnAverageOfPaymentsWithoutPaymentsGreaterThanBalance() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(-200000);
        bankomat.add(-300);
        bankomat1.add(-600);
        bankomat1.add(400);
        assertEquals(-450, bank.cashMachinesPaymentsAverage());
    }
    @Test // zwraca średnią wartość wypłat ze wszystkich bankomatów pomijając transkacje większe niż saldo
    public void shouldReturnAverageOfDepositsWithoutPaymentsGreaterThanBalance() {

        Bank bank = new Bank();  //stworzenie banku
        CashMachine bankomat = new CashMachine();//stworzenie bankomatu
        CashMachine bankomat1 = new CashMachine();//stworzenie bankomatu
        bank.addCashMachine(bankomat);//dodanie bankomatu do banku
        bank.addCashMachine(bankomat1);//dodanie bankomatu do banku

        bankomat.add(5000);
        bankomat.add(-300);
        bankomat1.add(-600);
        bankomat1.add(15000);
        assertEquals(10000, bank.cashMachinesDepositsAverage());
    }
}