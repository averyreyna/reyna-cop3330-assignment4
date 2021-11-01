/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Avery Reyna
 */

package ucf.assignments;

import static org.junit.jupiter.api.Assertions.*;
import ucf.assignments.ApplicationController.*; // import ApplicationController, so we can check the outputs from the HashMap
import ucf.assignments.Application.*; // import Application, so we have access to ItemDetails

class ApplicationTest
{
    // create main function to test features
        // initialize "testOuterHashMap" as a HashMap
        // initialize "testInnerHashMap" as a HashMap
        // initialize "testToDoListTitle" as a String
        // initialize "testItemTitle" as a String
        // initialize "testItemDate" as a String
        // initialize "testItemDescription" as a String
        // initialize "testItemFlag" as an Integer equalling 1

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
                // case 10: removeItemTest
                    // stop case
                // case 11: editDescriptionTest
                    // stop case
                // case 12: editDueDateTest
                    // stop case
                // case 13: markCompleteTest
                    // stop case
                // case 14: displayExistingItemsTest
                    // stop case
                // case 15: displayIncompletedItemsTest
                    // stop case
                // case 16: displayCompletedItemsTest
                    // stop case
                // case 17: saveSingleToDoListItemsTest
                    // stop case
                // case 18: saveAllToDoListItemsTest
                    // stop case
                // case 19: loadSingleToDoListItemsTest
                    // stop case
                // case 20: loadAllToDoListItemsTest
                    // stop case

    // create an "addToDoListTest" function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call addToDoList with testToDoListTitle, testOuterHashMap, and testInnerHashMap in its parameters, returning the testOuterHashMap
        // use a single for loop that iterates through the length of the testOuterHashMap
            // assertTrue if current index of testOuterHashMap collection is null
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end addToDoListTest

    // create a "removeExistingToDoListTest" function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call removeToDoList with testToDoListTitle, testOuterHashMap, and testInnerHashMap in its parameters, returning the testOuterHashMap
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end removeExistingToDoListTest

    // create an "editToDoListTest" function that takes in testOuterHashMap, testInnerHashMap, and testToDoListTitle as its parameters
        // function call editToDoList with testToDoListTitle, testOuterHashMap, and testInnerHashMap in its parameters, returning the testOuterHashMap
        // assertTrue if testOuterHashMap<testToDoList, testInnerHashMap> is not null

        // end editToDoListTest

    // create an "addNewItemTest" function that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call addNewItem with testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription, returning the testInnerHashMap
        // use a single for loop that iterates through the length of the testInnerHashMap
            // assertTrue if current index of testInnerHashMap collection is null
        // assertTrue if testInnerHashMap<testToDoList, ItemDetails> is not null

        // end addNewItemTest

    // create a "removeItemTest" function that takes in testInnerHashMap and testItemTitle as its parameters
        // function call removeItem with testItemTitle and testInnerHashMap in its parameters, returning the testInnerHashMap
        // assertTrue if testInnerHashMap<testItemTitle, ItemDetails> is not null

        // end removeItemTest

    // create an "editDescriptionTest" function that takes in testInnerHashMap, testItemTitle, and testItemDescription as its parameters
        // function call editDescription with testItemTitle testInnerHashMap, testItemTitle, and testItemDescription as its parameters, returning the testInnerHashMap
        // assertTrue if testInnerHashMap<testItemTitle, ItemDetails.get(itemDescription)> equals testItemDescription

        // end editDescriptionTest

    // create an "editDueDateTest" function that takes in testInnerHashMap, testItemTitle, and testDueDate as its parameters
        // function call editDueDate with testItemTitle testInnerHashMap, testItemTitle, and testDueDate as its parameters, returning the testInnerHashMap
        // assertTrue if testInnerHashMap<testItemTitle, ItemDetails.get(dueDate)> equals testDueDate

        // end editDueDateTest

    // create a "markCompleteTest" that takes in the testInnerHashMap and testItemTitle as its parameters
        // function call editItemCompletionStatus with testInnerHashMap and testItemTitle as its parameters, returning testInnerHashMap
        // assertTrue if testInnerHashMap<testItemTitle, ItemDetails.get(completionFlag)> equals testItemFlag

        // end markCompleteTest

    // for now, the display tests will be a function call of some kind, but for part 2, i might take a different approach that tests the visuals on the fxml file instead of the existence of the HashMaps
    // create a "displayExistingItemsTest" that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call displayExistingItems that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // assertTrue if the innerHashMap and outerHashMap you are trying to display exist and have item components completed within them

        // end displayExistingItemsTest

    // create a "displayIncompletedItemsTest" that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call displayIncompletedItems that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // assertTrue if the incompleted items of a to-do list are displayed with each of the components of the list being present as well

        // end displayIncompletedItemsTest

    // create a "displayCompletedItemsTest" that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call displayCompletedItems that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // assertTrue if the completed items of a to-do list are displayed with each of the components of the list being present as well

        // end displayCompletedItemsTest

    // create a "saveSingleToDoListItemsTest" that takes in the testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call saveSingleToDoListItems that takes in the testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
            // use a single for loop that iterates through the length of the testInnerHashMap and puts the items into external storage
            // assertTrue if the external file contains all the items of a single to-do list

        // end saveSingleToDoListItemsTest

    // create a "saveAllToDoListItemsTest" function that takes in the testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call saveAllToDoListItems that takes in the  testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
            // use a nested for loop that iterates through length of both the testOuterHashMap and testInnerHashMap and puts the items into external storage
            // assertTrue if the external file contains all the items across all the to-do lists

        // end saveAllToDoListItemsTest

    // create a "loadSingleToDoListItemsTest" function that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call loadSingleToDoListItems that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
            // use a for loop that iterates through the external file to check if every item of the to-do list you want is present
            // assertTrue if the external file contains all the items of a single to-do list

        // end loadSingleToDoListItemsTest

    // create a "loadAllToDoListItemsTest" function that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
        // function call loadAllToDoListItems that takes in testOuterHashMap, testInnerHashMap, testToDoListTitle, testItemTitle, testItemDate, and testItemDescription as its parameters
            // use a for loop that iterates through the external file to check if every item of the to-do list you want is present
            // assertTrue if the external file contains all the items across all the to-do lists

        // end loadAllToDoListItemsTest
}