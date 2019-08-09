package java.awt.dnd

import java.awt.{Component, Cursor}
import java.awt.datatransfer.Transferable
import java.io.Serializable
import java.lang.Object

// The DragSourceContext class is responsible for managing the
// initiator side of the Drag and Drop protocol. In particular, it is responsible
// for managing drag event notifications to the
// DragSourceListeners
// and DragSourceMotionListeners, and providing the
// Transferable representing the source data for the drag operation.
// 
// Note that the DragSourceContext itself
// implements the DragSourceListener and
// DragSourceMotionListener interfaces.
// This is to allow the platform peer
// (the DragSourceContextPeer instance)
// created by the DragSource to notify
// the DragSourceContext of
// state changes in the ongoing operation. This allows the
// DragSourceContext object to interpose
// itself between the platform and the
// listeners provided by the initiator of the drag operation.
// 
// 
// By default, DragSourceContext sets the cursor as appropriate
// for the current state of the drag and drop operation. For example, if
// the user has chosen the move action,
// and the pointer is over a target that accepts
// the move action, the default move cursor is shown. When
// the pointer is over an area that does not accept the transfer,
// the default "no drop" cursor is shown.
// 
// This default handling mechanism is disabled when a custom cursor is set
// by the setCursor(java.awt.Cursor) method. When the default handling is disabled,
// it becomes the responsibility
// of the developer to keep the cursor up to date, by listening
// to the DragSource events and calling the setCursor() method.
// Alternatively, you can provide custom cursor behavior by providing
// custom implementations of the DragSource
// and the DragSourceContext classes.
class DragSourceContext extends Object with DragSourceListener, with DragSourceMotionListener, with Serializable {

    @stub
    // Add a DragSourceListener to this
    // DragSourceContext if one has not already been added.
    def addDragSourceListener(dsl: DragSourceListener): Unit = ???

    @stub
    // Calls dragDropEnd on the
    // DragSourceListeners registered with this
    // DragSourceContext and with the associated
    // DragSource, and passes them the specified
    // DragSourceDropEvent.
    def dragDropEnd(dsde: DragSourceDropEvent): Unit = ???

    @stub
    // Calls dragEnter on the
    // DragSourceListeners registered with this
    // DragSourceContext and with the associated
    // DragSource, and passes them the specified
    // DragSourceDragEvent.
    def dragEnter(dsde: DragSourceDragEvent): Unit = ???

    @stub
    // Calls dragExit on the
    // DragSourceListeners registered with this
    // DragSourceContext and with the associated
    // DragSource, and passes them the specified
    // DragSourceEvent.
    def dragExit(dse: DragSourceEvent): Unit = ???

    @stub
    // Calls dragMouseMoved on the
    // DragSourceMotionListeners registered with the
    // DragSource associated with this
    // DragSourceContext, and them passes the specified
    // DragSourceDragEvent.
    def dragMouseMoved(dsde: DragSourceDragEvent): Unit = ???

    @stub
    // Calls dragOver on the
    // DragSourceListeners registered with this
    // DragSourceContext and with the associated
    // DragSource, and passes them the specified
    // DragSourceDragEvent.
    def dragOver(dsde: DragSourceDragEvent): Unit = ???

    @stub
    // Calls dropActionChanged on the
    // DragSourceListeners registered with this
    // DragSourceContext and with the associated
    // DragSource, and passes them the specified
    // DragSourceDragEvent.
    def dropActionChanged(dsde: DragSourceDragEvent): Unit = ???

    @stub
    // Returns the Component associated with this
    // DragSourceContext.
    def getComponent(): Component = ???

    @stub
    // Returns the current drag Cursor.
    def getCursor(): Cursor = ???

    @stub
    // Returns the DragSource
    // that instantiated this DragSourceContext.
    def getDragSource(): DragSource = ???

    @stub
    // Returns a bitwise mask of DnDConstants that
    // represent the set of drop actions supported by the drag source for the
    // drag operation associated with this DragSourceContext.
    def getSourceActions(): Int = ???

    @stub
    // Returns the Transferable associated with
    // this DragSourceContext.
    def getTransferable(): Transferable = ???

    @stub
    // Returns the DragGestureEvent
    // that initially triggered the drag.
    def getTrigger(): DragGestureEvent = ???

    @stub
    // Removes the specified DragSourceListener
    // from  this DragSourceContext.
    def removeDragSourceListener(dsl: DragSourceListener): Unit = ???

    @stub
    // Sets the cursor for this drag operation to the specified
    // Cursor.
    def setCursor(c: Cursor): Unit = ???

    @stub
    // Notifies the peer that the Transferable's
    // DataFlavors have changed.
    def transferablesFlavorsChanged(): Unit = ???
}

object DragSourceContext {
    @stub
    // An int used by updateCurrentCursor()
    // indicating that the user operation has changed.
    protected def CHANGED: Int = ???

    @stub
    // An int used by updateCurrentCursor()
    // indicating that the Cursor should change
    // to the default (no drop) Cursor.
    protected def DEFAULT: Int = ???

    @stub
    // An int used by updateCurrentCursor()
    // indicating that the Cursor
    // has entered a DropTarget.
    protected def ENTER: Int = ???
}
