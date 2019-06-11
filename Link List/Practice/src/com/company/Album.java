package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private String atist;
    private ArrayList<Song> songs;

    public Album(String name, String atist, ArrayList<Song> songs) {
        this.name = name;
        this.atist = atist;
        this.songs = songs;
    }


}
