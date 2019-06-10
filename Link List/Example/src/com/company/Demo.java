package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args){
        LinkedList<String> placesToVisit =new LinkedList<String>();

        placesToVisit.add("Lahore");
        placesToVisit.add("Karachi");
        placesToVisit.add("Sawat");
        placesToVisit.add("Chitral");
        placesToVisit.add("Muree");

        printList(placesToVisit);

        placesToVisit.add(0,"Gujranwala");
        printList(placesToVisit);

        placesToVisit.remove(1);
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInorder(LinkedList<String> linkedList,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if (comparison > 0) {
                //new City should before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
