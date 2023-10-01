package com.kodilla.bank.homework;

/**
 * Tablica bankomatów
 * w Banku należy najpierw policzyć sumę wpłat, następnie podzielić przez ilość wpłat.
 * Podobnie dla wypłat
 */

public class Bank {

    private CashMachine[] cashMachines;
    private int size; // liczba bankomatów


    public Bank() {
        this.cashMachines = new CashMachine[0]; // stworzenie tablicy bankomatów o rozmiarze 0
    }

    /**
     * Metoda dodająca bankomaty
     */

    public void addCashMachine(CashMachine atm) {

        this.size++;
        CashMachine[] newTab = new CashMachine[this.size]; // stworzenie nowej tablicy bankomatów o zaktualizowanym rozmiarze
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = atm;
        this.cashMachines = newTab;
    }

    public int cashMachinesCount(){
        int amount = cashMachines.length;
        return amount;
    }

    /**
     * całkowity bilans ze wszystkich bankomatów
     */

    public int cashMachinesBalance() {
        int sum = 0;

        for (int i = 0; i <= size - 1; i++) {
            sum = sum + cashMachines[i].balance();
        }
        return sum;
    }

    /**
     * liczbę transakcji związanych z wypłatą,
     */

    public int allPayments() {

        int count = 0;

        for (int i = 0; i <= size - 1; i++) {
            count = cashMachines[i].paymentsCount() + count;
        }
        return count;
    }


    /**
     * liczbę transakcji związanych z wpłatą,
     */

    public int allDeposits() {
        int count = 0;

        for (int i = 0; i <= size - 1; i++) {
            count = cashMachines[i].depositsCount() + count;
        }
        return count;
    }

    //średnia wartość wypłat dla wszystkich bankomatów w banku
    public double cashMachinesPaymentsAverage() {
        if(size==0){
            return 0;
        }
        double sum=0;

        for (int i = 0; i <= size - 1; i++) {
            sum = cashMachines[i].paymentsSum()+ sum;
        }
        return sum/allPayments();

    }


    //średnia wartość wpłat dla wszystkich bankomatów w banku
    public double cashMachinesDepositsAverage() {
        if(size==0){
            return 0;
        }
        double sum=0;

        for (int i = 0; i <= size - 1; i++) {
            sum = cashMachines[i].depositSum()+ sum;
        }
        return sum/allDeposits();
    }
}




