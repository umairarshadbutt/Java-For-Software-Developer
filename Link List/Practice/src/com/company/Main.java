package com.company;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Album> albums= new ArrayList<>();
    public static void main(String[] args) {
        Album album= new Album("Mix", "Abida Parveen");
        album.addSong("Allah Hik hai", 8.50);
        album.addSong("Main janu mera khuda jany", 6.50);
        album.addSong("Dam mast Qalandar", 7.50);
        album.addSong("Main Naraye Mastana", 8.60);
        album.addSong("Dhondoo gy agr malkoon malkoon", 8.50);
        album.addSong("Ghoom Charakhra", 8.20);

    }
}
