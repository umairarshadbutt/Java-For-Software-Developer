package com.example.awtSample;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations= new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException{
//
//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
//            for(Location location: locations.values()){
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
//                locFile.writeInt(location.getExits().size() - 1);
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
        //           }
//        }


        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for (Location location: locations.values()){
                locFile.writeObject(location);
            }
        }


//        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
//             BufferedWriter dirFile= new BufferedWriter(new FileWriter("directions.txt"))){
//            for(Location location : locations.values()){
//                locFile.write(location.getLocationID() + ", "+ location.getDescription()+"\n");
//                for(String direction : location.getExits().keySet()){
//                    if (!direction.equalsIgnoreCase("Q")){
//                        dirFile.write(location.getLocationID()+", "+ direction+ location.getExits().get(direction) + "\n");
//                    }
//
//                }
//            }
//        }
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
//            boolean eof = false;
//            while(!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read Location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits");
//                    for (int i = 0; i < numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + ", " + description);
//
//                    }
//                    locations.put(locID, new Location(locID, description, exits));
//                } catch (EOFException e) {
//                    eof = true;
//                }
//
//            }
//            } catch (IOException e){
//            System.out.println("IO Exception");
//        }

//        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))){
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        //Now read the exist
//        try (Scanner scanner =new Scanner(new BufferedReader(new FileReader("directions_big.txt")))){
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                String input = scanner.nextLine();
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[0]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
