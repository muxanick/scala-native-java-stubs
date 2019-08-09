package javax.swing

import java.awt.Component
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.lang.Object

/** This class encapsulates all relevant details of a clipboard
 *  or drag and drop transfer, and also allows for customizing
 *  aspects of the drag and drop experience.
 *  
 *  The main purpose of this class is to provide the information
 *  needed by a developer to determine the suitability of a
 *  transfer or to import the data contained within. But it also
 *  doubles as a controller for customizing properties during drag
 *  and drop, such as whether or not to show the drop location,
 *  and which drop action to use.
 *  
 *  Developers typically need not create instances of this
 *  class. Instead, they are something provided by the DnD
 *  implementation to certain methods in TransferHandler.
 */
final object TransferHandler.TransferSupport extends Object {

    /** Returns the target component of this transfer. */
    @stub
    def getComponent(): Component = ???

    /** Returns the data flavors for this transfer. */
    @stub
    def getDataFlavors(): Array[DataFlavor] = ???

    /** Returns the action chosen for the drop, when this
     *  TransferSupport represents a drop.
     */
    @stub
    def getDropAction(): Int = ???

    /** Returns the current (non-null) drop location for the component,
     *  when this TransferSupport represents a drop.
     */
    @stub
    def getDropLocation(): TransferHandler.DropLocation = ???

    /** Returns the drag source's supported drop actions, when this
     *  TransferSupport represents a drop.
     */
    @stub
    def getSourceDropActions(): Int = ???

    /** Returns the Transferable associated with this transfer. */
    @stub
    def getTransferable(): Transferable = ???

    /** Returns the user drop action for the drop, when this
     *  TransferSupport represents a drop.
     */
    @stub
    def getUserDropAction(): Int = ???

    /** Returns whether or not the given data flavor is supported. */
    @stub
    def isDataFlavorSupported(df: DataFlavor): Boolean = ???

    /** Returns whether or not this TransferSupport
     *  represents a drop operation.
     */
    @stub
    def isDrop(): Boolean = ???

    /** Sets the drop action for the transfer - which must represent a drop
     *  - to the given action,
     *  instead of the default user drop action.
     */
    @stub
    def setDropAction(dropAction: Int): Unit = ???
}
