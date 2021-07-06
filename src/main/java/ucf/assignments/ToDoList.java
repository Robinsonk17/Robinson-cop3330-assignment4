/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Keondez Robinson
 */

package ucf.assignments;

public class ToDoList {
    // private String field name
    // private List of items

    // Constructor(name)
    // -- constructor only takes in the name of list because initially, to-do
    //    list is empty
    // -- initialize new ArrayList<>()

    // Methods
    // -- setter method for the name of list (setName())

    // -- getter method for name (getName())

    // -- setter method for the item (setItem(item, index))
    //   * the setter method takes in the index since the individual item will need to be
    //     updated in the correct position

    // -- getter method for the item (getItem(index))
    //   * the getter method takes in the index since the individual item will need to be
    //     returned at that position

    // Utility Methods
    // addItem(item)
    // -- serves as a wrapper for the arrayList.add() method, calls .add() to add the item
    //    to the list

    // removeItem(item)
    // -- serves as a wrapper for the arrayList.remove() method, calls .remove() to remove item
    //    from the list

    // displayList(filter)
    // -- the attribute passed in is an enum indicating which items of the list to show
    // -- they are as follows:
    //   * ALL - display all items
    //   * COMPLETE - display only completed items
    //   * INCOMPLETE - display only incomplete items
    // -- based on the status, the method will loop through all items and only output the items of the list
    //    that have the status flag either turned on, off, or ignored
}
