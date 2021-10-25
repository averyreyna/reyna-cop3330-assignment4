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
import java.util.HashMap;
import java.util.Objects;

import javafx.stage.Stage;
import ucf.assignments.Application.*;

public class ApplicationController
{
    /*

    HashMap<String, HashMap<String, Application.ItemDetails>> outerMap = new HashMap<>();
    HashMap<String, Application.ItemDetails> innerMap = new HashMap<>();

    public static HashMap<String, HashMap<String, Application.ItemDetails>> addToDoList(HashMap<String, HashMap<String, ItemDetails>> outerMap, HashMap<String, ItemDetails> innerMap)
    {
        outerMap.put(toDoListTitle, innerMap);
        return outerMap;
    }

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

    public static HashMap<String, HashMap<String, Application.ItemDetails>> removeToDoList(HashMap<String, HashMap<String, Application.ItemDetails>> outerMap, HashMap<String, Application.ItemDetails> innerMap)
    {
        outerMap.remove(toDoListTitle, innerMap);
        return outerMap;
    }

    public static HashMap<String, Application.ItemDetails> removeItem(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        innerMap.remove(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemDueDate(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setDueDate(dueDate);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemDescription(HashMap<String, Application.ItemDetails> innerMap)
    {
        ItemDetails itemDetails = new ItemDetails();

        itemDetails.setItemDescription(itemDescription);

        int completionFlag = 0;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemCompletionStatus(HashMap<String, Application.ItemDetails> innerMap)
    {

        ItemDetails itemDetails = new ItemDetails();

        int completionFlag = 1;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

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

    public ArrayList<ItemDetails> createUncompletedItemsList(HashMap<String, ItemDetails> innerMap)
    {
        ArrayList<ItemDetails> completedItemsList = new ArrayList<>();
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
    }

    public static HashMap<String, HashMap<String, ItemDetails>> editToDoListTitle(String oldToDoListTitle, String newToDoListTitle, HashMap<String, HashMap<String, ItemDetails>> outerMap, HashMap<String, ItemDetails> innerMap)
    {

        HashMap<String, ItemDetails> copyOfItems = outerMap.remove(oldToDoListTitle);
        outerMap.put(newToDoListTitle, copyOfItems);

        return outerMap;
    }
    
    */

    @FXML
    private Label welcomeText;

    // here is the beginning of the interactions/messages that pop up when a user interacts with a button
    // since there is no real functionality with the to-list yet, these are placeholders for what the user will actually see once the program is ready

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Hello!");
    }

    public void onBackToHomeClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Welcome back home!");
    }

    public void onEditListClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Edit list!");
    }

    @FXML
    protected void onMakeListClick (ActionEvent event) throws IOException
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

    public void onSubmitListClick(ActionEvent actionEvent)
    {
        welcomeText.setText("Submit to-do list!");
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
}