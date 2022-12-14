package com;

public class Player {
    private String name;
    private static int jumlahPlayer;

    // Overloading pada construktor
    // opsi 1:
    Player(String name) {
        Player.jumlahPlayer++;
        this.name = name;
    }

    // opsi 2:
    Player() {
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void show() {
        System.out.println("Name :" + this.name);
    }
}
