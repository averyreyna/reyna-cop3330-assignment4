package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.HashMap;
import ucf.assignments.Application.*;

public class ApplicationController
{
    /*HashMap<String, HashMap<String, Application.ItemDetails>> outerMap = new HashMap<>();
    HashMap<String, Application.ItemDetails> innerMap = new HashMap<>();

    public static HashMap<String, HashMap<String, Application.ItemDetails>> addToDoList(HashMap<String, HashMap<String, ItemDetails>> outerMap, HashMap<String, ItemDetails> innerMap)
    {
        String toDoListTitle = "";

        outerMap.put(toDoListTitle, innerMap);
        return outerMap;
    }

    public static HashMap<String, Application.ItemDetails> addItem(HashMap<String, Application.ItemDetails> innerMap)
    {
        String itemTitle = "";

        Application.ItemDetails itemDetails = new Application.ItemDetails();

        String dueDate = "";
        itemDetails.setDueDate(dueDate);

        String itemDescription = "";
        itemDetails.setItemDescription(itemDescription);

        int completionFlag = 0;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, HashMap<String, Application.ItemDetails>> removeToDoList(HashMap<String, HashMap<String, Application.ItemDetails>> outerMap, HashMap<String, Application.ItemDetails> innerMap)
    {
        String toDoListTitle = "";

        outerMap.remove(toDoListTitle, innerMap);
        return outerMap;
    }

    public static HashMap<String, Application.ItemDetails> removeItem(HashMap<String, Application.ItemDetails> innerMap)
    {
        String itemTitle = "";

        Application.ItemDetails itemDetails = new Application.ItemDetails();

        innerMap.remove(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, HashMap<String, Application.ItemDetails>> editToDoListTitle(HashMap<String, HashMap<String, Application.ItemDetails>> outerMap, HashMap<String, Application.ItemDetails> innerMap)
    {
        String toDoListTitle = "";

        return outerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemDueDate(HashMap<String, Application.ItemDetails> innerMap)
    {
        String itemTitle = "";

        Application.ItemDetails itemDetails = new Application.ItemDetails();

        String dueDate = "";
        itemDetails.setDueDate(dueDate);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemDescription(HashMap<String, Application.ItemDetails> innerMap)
    {
        String itemTitle = "";

        Application.ItemDetails itemDetails = new Application.ItemDetails();

        String itemDescription = "";
        itemDetails.setItemDescription(itemDescription);

        int completionFlag = 0;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }

    public static HashMap<String, Application.ItemDetails> editItemCompletionStatus(HashMap<String, Application.ItemDetails> innerMap)
    {
        String itemTitle = "";

        Application.ItemDetails itemDetails = new Application.ItemDetails();

        int completionFlag = 1;
        itemDetails.setCompletionFlag(completionFlag);

        innerMap.put(itemTitle, itemDetails);
        return innerMap;
    }*/

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}