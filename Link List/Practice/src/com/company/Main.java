package com.company;

import java.util.*;

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

    public static void play(LinkedList<Song> playList){
        Scanner scanner= new Scanner(System.in);
        boolean quit = false;
        boolean forward=true;
        ListIterator<Song> listIterator =playList.listIterator();
        if(playList.size() ==0){
            System.out.println("No songs in playlist");
            return;
        } else{
            System.out.println("Now Playing "+ listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action= scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit=true;
                    break;

                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    break;

                case 4:
                   printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }




    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
}
