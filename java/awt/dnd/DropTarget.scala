package java.awt.dnd

import java.awt.{Component, Point}
import java.awt.datatransfer.FlavorMap
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The DropTarget is associated
 *  with a Component when that Component
 *  wishes
 *  to accept drops during Drag and Drop operations.
 *  
 *   Each
 *  DropTarget is associated with a FlavorMap.
 *  The default FlavorMap hereafter designates the
 *  FlavorMap returned by SystemFlavorMap.getDefaultFlavorMap().
 */
class DropTarget extends Object with DropTargetListener with Serializable {

    /** Creates a DropTarget. */
    @stub
    def this() = ???

    /** Creates a DropTarget given the Component
     *  to associate itself with, and the DropTargetListener
     *  to handle event processing.
     */
    @stub
    def this(c: Component, dtl: DropTargetListener) = ???

    /** Creates a DropTarget given the Component
     *  to associate itself with, an int representing
     *  the default acceptable action(s) to support, and a
     *  DropTargetListener to handle event processing.
     */
    @stub
    def this(c: Component, ops: Int, dtl: DropTargetListener) = ???

    /** Creates a DropTarget given the Component
     *  to associate itself with, an int representing
     *  the default acceptable action(s)
     *  to support, a DropTargetListener
     *  to handle event processing, and a boolean indicating
     *  if the DropTarget is currently accepting drops.
     */
    @stub
    def this(c: Component, ops: Int, dtl: DropTargetListener, act: Boolean) = ???

    /** Creates a new DropTarget given the Component
     *  to associate itself with, an int representing
     *  the default acceptable action(s) to
     *  support, a DropTargetListener
     *  to handle event processing, a boolean indicating
     *  if the DropTarget is currently accepting drops, and
     *  a FlavorMap to use (or null for the default FlavorMap).
     */
    @stub
    def this(c: Component, ops: Int, dtl: DropTargetListener, act: Boolean, fm: FlavorMap) = ???

    /** Adds a new DropTargetListener (UNICAST SOURCE). */
    @stub
    def addDropTargetListener(dtl: DropTargetListener): Unit = ???

    /** Notify the DropTarget that it has been associated with a Component
     * 
     * 
     *  This method is usually called from java.awt.Component.addNotify() of
     *  the Component associated with this DropTarget to notify the DropTarget
     *  that a ComponentPeer has been associated with that Component.
     */
    @stub
    def addNotify(peer: java.awt.peer.ComponentPeer): Unit = ???

    /** clear autoscrolling */
    @stub
    protected def clearAutoscroll(): Unit = ???

    /** create an embedded autoscroller */
    @stub
    protected def createDropTargetAutoScroller(c: Component, p: Point): DropTarget.DropTargetAutoScroller = ???

    /** Creates the DropTargetContext associated with this DropTarget. */
    @stub
    protected def createDropTargetContext(): DropTargetContext = ???

    /** Calls dragEnter on the registered
     *  DropTargetListener and passes it
     *  the specified DropTargetDragEvent.
     */
    @stub
    def dragEnter(dtde: DropTargetDragEvent): Unit = ???

    /** Calls dragExit on the registered
     *  DropTargetListener and passes it
     *  the specified DropTargetEvent.
     */
    @stub
    def dragExit(dte: DropTargetEvent): Unit = ???

    /** Calls dragOver on the registered
     *  DropTargetListener and passes it
     *  the specified DropTargetDragEvent.
     */
    @stub
    def dragOver(dtde: DropTargetDragEvent): Unit = ???

    /** Calls drop on the registered
     *  DropTargetListener and passes it
     *  the specified DropTargetDropEvent
     *  if this DropTarget is active.
     */
    @stub
    def drop(dtde: DropTargetDropEvent): Unit = ???

    /** Calls dropActionChanged on the registered
     *  DropTargetListener and passes it
     *  the specified DropTargetDragEvent.
     */
    @stub
    def dropActionChanged(dtde: DropTargetDragEvent): Unit = ???

    /** Gets the Component associated
     *  with this DropTarget.
     */
    @stub
    def getComponent(): Component = ???

    /** Gets an int representing the
     *  current action(s) supported by this DropTarget.
     */
    @stub
    def getDefaultActions(): Int = ???

    /** Gets the DropTargetContext associated
     *  with this DropTarget.
     */
    @stub
    def getDropTargetContext(): DropTargetContext = ???

    /** Gets the FlavorMap
     *  associated with this DropTarget.
     */
    @stub
    def getFlavorMap(): FlavorMap = ???

    /** initialize autoscrolling */
    @stub
    protected def initializeAutoscrolling(p: Point): Unit = ???

    /** Reports whether or not
     *  this DropTarget
     *  is currently active (ready to accept drops).
     */
    @stub
    def isActive(): Boolean = ???

    /** Removes the current DropTargetListener (UNICAST SOURCE). */
    @stub
    def removeDropTargetListener(dtl: DropTargetListener): Unit = ???

    /** Notify the DropTarget that it has been disassociated from a Component
     * 
     * 
     *  This method is usually called from java.awt.Component.removeNotify() of
     *  the Component associated with this DropTarget to notify the DropTarget
     *  that a ComponentPeer has been disassociated with that Component.
     */
    @stub
    def removeNotify(peer: java.awt.peer.ComponentPeer): Unit = ???

    /** Sets the DropTarget active if true,
     *  inactive if false.
     */
    @stub
    def setActive(isActive: Boolean): Unit = ???

    /** Note: this interface is required to permit the safe association
     *  of a DropTarget with a Component in one of two ways, either:
     *   component.setDropTarget(droptarget); 
     *  or  droptarget.setComponent(component); 
     */
    @stub
    def setComponent(c: Component): Unit = ???

    /** Sets the default acceptable actions for this DropTarget */
    @stub
    def setDefaultActions(ops: Int): Unit = ???

    /** Sets the FlavorMap associated
     *  with this DropTarget.
     */
    @stub
    def setFlavorMap(fm: FlavorMap): Unit = ???

    /** update autoscrolling with current cursor location */
    @stub
    protected def updateAutoscroll(dragCursorLocn: Point): Unit = ???
}

object DropTarget {
    /** this protected nested class implements autoscrolling */
    @stub
    protected object DropTargetAutoScroller extends DropTarget.DropTargetAutoScroller
}
