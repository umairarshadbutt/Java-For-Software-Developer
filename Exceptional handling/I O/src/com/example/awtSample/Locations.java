package com.example.awtSample;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations= new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException{

        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for (Location location: locations.values()){
                locFile.writeObject(location);
            }
        }

    }

    static {

        try (ObjectInputStream locFile= new ObjectInputStream(new BufferedInputStream( new FileInputStream("locations.dat")))){
            boolean eof = false;
            while (!eof){
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read location "+ location.getLocationID()+" : "+location.getDescription());
                    System.out.println("Found "+ location.getExits().size()+" exits");

                    locations.put(location.getLocationID(), location);
                } catch (EOFException e){
                    eof=true;
                }
            }
        } catch (IOException io){
            System.out.println("IO Exception "+  io.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("IO Exception "+  e.getMessage());

        }

    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return locations.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return locations.containsKey(o);
    }

    @Override
    public Location get(Object o) {
        return locations.get(o);
    }

    @Override
    public Location put(Integer integer, Location location) {
        return locations.put(integer,location);
    }

    @Override
    public Location remove(Object o) {
        return locations.remove(o);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {
        locations.putAll(map);
    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
