package javax.accessibility

// This AccessibleSelection interface
// provides the standard mechanism for an assistive technology to determine
// what the current selected children are, as well as modify the selection set.
// Any object that has children that can be selected should support
// the AccessibleSelection interface.  Applications can determine if an object supports the
// AccessibleSelection interface by first obtaining its AccessibleContext (see
// Accessible) and then calling the
// AccessibleContext.getAccessibleSelection() method.
// If the return value is not null, the object supports this interface.
trait AccessibleSelection {

    @stub
    // Adds the specified Accessible child of the object to the object's
    // selection.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that no children in the
    // object are selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Returns an Accessible representing the specified selected child
    // of the object.
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns the number of Accessible children currently selected.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Determines if the current child of this object is selected.
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Removes the specified child of the object from the object's
    // selection.
    def removeAccessibleSelection(i: Int): Unit = ???
}
