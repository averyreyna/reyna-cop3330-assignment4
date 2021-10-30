/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Avery Reyna
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Objects;
import javafx.stage.Stage;
import ucf.assignments.Application.*;

public class ApplicationController
{
    /*

    // initialize "outerMap" as a double HashMap that contains a String and ItemDetails
    // initialize "innerMap" as HashMap that contains a String and ItemDetails
    HashMap<String, HashMap<String, Application.ItemDetails>> outerMap = new HashMap<>();
    HashMap<String, Application.ItemDetails> innerMap = new HashMap<>();

    // create a function "addToDoList" that takes in the outerMap HashMap and innerMap HashMap
        // use the .put() method to add the toDoListTitle and innerMap HashMap to the outerMap HashMap
        // return the outerMap HashMap
    public static HashMap<String, HashMap<String, Application.ItemDetails>> addToDoList(HashMap<String, HashMap<String, ItemDetails>> outerMap, HashMap<String, ItemDetails> innerMap)
    {
        outerMap.put(toDoListTitle, innerMap);
        return outerMap;
    }

    // create a function "addItem" that takes in the innerMap HashMap
        // initialize "itemDetails" with the ItemDetails data type

        // use the .setDueDate() to add a due date to the itemDetails
        // use the .setItemDescription() to add an item description to the itemDetails

        // initialize "completionFlag" as an integer equal to 0
        // use the .setCompletionFlag() method to add a completionFlag to the itemDetails

        // use the .put() method to add the itemTitle and itemDetails to the innerMap HashMap
        // return the innerMap HashMap
    public static HashMap<String, Application.ItemDetails> addItem(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setDueDate(dueDate);
        itemDetails.setItemDescription(itemDescription);

        int completionFlag = 0;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    // create a function "removeToDoList" that takes in the outerHashMap, innerHashMap, and the to-do list the user wants to delete
        // use the .remove() method to remove the to-do list title and its inner map to fully remove a to-do list
        // once that is done, return the outerMap HashMap so the user can see the updated to-do list
    public static HashMap<String, HashMap<String, Application.ItemDetails>> removeToDoList(HashMap<String, HashMap<String, Application.ItemDetails>> outerMap, HashMap<String, Application.ItemDetails> innerMap)
    {
        outerMap.remove(toDoListTitle, innerMap);
        return outerMap;
    }

    // create a function "removeItem" that takes in the innerHashMap and the desired item the user wants to delete
        // initialize "itemDetails" with the ItemDetails data type

        // use the .remove() method in order to remove the item title and details of the item
        // return the innerMap HashMap
    public static HashMap<String, Application.ItemDetails> removeItem(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        innerMap.remove(itemTitle, itemDetails);
        return innerMap;
    }

    // create a function "editItemDueDate" that takes in the innerMap HashMap as its only parameter
        // initialize "itemDetails" with the ItemDetails data type

        // use the .setDueDate() method to set the due date within itemDetails
        // use the .put() method to add the itemTitle and itemDetails into the innerMap HashMap

        // return the innerMap HashMap
    public static HashMap<String, Application.ItemDetails> editItemDueDate(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setDueDate(dueDate);
        innerMap.put(itemTitle, itemDetails);

        return innerMap;
    }

    // create a function "editItemDescription" that takes in the innerMap HashMap as its only parameter
        // initialize "itemDetails" with the ItemDetails data type

        // use the .setItemDescription() method to add the item description to the itemDetails

        // initialize "completionFlag" as an integer equal to 0
        // use the .setItemDescription() method to add the itemDescription to the itemDetails

        // use the .put() method to add the itemTitle and itemDetails to the innerMap HashMap
        // return the innerMap HashMap
    public static HashMap<String, Application.ItemDetails> editItemDescription(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setItemDescription(itemDescription);

        int completionFlag = 0;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    // create a function "editItemCompletionStatus" that takes in the innerMap HashMap as its only parameter
        // initialize "itemDetails" with the ItemDetails data type

        // initialize "completionFlag" as an integer equal to 0
        // use the .setCompletionFlag() method to add the completionFlag to the itemDetails

        // use the .put() method to add the itemTitle and itemDetails to the innerMap HashMap
        // return the innerMap HashMap
    public static HashMap<String, Application.ItemDetails> editItemCompletionStatus(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        int completionFlag = 1;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    // create a function "createCompletedItemsList" that takes in the innerMap HashMap as its only parameter
        // initialize "completedItemsList" as an array list
        // initialize "itemDetails" with the ItemDetails data type
        // initialize "i" as an integer equal to 0

        // create a for loop that goes through the itemDetails HashMap that uses the .getValue() method to get the getItemCompletionFlag() of each item

        // create an if statement that uses the .set() method to add a struct into the completedItemsList if the item's struct contains a completionFlag the equals 1

        // return the completedItemsList array list
    public ArrayList<ItemDetails> createCompletedItemsList(HashMap<String, ItemDetails> innerMap)
    {
        ArrayList<ItemDetails> completedItemsList = new ArrayList<>();
        ItemDetails itemDetails = new ItemDetails();
        int i = 0;

        for (HashMap.Entry<String, ItemDetails> entry : innerMap.entrySet())
        {
            i++;
            Integer completionFlag = entry.getValue().getItemCompletionFlag();

            if (completionFlag == 1)
            {
                completedItemsList.set(i, innerMap.getOrDefault(entry.getKey(), itemDetails));
            }
        }

        return completedItemsList;
    }

    // create a function "createUncompletedItemsList" that takes in the innerMap HashMap as its only parameter
        // initialize "uncompletedItemsList" as an array list
        // initialize "itemDetails" with the ItemDetails data type
        // initialize "i" as an integer equal to 0

        // create a for loop that goes through the itemDetails HashMap that uses the .getValue() method to get the getItemCompletionFlag() of each item

        // create an if statement that uses the .set() method to add a struct into the uncompletedItemsList if the item's struct contains a completionFlag the equals 0

        // return the uncompletedItemsList array list
    public ArrayList<ItemDetails> createUncompletedItemsList(HashMap<String, ItemDetails> innerMap)
    {
        ArrayList<ItemDetails> uncompletedItemsList = new ArrayList<>();
        ItemDetails itemDetails = new ItemDetails();
        int i = 0;

        for (HashMap.Entry<String, ItemDetails> entry : innerMap.entrySet())
        {
            i++;
            Integer completionFlag = entry.getValue().getItemCompletionFlag();

            if (completionFlag == 0)
            {
                completedItemsList.set(i, innerMap.getOrDefault(entry.getKey(), itemDetails));
            }
        }

        return uncompletedItemsList;
    }

    // create a function "editToDoListTitle" that takes in a String "oldToDoListTitle", String "newToDoListTitle", outerMap HashMap, and the innerMap HashMap
        // initialize "copyOfItems" as a HashMap that uses the .remove() method to remove the oldToDoListTitle
        // use the .put() method to add the newToDoListTitle and copyOfItems into the outerMap HashMap

        // return the outerMap HashMap
    public static HashMap<String, HashMap<String, ItemDetails>> editToDoListTitle(String oldToDoListTitle, String newToDoListTitle, HashMap<String, HashMap<String, ItemDetails>> outerMap, HashMap<String, ItemDetails> innerMap)
    {
        HashMap<String, ItemDetails> copyOfItems = outerMap.remove(oldToDoListTitle);
        outerMap.put(newToDoListTitle, copyOfItems);

        return outerMap;
    }
    
    */

