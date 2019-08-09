package javax.swing

import java.awt.Component
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.lang.Object

// This class encapsulates all relevant details of a clipboard
// or drag and drop transfer, and also allows for customizing
// aspects of the drag and drop experience.
// 
// The main purpose of this class is to provide the information
// needed by a developer to determine the suitability of a
// transfer or to import the data contained within. But it also
// doubles as a controller for customizing properties during drag
// and drop, such as whether or not to show the drop location,
// and which drop action to use.
// 
// Developers typically need not create instances of this
// class. Instead, they are something provided by the DnD
// implementation to certain methods in TransferHandler.
object final TransferHandler.TransferSupport extends Object {

    @stub
    // Returns the target component of this transfer.
    def getComponent(): Component = ???

    @stub
    // Returns the data flavors for this transfer.
    def getDataFlavors(): Array[DataFlavor] = ???

    @stub
    // Returns the action chosen for the drop, when this
    // TransferSupport represents a drop.
    def getDropAction(): Int = ???

    @stub
    // Returns the current (non-null) drop location for the component,
    // when this TransferSupport represents a drop.
    def getDropLocation(): TransferHandler.DropLocation = ???

    @stub
    // Returns the drag source's supported drop actions, when this
    // TransferSupport represents a drop.
    def getSourceDropActions(): Int = ???

    @stub
    // Returns the Transferable associated with this transfer.
    def getTransferable(): Transferable = ???

    @stub
    // Returns the user drop action for the drop, when this
    // TransferSupport represents a drop.
    def getUserDropAction(): Int = ???

    @stub
    // Returns whether or not the given data flavor is supported.
    def isDataFlavorSupported(df: DataFlavor): Boolean = ???

    @stub
    // Returns whether or not this TransferSupport
    // represents a drop operation.
    def isDrop(): Boolean = ???

    @stub
    // Sets the drop action for the transfer - which must represent a drop
    // - to the given action,
    // instead of the default user drop action.
    def setDropAction(dropAction: Int): Unit = ???
}
