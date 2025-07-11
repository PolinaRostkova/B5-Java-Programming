package day29_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InstaCart {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        // size() = 0
        //System.out.println(shoppingList.size());
        // capacity by default is 10]

        //System.out.println( shoppingList.isEmpty() );

        statusOfShoppingList(shoppingList);

        String userAnswer = "";
        do {
            System.out.print("Please enter item name to add to the list: ");
            String itemName = key.nextLine();
            shoppingList.add(itemName);

            System.out.print("Do you want to add more item: ");
            userAnswer = key.nextLine(); // Yes, yes, Y, y
        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));

        statusOfShoppingList(shoppingList);
        allItemsInSHoppingList(shoppingList);

        System.out.print("What item do you want to check if it is in your list: ");
        String itemName = key.nextLine();

        itemExistance(shoppingList, itemName);

        System.out.println("------------------------------------------------------------");
        System.out.print("What item do you want to remove: ");
        String itemToRemove = key.nextLine();

        System.out.println(removeItem(shoppingList, itemToRemove));

    }

    // create a method that gives you a message about your shopping list
    // if empty "your shopping list does not have any item"
    // if NOT empty "your shopping list have some item"

    public static void statusOfShoppingList (ArrayList<String> list){
//        if (list.isEmpty()){
//            System.out.println("Your shopping list does not have any item");
//        } else {
//            System.out.println("Your shopping list have some items");
//        }
       System.out.println(list.isEmpty() ? "Your shopping list does not have any item" : "Your shopping list have some items");

    }

    public static void allItemsInSHoppingList(ArrayList<String> list){
        System.out.println(list.size() +" items in your shopping list: ");
        for (String itemName : list){
            System.out.println("\t" + itemName);
        }
    }
    public static void itemExistance(ArrayList<String> list, String item){

        String lowerCase = item.toLowerCase();
        System.out.println(list.contains(lowerCase) ? item + " is available in your list" : item + " is NOT available in your list");
    }

    public static ArrayList<String> removeItem(ArrayList<String> list, String itemToRemove){
        // digit or not

        // for class always a single digit
        if (Character.isDigit(itemToRemove.charAt(0))){
            // todo handle is this number is outside of the range
            list.remove(Integer.parseInt(itemToRemove) - 1);
        } else {
            list.remove(itemToRemove);
        }

        return list;
    }
}
