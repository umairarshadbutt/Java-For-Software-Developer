package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        LinkedList<String> placesToVisit =new LinkedList<String>();
        addInorder(placesToVisit,"Lahore");
        addInorder(placesToVisit,"Karachi");
        addInorder(placesToVisit,"Sawat");
        addInorder(placesToVisit,"Chitral");
        addInorder(placesToVisit,"Muree");
        printList(placesToVisit);
        visit(placesToVisit);

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

    public static void visit(LinkedList cities){
        Scanner scanner= new Scanner(System.in);
        boolean quite= false;
        ListIterator<String> listIterator=cities.listIterator();

        if(cities.getFirst() == ""){
            System.out.println("No cities in the intererary");
            return;
        } else {
            System.out.println("Now visiting "+ listIterator.next());
            printMenu();
        }

        while (!quite){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quite = true;
                    break;

                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+ listIterator.next());
                    } else {
                        System.out.println("Reach the end of the list");
                    }
                    break;

                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    } else {
                        System.out.println("We are at the last of list");
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }
        }
    }


    private static void printMenu(){
        System.out.println("Available action: \n press");
        System.out.println("0 -to quite \n"+
                "1 - go to next city\n" +
                "2 - go to previous city\n"+
                "3 - print menu options\n");
    }

}
