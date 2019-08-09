package java.awt.dnd

import java.awt.{Component, Point}
import java.awt.datatransfer.FlavorMap
import java.io.Serializable
import java.lang.Object

// The DropTarget is associated
// with a Component when that Component
// wishes
// to accept drops during Drag and Drop operations.
// 
//  Each
// DropTarget is associated with a FlavorMap.
// The default FlavorMap hereafter designates the
// FlavorMap returned by SystemFlavorMap.getDefaultFlavorMap().
class DropTarget extends Object with DropTargetListener, with Serializable {

    @stub
    // Creates a DropTarget.
    def this() = ???

    @stub
    // Creates a DropTarget given the Component
    // to associate itself with, and the DropTargetListener
    // to handle event processing.
    def this(c: Component, dtl: DropTargetListener) = ???

    @stub
    // Creates a DropTarget given the Component
    // to associate itself with, an int representing
    // the default acceptable action(s) to support, and a
    // DropTargetListener to handle event processing.
    def this(c: Component, ops: Int, dtl: DropTargetListener) = ???

    @stub
    // Creates a DropTarget given the Component
    // to associate itself with, an int representing
    // the default acceptable action(s)
    // to support, a DropTargetListener
    // to handle event processing, and a boolean indicating
    // if the DropTarget is currently accepting drops.
    def this(c: Component, ops: Int, dtl: DropTargetListener, act: Boolean) = ???

    @stub
    // Adds a new DropTargetListener (UNICAST SOURCE).
    def addDropTargetListener(dtl: DropTargetListener): Unit = ???

    @stub
    // Notify the DropTarget that it has been associated with a Component
    //
    //
    // This method is usually called from java.awt.Component.addNotify() of
    // the Component associated with this DropTarget to notify the DropTarget
    // that a ComponentPeer has been associated with that Component.
    def addNotify(peer: java.awt.peer.ComponentPeer): Unit = ???

    @stub
    // clear autoscrolling
    protected def clearAutoscroll(): Unit = ???

    @stub
    // create an embedded autoscroller
    protected def createDropTargetAutoScroller(c: Component, p: Point): DropTarget.DropTargetAutoScroller = ???

    @stub
    // Creates the DropTargetContext associated with this DropTarget.
    protected def createDropTargetContext(): DropTargetContext = ???

    @stub
    // Calls dragEnter on the registered
    // DropTargetListener and passes it
    // the specified DropTargetDragEvent.
    def dragEnter(dtde: DropTargetDragEvent): Unit = ???

    @stub
    // Calls dragExit on the registered
    // DropTargetListener and passes it
    // the specified DropTargetEvent.
    def dragExit(dte: DropTargetEvent): Unit = ???

    @stub
    // Calls dragOver on the registered
    // DropTargetListener and passes it
    // the specified DropTargetDragEvent.
    def dragOver(dtde: DropTargetDragEvent): Unit = ???

    @stub
    // Calls drop on the registered
    // DropTargetListener and passes it
    // the specified DropTargetDropEvent
    // if this DropTarget is active.
    def drop(dtde: DropTargetDropEvent): Unit = ???

    @stub
    // Calls dropActionChanged on the registered
    // DropTargetListener and passes it
    // the specified DropTargetDragEvent.
    def dropActionChanged(dtde: DropTargetDragEvent): Unit = ???

    @stub
    // Gets the Component associated
    // with this DropTarget.
    def getComponent(): Component = ???

    @stub
    // Gets an int representing the
    // current action(s) supported by this DropTarget.
    def getDefaultActions(): Int = ???

    @stub
    // Gets the DropTargetContext associated
    // with this DropTarget.
    def getDropTargetContext(): DropTargetContext = ???

    @stub
    // Gets the FlavorMap
    // associated with this DropTarget.
    def getFlavorMap(): FlavorMap = ???

    @stub
    // initialize autoscrolling
    protected def initializeAutoscrolling(p: Point): Unit = ???

    @stub
    // Reports whether or not
    // this DropTarget
    // is currently active (ready to accept drops).
    def isActive(): Boolean = ???

    @stub
    // Removes the current DropTargetListener (UNICAST SOURCE).
    def removeDropTargetListener(dtl: DropTargetListener): Unit = ???

    @stub
    // Notify the DropTarget that it has been disassociated from a Component
    //
    //
    // This method is usually called from java.awt.Component.removeNotify() of
    // the Component associated with this DropTarget to notify the DropTarget
    // that a ComponentPeer has been disassociated with that Component.
    def removeNotify(peer: java.awt.peer.ComponentPeer): Unit = ???

    @stub
    // Sets the DropTarget active if true,
    // inactive if false.
    def setActive(isActive: Boolean): Unit = ???

    @stub
    // Note: this interface is required to permit the safe association
    // of a DropTarget with a Component in one of two ways, either:
    //  component.setDropTarget(droptarget); 
    // or  droptarget.setComponent(component); 
    def setComponent(c: Component): Unit = ???

    @stub
    // Sets the default acceptable actions for this DropTarget
    def setDefaultActions(ops: Int): Unit = ???

    @stub
    // Sets the FlavorMap associated
    // with this DropTarget.
    def setFlavorMap(fm: FlavorMap): Unit = ???
}
