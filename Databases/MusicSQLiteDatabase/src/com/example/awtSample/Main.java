package com.example.awtSample;

import com.example.awtSample.model.Artist;
import com.example.awtSample.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists=datasource.queryArtist();
        if(artists == null){
            System.out.println("No artist!");
            return;
        }

        for(Artist artist: artists){
            System.out.println("ID = "+ artist.getId()+ ", Name = "+ artist.getName());
        }

        datasource.close();
    }
}
