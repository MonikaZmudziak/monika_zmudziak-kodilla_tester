package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions; //tablica transakcji
    private int size; //liczba transakcji

    public CashMachine() {
        this.transactions = new int[0]; // liczba transakcji na start
        this.size = 0;// ile transakcji dodano
        add(10000); //starowe saldo w bankomacie
    }

    /**
     * metoda dodadjąca transakje i powiekszająca tablice
     * o wpłaty (wartość dodatnia) i wypłaty (wartości ujemne)
     * Walidacja od razu w metodzie wartości skrajnych (0, max kwota możliwa do wypłaty, max kwota możliwa do wpłaty )
     * i czy można wypłacić pieniądze (czy jest ich wystarczająca ilość w bankomacie..
     */
    public void add(int transaction) { //transaction- wartość nowe transakcji, którą dodaje

        if (transaction == 0) {  //jeżeli jest równe zero uciekam, jeżeli większe lub mniejsze ide dalej (dodaje do historii tranakcje)
            return;
        }

        if (balance() + transaction < 0) {//jeżeli kwota wypłaty przewyższa saldo - uciekam
            return;
        }

        this.size++;
        int[] newTab = new int[this.size]; // stworzenie nowej tablicy o zaktualizowanym rozmiarze
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }


    public int balance() { //saldo na koncie

        int sum = 0;

        for (int i = 0; i <= size - 1; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }


    public int howManyTransactions() { //ile transakcji na koncie
        int sumOfTransactions = transactions.length;
        return sumOfTransactions;
    }


    // liczba wypłat

    public int paymentsCount() {

        int count = 0;

        for (int i = 0; i <= size - 1; i++) {
            if (transactions[i] < 0) {
                count = count + 1;
            }
        }
        return count;
    }

    // liczba wpłat

    public int depositsCount() {

        int count = 0;

        for (int i = 0; i <= size - 1; i++) {
            if (transactions[i] > 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public int paymentsSum() { //suma wypłat
        int sum = 0;
        for (int i = 0; i <= size - 1; i++) {
            int value = transactions[i];
            if (value < 0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    public int depositSum() { // suma wpłąt
        int sum = 0;
        for (int i = 0; i <= size - 1; i++) {
            int value = transactions[i];
            if (value > 0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    public double averageOfPayments() { //średnia wartość wypłąt
        if (paymentsCount() == 0) {
            System.out.println("There is no payments");
            return 0;
        }

        return (double)paymentsSum() / paymentsCount();

    }

    public double averageOfDeposits() { //średnia wartość wpłat
        if (depositsCount() == 0) {
            System.out.println("There is no deposites");
            return 0;
        }
        return (double)depositSum() / depositsCount();
    }
}

