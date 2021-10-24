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

    /*public static class ItemDetails
    {
        // initialize variable
        private String dueDate;
        private String itemDescription;
        private Integer completionFlag;

        public String getDueDate()
        {
            return dueDate;
        }

        public void setDueDate(String newDueDate)
        {
            this.dueDate = newDueDate;
        }

        public String getItemDescription()
        {
            return itemDescription;
        }

        public void setItemDescription(String newItemDescription)
        {
            this.itemDescription = newItemDescription;
        }

        public Integer getCompletionFlag()
        {
            return completionFlag;
        }

        public void setCompletionFlag(Integer changedCompletionFlag)
        {
            this.completionFlag = changedCompletionFlag;
        }
    }*/

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));

        Scene scene = new Scene(root);

        stage.setTitle("To-Do App");
        stage.setScene(scene);
        stage.show();
    }
}