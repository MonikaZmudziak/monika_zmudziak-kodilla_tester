package com.kodilla.bank.homework;

public class CashMachineMain {
    public static void main(String[] args) {

        CashMachine bankomat = new CashMachine();
        bankomat.add(10);
        bankomat.add(3);
        bankomat.add(12);
        bankomat.add(-13);

//        System.out.println(bankomat.balance());
//        System.out.println(bankomat.howManyTransactions());

        CashMachine bankomat1 = new CashMachine();
        bankomat1.add(2); // (10000+2)/2


        Bank bank = new Bank();
        bank.addCashMachine(bankomat);
        bank.addCashMachine(bankomat1);

        //System.out.println(bank.cashMachinesBalance());

        System.out.println("Average deposits: " + bank.cashMachinesDepositsAverage());
        System.out.println("Average payments: " + bank.cashMachinesPaymentsAverage());

    }
}
