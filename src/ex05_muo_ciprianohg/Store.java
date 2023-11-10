//EX05_MUO_CiprianoHG

package ex05_muo_ciprianohg;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      earnings = 0;
      itemList = new ArrayList<>();
      storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if(index >= itemList.size()){
          System.out.println("There are only " + itemList.size() + " items in the store.");
      }
      else{
          earnings += itemList.get(index).getCost();
          System.out.println(itemList.get(index).getName() + " was sold for " + itemList.get(index).getCost() + ".");
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
      boolean status = false;
      for(Item x: itemList){
          if(x.getName().equals(name)){
              earnings += x.getCost();
              System.out.println(x.getName() + " was sold for " + x.getCost() + ".");
              status = true;
          }
      }
      if(status == false){
          System.out.println(this.name + " doesn't sell " + name + ".");
      }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if(itemList.contains(i)){
          earnings += i.getCost();
          System.out.println(i.getName() + " was sold for " + i.getCost() + ".");
      }
      else{
          System.out.println(name + " doesn't sell " + i.getName() + ".");
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale 
  }
  public void addItem(Item i){
      itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
      for(Item x: itemList){
          if(x.getType() == type){
              System.out.println(x.getName());
          }
      }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
      for(Item x: itemList){
          if(x.getCost() <= maxCost){
              System.out.println(x.getName());
          }
      }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      for(Item x: itemList){
          if(x.getCost() >= minCost){
              System.out.println(x.getName());
          }
      }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
      for(Store x: storeList){
          System.out.print(x.name + ", ");
          System.out.println("Total earnings: " + x.earnings);
      }
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
