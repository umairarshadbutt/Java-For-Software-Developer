package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

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

        albums.add(album);

        album=new Album("Asrari" ,"Asrar Shah");
        album.addSong("Ishq huwa, Barbaad huwa",4.45);
        album.addSong("Main Zindabad Hun",4.45);
        album.addSong("kuri",4.45);
        album.addSong("Skar wanda ray",4.45);
        album.addSong("Sab ki khair",4.45);
        album.addSong("Wah Jo Kalam",4.45);
        albums.add(album);

        LinkedList <Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Allah Hik hai",playList);
        albums.get(0).addToPlayList("Ghoom Charakhra",playList);
        albums.get(0).addToPlayList("Wah Jo Kalam",playList);
        albums.get(0).addToPlayList(4,playList);

        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(15,playList);


        play(playList);


    }
}
