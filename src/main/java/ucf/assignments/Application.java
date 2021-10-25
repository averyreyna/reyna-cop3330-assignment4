/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Avery Reyna
 */

package ucf.assignments;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Application extends javafx.application.Application
{
    public static void main(String[] args)
    {
        launch();
    }

    /*

    public static class ItemDetails
    {
        // initialize "dueDate" as a String
        // initialize "itemDescription" as a String
        // initialize "completionFlag" as an Integer
        private String dueDate;
        private String itemDescription;
        private Integer completionFlag;

        // there needs to be classes the can get or set values and Strings for each of the private data types
        // for example, if the user wants to set a new due date, you can use the this. method to set it to a new variable

        // create a new String class "getDueDate" that takes in no parameters
        // inside, return dueDate so the user can know what the due date is of an item
        public String getDueDate()
        {
            return dueDate;
        }

        // create a new void class "setDueDate" that takes in a String as its parameter
        // inside, use the this. method to set a new due date which is stored in "newDueDate"
        public void setDueDate(String newDueDate)
        {
            this.dueDate = newDueDate;
        }

        // create a new String class "getItemDescription" that takes in no parameters
        // inside, return itemDescription so the user can know what the description is of an item
        public String getItemDescription()
        {
            return itemDescription;
        }

        // create a new void class "setItemDescription" that takes in a String as its parameter
        // inside, use the this. method to set a new description which is stored in "newItemDescription"
        public void setItemDescription(String newItemDescription)
        {
            this.itemDescription = newItemDescription;
        }

        // create a new Integer class "getCompletionFlag" that takes in no parameters
        // inside, return completionFlag so the user can know whether a task was marked as complete
        public Integer getCompletionFlag()
        {
            return completionFlag;
        }

        // create a new void class "setCompletionFlag" that takes in an Integer as its parameter
        // inside, use the this. method to change completionFlag which is stored in "changedCompletionFlag"
        public void setCompletionFlag(Integer changedCompletionFlag)
        {
            this.completionFlag = changedCompletionFlag;
        }
    }

    */

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WelcomeScreen.fxml")));

        Scene scene = new Scene(root);

        stage.setTitle("To-Do App");
        stage.setScene(scene);
        stage.show();
    }
}