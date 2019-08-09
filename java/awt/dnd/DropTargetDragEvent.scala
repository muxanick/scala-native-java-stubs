package java.awt.dnd

import java.awt.Point
import java.awt.datatransfer.{DataFlavor, Transferable}
import java.lang.Object
import java.util.{EventObject, List}

// The DropTargetDragEvent is delivered to a
// DropTargetListener via its
// dragEnter() and dragOver() methods.
// 
// The DropTargetDragEvent reports the source drop actions
// and the user drop action that reflect the current state of
// the drag operation.
// 
// Source drop actions is a bitwise mask of DnDConstants
// that represents the set of drop actions supported by the drag source for
// this drag operation.
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
class DropTargetDragEvent extends DropTargetEvent {

    @stub
    // Accepts the drag.
    def acceptDrag(dragOperation: Int): Unit = ???

    @stub
    // This method returns the current DataFlavors from the
    // DropTargetContext.
    def getCurrentDataFlavors(): Array[DataFlavor] = ???

    @stub
    // This method returns the current DataFlavors
    // as a java.util.List
    def getCurrentDataFlavorsAsList(): List[DataFlavor] = ???

    @stub
    // This method returns the user drop action.
    def getDropAction(): Int = ???

    @stub
    // This method returns a Point
    // indicating the Cursor's current
    // location within the Component's
    // coordinates.
    def getLocation(): Point = ???

    @stub
    // This method returns the source drop actions.
    def getSourceActions(): Int = ???

    @stub
    // This method returns the Transferable object that represents
    // the data associated with the current drag operation.
    def getTransferable(): Transferable = ???

    @stub
    // This method returns a boolean indicating
    // if the specified DataFlavor is supported.
    def isDataFlavorSupported(df: DataFlavor): Boolean = ???
}
