package com.company;

import java.util.ArrayList;

public class GroceryList {

    private  int[] myNumber;
    private ArrayList<String> groceryList =new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItems(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " item in your list");
        for (int i=0; i<groceryList.size() ; i++){
            System.out.println((i+1) + ". "+ groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem,String newItem){
        int position =findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+(position+1) +" has been modified. ");
    }

    public void removeGroceryItem(String newItem){
        int position =findItem(newItem);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public int findItem(String searchItem){
//        boolean exists= groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }
}
