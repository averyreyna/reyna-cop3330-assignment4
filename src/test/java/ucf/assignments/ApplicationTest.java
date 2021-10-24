package ucf.assignments;
import static org.junit.jupiter.api.Assertions.*;
import ucf.assignments.ApplicationController.*; // import ApplicationController, so we can check the outputs from the HashMap

class ApplicationTest
{
    // create main function to test features
        // initialize "testOuterHashMap" as a HashMap
        // initialize "testInnerHashMap" as a HashMap
        // initialize "testToDoListTitle" as a String
        // initialize "testItemTitle" as a String
        // initialize "testItemDate" as a String
        // initialize "testItemDescription" as a String
        // initialize "testItemFlag" as an Integer

        // initialize "userTestResponse" as a String equal to "n"
        // create a "userResponse" as a Scanner
        // print to the screen "Would you like to continue testing features? (y or n)"
        // initialize userResponseInput as a String that takes in the input of userResponse

        // create a while loop that runs until the user inputs "n" when they want to stop testing required behaviors
            // create a "whichTest" as a Scanner
            // print to the screen "Which feature would you like to test? (6 - 20)"
            // initialize testNumberInput as an integer that takes in the input of whichTest
            // create switch case that depends on testNumberInput
                // case 6: addToDoListTest
                    // stop case
                // case 7: removeExistingToDoListTest
                    // stop case
                // case 8: editToDoListTest
                    // stop case
                // case 9: addNewItemTest
                    // stop case

    // create an addToDoListTest function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call addToDoList with testToDoListTitle and testOuterHashMap in its parameters, storing the output in the testOuterHashMap
        // use a single for loop that iterates through the length of the testOuterHashMap
            // assertTrue if current index of testOuterHashMap collection is null
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end addToDoListTest

    // create a removeExistingToDoListTest function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call addToDoList with testToDoListTitle and testOuterHashMap in its parameters, storing the output in the testOuterHashMap
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end removeExistingToDoListTest

    // create an editToDoListTest function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call addToDoList with testToDoListTitle and testOuterHashMap in its parameters, storing the output in the testOuterHashMap
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end editToDoListTest

    //  create a addNewItemTest function that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call addNewItemTest with testToDoList,
}