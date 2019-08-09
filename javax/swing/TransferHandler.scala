package javax.swing

import java.awt.{Image, Point}
import java.awt.datatransfer.{Clipboard, DataFlavor, Transferable}
import java.awt.event.InputEvent
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class is used to handle the transfer of a Transferable
 *  to and from Swing components.  The Transferable is used to
 *  represent data that is exchanged via a cut, copy, or paste
 *  to/from a clipboard.  It is also used in drag-and-drop operations
 *  to represent a drag from a component, and a drop to a component.
 *  Swing provides functionality that automatically supports cut, copy,
 *  and paste keyboard bindings that use the functionality provided by
 *  an implementation of this class.  Swing also provides functionality
 *  that automatically supports drag and drop that uses the functionality
 *  provided by an implementation of this class.  The Swing developer can
 *  concentrate on specifying the semantics of a transfer primarily by setting
 *  the transferHandler property on a Swing component.
 *  
 *  This class is implemented to provide a default behavior of transferring
 *  a component property simply by specifying the name of the property in
 *  the constructor.  For example, to transfer the foreground color from
 *  one component to another either via the clipboard or a drag and drop operation
 *  a TransferHandler can be constructed with the string "foreground".  The
 *  built in support will use the color returned by getForeground as the source
 *  of the transfer, and setForeground for the target of a transfer.
 *  
 *  Please see
 *  
 *  How to Use Drag and Drop and Data Transfer,
 *  a section in The Java Tutorial, for more information.
 */
class TransferHandler extends Object with Serializable {

    /** Convenience constructor for subclasses. */
    @stub
    protected def this() = ???

    /** Constructs a transfer handler that can transfer a Java Bean property
     *  from one component to another via the clipboard or a drag and drop
     *  operation.
     */
    @stub
    def this(property: String) = ???

    /** Indicates whether a component will accept an import of the given
     *  set of data flavors prior to actually attempting to import it.
     */
    @stub
    def canImport(comp: JComponent, transferFlavors: Array[DataFlavor]): Boolean = ???

    /** This method is called repeatedly during a drag and drop operation
     *  to allow the developer to configure properties of, and to return
     *  the acceptability of transfers; with a return value of true
     *  indicating that the transfer represented by the given
     *  TransferSupport (which contains all of the details of the
     *  transfer) is acceptable at the current time, and a value of false
     *  rejecting the transfer.
     */
    @stub
    def canImport(support: TransferHandler.TransferSupport): Boolean = ???

    /** Creates a Transferable to use as the source for
     *  a data transfer.
     */
    @stub
    protected def createTransferable(c: JComponent): Transferable = ???

    /** Causes the Swing drag support to be initiated. */
    @stub
    def exportAsDrag(comp: JComponent, e: InputEvent, action: Int): Unit = ???

    /** Invoked after data has been exported. */
    @stub
    protected def exportDone(source: JComponent, data: Transferable, action: Int): Unit = ???

    /** Causes a transfer from the given component to the
     *  given clipboard.
     */
    @stub
    def exportToClipboard(comp: JComponent, clip: Clipboard, action: Int): Unit = ???

    /** Returns the drag image. */
    @stub
    def getDragImage(): Image = ???

    /** Returns an anchor offset for the image to drag. */
    @stub
    def getDragImageOffset(): Point = ???

    /** Returns the type of transfer actions supported by the source;
     *  any bitwise-OR combination of COPY, MOVE
     *  and LINK.
     */
    @stub
    def getSourceActions(c: JComponent): Int = ???

    /** Returns an object that establishes the look of a transfer. */
    @stub
    def getVisualRepresentation(t: Transferable): Icon = ???

    /** Causes a transfer to a component from a clipboard or a
     *  DND drop operation.
     */
    @stub
    def importData(comp: JComponent, t: Transferable): Boolean = ???

    /** Causes a transfer to occur from a clipboard or a drag and
     *  drop operation.
     */
    @stub
    def importData(support: TransferHandler.TransferSupport): Boolean = ???

    /** Sets the drag image parameter. */
    @stub
    def setDragImage(img: Image): Unit = ???

    /** Sets an anchor offset for the image to drag. */
    @stub
    def setDragImageOffset(p: Point): Unit = ???
}

object TransferHandler {
    /** Represents a location where dropped data should be inserted. */
    @stub
    object DropLocation extends TransferHandler.DropLocation

    /** This class encapsulates all relevant details of a clipboard
     *  or drag and drop transfer, and also allows for customizing
     *  aspects of the drag and drop experience.
     */
    @stub
    object TransferSupport extends TransferHandler.TransferSupport

    /** An int representing a "copy" transfer action. */
    @stub
    val COPY: Int = ???

    /** An int representing a source action capability of either
     *  "copy" or "move".
     */
    @stub
    val COPY_OR_MOVE: Int = ???

    /** An int representing a "link" transfer action. */
    @stub
    val LINK: Int = ???

    /** An int representing a "move" transfer action. */
    @stub
    val MOVE: Int = ???

    /** An int representing no transfer action. */
    @stub
    val NONE: Int = ???

    /** Returns an Action that performs copy operations to the
     *  clipboard.
     */
    @stub
    def getCopyAction(): Action = ???

    /** Returns an Action that performs cut operations to the
     *  clipboard.
     */
    @stub
    def getCutAction(): Action = ???

    /** Returns an Action that performs paste operations from the
     *  clipboard.
     */
    @stub
    def getPasteAction(): Action = ???
}
