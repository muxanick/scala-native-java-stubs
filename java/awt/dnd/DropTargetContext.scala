package java.awt.dnd

import java.awt.Component
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.io.Serializable
import java.lang.Object
import java.util.List

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
}
