package java.awt.dnd

import java.awt.Point
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.lang.Object
import java.util.{EventObject, List}

// The DropTargetDropEvent is delivered
// via the DropTargetListener drop() method.
// 
// The DropTargetDropEvent reports the source drop actions
// and the user drop action that reflect the current state of the
// drag-and-drop operation.
// 
// Source drop actions is a bitwise mask of DnDConstants
// that represents the set of drop actions supported by the drag source for
// this drag-and-drop operation.
// 
// User drop action depends on the drop actions supported by the drag
// source and the drop action selected by the user. The user can select a drop
// action by pressing modifier keys during the drag operation:
// 
//   Ctrl + Shift -> ACTION_LINK
//   Ctrl         -> ACTION_COPY
//   Shift        -> ACTION_MOVE
// 
// If the user selects a drop action, the user drop action is one of
// DnDConstants that represents the selected drop action if this
// drop action is supported by the drag source or
// DnDConstants.ACTION_NONE if this drop action is not supported
// by the drag source.
// 
// If the user doesn't select a drop action, the set of
// DnDConstants that represents the set of drop actions supported
// by the drag source is searched for DnDConstants.ACTION_MOVE,
// then for DnDConstants.ACTION_COPY, then for
// DnDConstants.ACTION_LINK and the user drop action is the
// first constant found. If no constant is found the user drop action
// is DnDConstants.ACTION_NONE.
class DropTargetDropEvent extends DropTargetEvent {

    @stub
    // Construct a DropTargetDropEvent given
    // the DropTargetContext for this operation,
    // the location of the drag Cursor's
    // hotspot in the Component's coordinates,
    // the currently
    // selected user drop action, and the current set of
    // actions supported by the source.
    def this(dtc: DropTargetContext, cursorLocn: Point, dropAction: Int, srcActions: Int) = ???

    @stub
    // accept the drop, using the specified action.
    def acceptDrop(dropAction: Int): Unit = ???

    @stub
    // This method notifies the DragSource
    // that the drop transfer(s) are completed.
    def dropComplete(success: Boolean): Unit = ???

    @stub
    // This method returns the current DataFlavors.
    def getCurrentDataFlavors(): Array[DataFlavor] = ???

    @stub
    // This method returns the currently available
    // DataFlavors as a java.util.List.
    def getCurrentDataFlavorsAsList(): List[DataFlavor] = ???

    @stub
    // This method returns the user drop action.
    def getDropAction(): Int = ???

    @stub
    // This method returns a Point
    // indicating the Cursor's current
    // location in the Component's coordinates.
    def getLocation(): Point = ???

    @stub
    // This method returns the source drop actions.
    def getSourceActions(): Int = ???

    @stub
    // This method returns the Transferable object
    // associated with the drop.
    def getTransferable(): Transferable = ???

    @stub
    // This method returns a boolean indicating if the
    // specified DataFlavor is available
    // from the source.
    def isDataFlavorSupported(df: DataFlavor): Boolean = ???

    @stub
    // This method returns an int indicating if
    // the source is in the same JVM as the target.
    def isLocalTransfer(): Boolean = ???
}