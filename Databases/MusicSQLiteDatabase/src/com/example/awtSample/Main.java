package com.example.awtSample;

import com.example.awtSample.model.Artist;
import com.example.awtSample.model.DataSource;
import com.example.awtSample.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists=datasource.queryArtists(5);
        if(artists == null){
            System.out.println("No artist!");
            return;
        }

        for(Artist artist: artists){
            System.out.println("ID = "+ artist.getId()+ ", Name = "+ artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Pink Floyed", DataSource.ORDER_BY_DESC);

        for(String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if(songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }


        datasource.querySongsMetadata();
        int count= datasource.getCount(DataSource.TABLE_SONGS);
        System.out.println("NUmber of songs is: "+ count);

        datasource.close();
    }
}
