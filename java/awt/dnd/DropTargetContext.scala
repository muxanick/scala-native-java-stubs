package java.awt.dnd

import java.awt.Component
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.io.Serializable
import java.lang.Object
import java.util.List
import scala.scalanative.annotation.stub

/** A DropTargetContext is created
 *  whenever the logical cursor associated
 *  with a Drag and Drop operation coincides with the visible geometry of
 *  a Component associated with a DropTarget.
 *  The DropTargetContext provides
 *  the mechanism for a potential receiver
 *  of a drop operation to both provide the end user with the appropriate
 *  drag under feedback, but also to effect the subsequent data transfer
 *  if appropriate.
 */
class DropTargetContext extends Object with Serializable {

    /** TransferableProxy is a helper inner class that implements
     *  Transferable interface and serves as a proxy for another
     *  Transferable object which represents data transfer for
     *  a particular drag-n-drop operation.
     *  
     *  The proxy forwards all requests to the encapsulated transferable
     *  and automatically performs additional conversion on the data
     *  returned by the encapsulated transferable in case of local transfer.
     */
    protected class TransferableProxy extends Object with Transferable {

        /** A boolean indicating if the encapsulated
         *  Transferable object represents the result
         *  of local drag-n-drop operation (within the same JVM).
         */
        @stub
        protected val isLocal: Boolean = ???

        /** The encapsulated Transferable object. */
        @stub
        protected val transferable: Transferable = ???

        /** Returns an object which represents the data provided by
         *  the encapsulated transferable for the requested data flavor.
         */
        @stub
        def getTransferData(df: DataFlavor): Any = ???

        /** Returns an array of DataFlavor objects indicating the flavors
         *  the data can be provided in by the encapsulated transferable.
         */
        @stub
        def getTransferDataFlavors(): Array[DataFlavor] = ???

        /** Returns whether or not the specified data flavor is supported by
         *  the encapsulated transferable.
         */
        @stub
        def isDataFlavorSupported(flavor: DataFlavor): Boolean = ???
    }


    /** accept the Drag. */
    @stub
    protected def acceptDrag(dragOperation: Int): Unit = ???

    /** called to signal that the drop is acceptable
     *  using the specified operation.
     */
    @stub
    protected def acceptDrop(dropOperation: Int): Unit = ???

    /** Called when associated with the DropTargetContextPeer. */
    @stub
    def addNotify(dtcp: java.awt.dnd.peer.DropTargetContextPeer): Unit = ???

    /** Creates a TransferableProxy to proxy for the specified
     *  Transferable.
     */
    @stub
    protected def createTransferableProxy(t: Transferable, local: Boolean): Transferable = ???

    /** This method signals that the drop is completed and
     *  if it was successful or not.
     */
    @stub
    def dropComplete(success: Boolean): Unit = ???

    /** This method returns the Component associated with
     *  this DropTargetContext.
     */
    @stub
    def getComponent(): Component = ???

    /** get the available DataFlavors of the
     *  Transferable operand of this operation.
     */
    @stub
    protected def getCurrentDataFlavors(): Array[DataFlavor] = ???

    /** This method returns a the currently available DataFlavors
     *  of the Transferable operand
     *  as a java.util.List.
     */
    @stub
    protected def getCurrentDataFlavorsAsList(): List[DataFlavor] = ???

    /** This method returns the DropTarget associated with this
     *  DropTargetContext.
     */
    @stub
    def getDropTarget(): DropTarget = ???

    /** This method returns an int representing the
     *  current actions this DropTarget will accept.
     */
    @stub
    protected def getTargetActions(): Int = ???

    /** get the Transferable (proxy) operand of this operation */
    @stub
    protected def getTransferable(): Transferable = ???

    /** This method returns a boolean
     *  indicating if the given DataFlavor is
     *  supported by this DropTargetContext.
     */
    @stub
    protected def isDataFlavorSupported(df: DataFlavor): Boolean = ???

    /** reject the Drag. */
    @stub
    protected def rejectDrag(): Unit = ???

    /** called to signal that the drop is unacceptable. */
    @stub
    protected def rejectDrop(): Unit = ???

    /** Called when disassociated with the DropTargetContextPeer. */
    @stub
    def removeNotify(): Unit = ???

    /** This method sets the current actions acceptable to
     *  this DropTarget.
     */
    @stub
    protected def setTargetActions(actions: Int): Unit = ???
}
