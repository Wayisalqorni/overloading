package com;

import java.lang.management.PlatformLoggingMXBean;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // overlading pada construktor
        Player player1 = new Player("Bagas");
        Player player2 = new Player("Nita");
        Player player3 = new Player();
        Player player4 = new Player();

        System.out.println("Nama Player :");
        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // Overloading method

        int a = (int) Matematika.tambah(10, 9);
        System.out.println("\nPertambahan: ");
        System.out.println("hasil dari 10 + 9 adalah   =" + a);
        double b = Matematika.tambah(20, 1.5);
        System.out.println("hasil dari 20 + 1.5 adalah =" + b);
    }
}