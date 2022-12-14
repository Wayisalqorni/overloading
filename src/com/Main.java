package com;

import java.lang.management.PlatformLoggingMXBean;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // overlading pada construktor
        Player player1 = new Player("Sendy");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Wayis");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // Overloading method

        int a = Matematika.tambah(3, 10);
        System.out.println(a);
        double b = Matematika.tambah(20, 1.5);
        System.out.println(b);
    }
}