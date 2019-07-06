package com.example.awtSample.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "music.db";

    //    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\databases\\" + DB_NAME;
    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/azaidi/git/jave-practice-question/Databases/MusicSQLiteDatabase/" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    private Connection conn;

    public boolean open(){
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e){
            System.out.println("Couldn't connect to database: "+ e.getMessage());
            return false;
        }
    }

    public void close(){
        try {
            if (conn != null){
                conn.close();
            }
        }catch(SQLException e){
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }


    public List<Artist> queryArtist(){

        try (Statement statement =conn.createStatement();
             ResultSet results =statement.executeQuery("SELECT * FROM "+TABLE_ARTISTS);){

            List<Artist> artists= new ArrayList<>();
            while (results.next()){
                Artist artist=new Artist();
                artist.setId(results.getInt(COLUMN_ARTIST_ID));
                artist.setName(results.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch (SQLException e){
            System.out.println("Query failed: "+ e.getMessage());
            return null;
        }
    }

    public List<String> queryAlbumsForArtist (String artistName, int sortOrder){
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(TABLE_ALBUMS);
        sb.append('.');
        sb.append(COLUMN_ALBUM_NAME);
        sb.append(" FROM ");
        sb.append(TABLE_ALBUMS);
        sb.append(" INNER JOIN ");
        sb.append(TABLE_ARTISTS);
        sb.append(" ON ");
        sb.append(TABLE_ALBUMS);
        sb.append(".");
        sb.append(COLUMN_ALBUM_ARTIST);
        sb.append(" = ");
        sb.append(TABLE_ARTISTS);
        sb.append('.');
        sb.append(COLUMN_ALBUM_ARTIST);
        sb.append(" WHERE ");
        sb.append(TABLE_ARTISTS);
        sb.append('.');
        sb.append(COLUMN_ALBUM_ARTIST);
        sb.append("= \"");
        sb.append(artistName);
        sb.append("\"");
        if(sortOrder != ORDER_BY_NONE) {
            sb.append( " ORDER BY ");
            sb.append(TABLE_ALBUMS);
            sb.append('.');
            sb.append(COLUMN_ALBUM_NAME);
            sb.append(" COLLATE BOCASE ");
            if(sortOrder == ORDER_BY_DESC){
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL statement = "+ sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<String> albums = new ArrayList<>();
            while(results.next()) {
                albums.add(results.getString(1));
            }

            return albums;

        } catch(SQLException e) {
            System.out.println("Query failed: "+ e.getMessage());
            return null;
        }

    }


}













