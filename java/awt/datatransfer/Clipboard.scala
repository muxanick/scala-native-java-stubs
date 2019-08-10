package java.awt.datatransfer

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A class that implements a mechanism to transfer data using
 *  cut/copy/paste operations.
 *  
 *  FlavorListeners may be registered on an instance of the
 *  Clipboard class to be notified about changes to the set of
 *  DataFlavors available on this clipboard (see
 *  addFlavorListener(java.awt.datatransfer.FlavorListener)).
 */
class Clipboard extends Object {

    /** Creates a clipboard object. */
    @stub
    def this(name: String) = ???

    /**  */
    @stub
    protected val contents: Transferable = ???

    /**  */
    @stub
    protected val owner: ClipboardOwner = ???

    /** Registers the specified FlavorListener to receive
     *  FlavorEvents from this clipboard.
     */
    @stub
    def addFlavorListener(listener: FlavorListener): Unit = ???

    /** Returns an array of DataFlavors in which the current
     *  contents of this clipboard can be provided.
     */
    @stub
    def getAvailableDataFlavors(): Array[DataFlavor] = ???

    /** Returns a transferable object representing the current contents
     *  of the clipboard.
     */
    @stub
    def getContents(requestor: Any): Transferable = ???

    /** Returns an object representing the current contents of this clipboard
     *  in the specified DataFlavor.
     */
    @stub
    def getData(flavor: DataFlavor): Any = ???

    /** Returns an array of all the FlavorListeners currently
     *  registered on this Clipboard.
     */
    @stub
    def getFlavorListeners(): Array[FlavorListener] = ???

    /** Returns the name of this clipboard object. */
    @stub
    def getName(): String = ???

    /** Returns whether or not the current contents of this clipboard can be
     *  provided in the specified DataFlavor.
     */
    @stub
    def isDataFlavorAvailable(flavor: DataFlavor): Boolean = ???

    /** Removes the specified FlavorListener so that it no longer
     *  receives FlavorEvents from this Clipboard.
     */
    @stub
    def removeFlavorListener(listener: FlavorListener): Unit = ???

    /** Sets the current contents of the clipboard to the specified
     *  transferable object and registers the specified clipboard owner
     *  as the owner of the new contents.
     */
    @stub
    def setContents(contents: Transferable, owner: ClipboardOwner): Unit = ???
}
