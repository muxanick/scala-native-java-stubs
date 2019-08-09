package java.awt.datatransfer

import java.lang.{Object, String}

// A class that implements a mechanism to transfer data using
// cut/copy/paste operations.
// 
// FlavorListeners may be registered on an instance of the
// Clipboard class to be notified about changes to the set of
// DataFlavors available on this clipboard (see
// addFlavorListener(java.awt.datatransfer.FlavorListener)).
class Clipboard extends Object {

    @stub
    // 
    protected def contents: Transferable = ???

    @stub
    // Registers the specified FlavorListener to receive
    // FlavorEvents from this clipboard.
    def addFlavorListener(listener: FlavorListener): Unit = ???

    @stub
    // Returns an array of DataFlavors in which the current
    // contents of this clipboard can be provided.
    def getAvailableDataFlavors(): Array[DataFlavor] = ???

    @stub
    // Returns a transferable object representing the current contents
    // of the clipboard.
    def getContents(requestor: Object): Transferable = ???

    @stub
    // Returns an object representing the current contents of this clipboard
    // in the specified DataFlavor.
    def getData(flavor: DataFlavor): Object = ???

    @stub
    // Returns an array of all the FlavorListeners currently
    // registered on this Clipboard.
    def getFlavorListeners(): Array[FlavorListener] = ???

    @stub
    // Returns the name of this clipboard object.
    def getName(): String = ???

    @stub
    // Returns whether or not the current contents of this clipboard can be
    // provided in the specified DataFlavor.
    def isDataFlavorAvailable(flavor: DataFlavor): Boolean = ???

    @stub
    // Removes the specified FlavorListener so that it no longer
    // receives FlavorEvents from this Clipboard.
    def removeFlavorListener(listener: FlavorListener): Unit = ???
}
