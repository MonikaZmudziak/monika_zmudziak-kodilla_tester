package com.kodilla.school;

public class Grades {

    private int[] values;
    private int size; //wielkość tablicy

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++; // zwiększamy o jeden wielkość tablicy
        int[] newTab = new int[this.size];//tworzenie pustej tablicy z nowym rozmiarem
        System.arraycopy(values, 0, newTab, 0, values.length);//skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów.
        newTab[this.size - 1] = value;//przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        this.values = newTab;//przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.
    }

    public int[] getValues() {
        return values;
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}