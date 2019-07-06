package com.example.awtSample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

}
