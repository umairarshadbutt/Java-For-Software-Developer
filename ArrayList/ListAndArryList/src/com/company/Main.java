package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice =0;
        printInstructions();

        while (!quit){
            System.out.println("Enter Your Choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case  0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    repmveItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }

        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray= new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray= new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery Items: ");
        groceryList.addGroceryItems((scanner.nextLine()));
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");

        String itemNo =scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void repmveItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem );
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }


    }}
