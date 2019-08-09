package java.awt.dnd

import java.awt.Component
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.io.Serializable
import java.lang.Object
import java.util.List

// A DropTargetContext is created
// whenever the logical cursor associated
// with a Drag and Drop operation coincides with the visible geometry of
// a Component associated with a DropTarget.
// The DropTargetContext provides
// the mechanism for a potential receiver
// of a drop operation to both provide the end user with the appropriate
// drag under feedback, but also to effect the subsequent data transfer
// if appropriate.
class DropTargetContext extends Object with Serializable {

    @stub
    // accept the Drag.
    protected def acceptDrag(dragOperation: Int): Unit = ???

    @stub
    // called to signal that the drop is acceptable
    // using the specified operation.
    protected def acceptDrop(dropOperation: Int): Unit = ???

    @stub
    // Called when associated with the DropTargetContextPeer.
    def addNotify(dtcp: java.awt.dnd.peer.DropTargetContextPeer): Unit = ???

    @stub
    // Creates a TransferableProxy to proxy for the specified
    // Transferable.
    protected def createTransferableProxy(t: Transferable, local: Boolean): Transferable = ???

    @stub
    // This method signals that the drop is completed and
    // if it was successful or not.
    def dropComplete(success: Boolean): Unit = ???

    @stub
    // This method returns the Component associated with
    // this DropTargetContext.
    def getComponent(): Component = ???

    @stub
    // get the available DataFlavors of the
    // Transferable operand of this operation.
    protected def getCurrentDataFlavors(): Array[DataFlavor] = ???

    @stub
    // This method returns a the currently available DataFlavors
    // of the Transferable operand
    // as a java.util.List.
    protected def getCurrentDataFlavorsAsList(): List[DataFlavor] = ???

    @stub
    // This method returns the DropTarget associated with this
    // DropTargetContext.
    def getDropTarget(): DropTarget = ???

    @stub
    // This method returns an int representing the
    // current actions this DropTarget will accept.
    protected def getTargetActions(): Int = ???

    @stub
    // get the Transferable (proxy) operand of this operation
    protected def getTransferable(): Transferable = ???

    @stub
    // This method returns a boolean
    // indicating if the given DataFlavor is
    // supported by this DropTargetContext.
    protected def isDataFlavorSupported(df: DataFlavor): Boolean = ???

    @stub
    // reject the Drag.
    protected def rejectDrag(): Unit = ???

    @stub
    // called to signal that the drop is unacceptable.
    protected def rejectDrop(): Unit = ???

    @stub
    // Called when disassociated with the DropTargetContextPeer.
    def removeNotify(): Unit = ???
}
