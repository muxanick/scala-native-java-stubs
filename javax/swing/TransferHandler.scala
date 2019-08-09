package javax.swing

import java.awt.{Image, Point}
import java.awt.datatransfer.{Clipboard, DataFlavor, Transferable}
import java.awt.event.InputEvent
import java.io.Serializable
import java.lang.Object

// This class is used to handle the transfer of a Transferable
// to and from Swing components.  The Transferable is used to
// represent data that is exchanged via a cut, copy, or paste
// to/from a clipboard.  It is also used in drag-and-drop operations
// to represent a drag from a component, and a drop to a component.
// Swing provides functionality that automatically supports cut, copy,
// and paste keyboard bindings that use the functionality provided by
// an implementation of this class.  Swing also provides functionality
// that automatically supports drag and drop that uses the functionality
// provided by an implementation of this class.  The Swing developer can
// concentrate on specifying the semantics of a transfer primarily by setting
// the transferHandler property on a Swing component.
// 
// This class is implemented to provide a default behavior of transferring
// a component property simply by specifying the name of the property in
// the constructor.  For example, to transfer the foreground color from
// one component to another either via the clipboard or a drag and drop operation
// a TransferHandler can be constructed with the string "foreground".  The
// built in support will use the color returned by getForeground as the source
// of the transfer, and setForeground for the target of a transfer.
// 
// Please see
// 
// How to Use Drag and Drop and Data Transfer,
// a section in The Java Tutorial, for more information.
class TransferHandler extends Object with Serializable {

    @stub
    // Convenience constructor for subclasses.
    protected def this() = ???

    @stub
    // Indicates whether a component will accept an import of the given
    // set of data flavors prior to actually attempting to import it.
    def canImport(comp: JComponent, transferFlavors: Array[DataFlavor]): Boolean = ???

    @stub
    // This method is called repeatedly during a drag and drop operation
    // to allow the developer to configure properties of, and to return
    // the acceptability of transfers; with a return value of true
    // indicating that the transfer represented by the given
    // TransferSupport (which contains all of the details of the
    // transfer) is acceptable at the current time, and a value of false
    // rejecting the transfer.
    def canImport(support: TransferHandler.TransferSupport): Boolean = ???

    @stub
    // Creates a Transferable to use as the source for
    // a data transfer.
    protected def createTransferable(c: JComponent): Transferable = ???

    @stub
    // Causes the Swing drag support to be initiated.
    def exportAsDrag(comp: JComponent, e: InputEvent, action: Int): Unit = ???

    @stub
    // Invoked after data has been exported.
    protected def exportDone(source: JComponent, data: Transferable, action: Int): Unit = ???

    @stub
    // Causes a transfer from the given component to the
    // given clipboard.
    def exportToClipboard(comp: JComponent, clip: Clipboard, action: Int): Unit = ???

    @stub
    // Returns the drag image.
    def getDragImage(): Image = ???

    @stub
    // Returns an anchor offset for the image to drag.
    def getDragImageOffset(): Point = ???

    @stub
    // Returns the type of transfer actions supported by the source;
    // any bitwise-OR combination of COPY, MOVE
    // and LINK.
    def getSourceActions(c: JComponent): Int = ???

    @stub
    // Returns an object that establishes the look of a transfer.
    def getVisualRepresentation(t: Transferable): Icon = ???

    @stub
    // Causes a transfer to a component from a clipboard or a
    // DND drop operation.
    def importData(comp: JComponent, t: Transferable): Boolean = ???

    @stub
    // Causes a transfer to occur from a clipboard or a drag and
    // drop operation.
    def importData(support: TransferHandler.TransferSupport): Boolean = ???

    @stub
    // Sets the drag image parameter.
    def setDragImage(img: Image): Unit = ???
}

object TransferHandler {
    @stub
    // Represents a location where dropped data should be inserted.
    def TransferHandler.DropLocation: class = ???

    @stub
    // An int representing a "copy" transfer action.
    def COPY: Int = ???

    @stub
    // An int representing a source action capability of either
    // "copy" or "move".
    def COPY_OR_MOVE: Int = ???

    @stub
    // An int representing a "link" transfer action.
    def LINK: Int = ???

    @stub
    // An int representing a "move" transfer action.
    def MOVE: Int = ???

    @stub
    // Returns an Action that performs copy operations to the
    // clipboard.
    def getCopyAction(): Action = ???

    @stub
    // Returns an Action that performs cut operations to the
    // clipboard.
    def getCutAction(): Action = ???

    @stub
    // Returns an Action that performs paste operations from the
    // clipboard.
    def getPasteAction(): Action = ???
}