    // this is the beginning of the interactivity between the different fxml files that make-up the desktop app
    // when you click a certain button, then it will bring you to another screen that is another feature of the to-do list
    // this interactivity is achieved by replacing the onAction parameter with the appropriate function found below
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Hello!");
    }

    // this creates functionality to bring the user to the "welcome back!" screen
    public void onBackToHomeClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WelcomeScreen.fxml")));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    // this creates functionality to bring the user to the "edit to-do list" screen
    public void onEditListClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("EditToDoList.fxml")));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // this creates functionality to bring the user to the "create a to-do list" screen
    @FXML
    protected void onMakeListClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CreateToDoList.fxml")));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void onDeleteItemClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Delete item!");
    }

    public void onViewCompletedItemsClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Completed items!");
    }

    public void onViewUncompletedItemsClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Uncompleted items!");
    }

    // this creates functionality to bring the user to the "your to-do list " screen
    public void onSubmitListClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("YourToDoList.fxml")));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void onSubmitItemClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Submit to-do list item!");
    }

    public void onBackToListClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Go back to to-list!");
    }

    public void onEditItemClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Edit item!");
    }

    public void onBackToItemClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Go back to item!");
    }

    // this creates functionality to bring the user to the "create item" screen
    public void onMakeItemClick(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CreateItem.fxml")));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}