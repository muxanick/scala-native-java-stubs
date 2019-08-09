package java.awt.dnd

import java.awt.{Component, Cursor, Image, Point}
import java.awt.datatransfer.Transferable
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The DragSourceContext class is responsible for managing the
 *  initiator side of the Drag and Drop protocol. In particular, it is responsible
 *  for managing drag event notifications to the
 *  DragSourceListeners
 *  and DragSourceMotionListeners, and providing the
 *  Transferable representing the source data for the drag operation.
 *  
 *  Note that the DragSourceContext itself
 *  implements the DragSourceListener and
 *  DragSourceMotionListener interfaces.
 *  This is to allow the platform peer
 *  (the DragSourceContextPeer instance)
 *  created by the DragSource to notify
 *  the DragSourceContext of
 *  state changes in the ongoing operation. This allows the
 *  DragSourceContext object to interpose
 *  itself between the platform and the
 *  listeners provided by the initiator of the drag operation.
 *  
 *  
 *  By default, DragSourceContext sets the cursor as appropriate
 *  for the current state of the drag and drop operation. For example, if
 *  the user has chosen the move action,
 *  and the pointer is over a target that accepts
 *  the move action, the default move cursor is shown. When
 *  the pointer is over an area that does not accept the transfer,
 *  the default "no drop" cursor is shown.
 *  
 *  This default handling mechanism is disabled when a custom cursor is set
 *  by the setCursor(java.awt.Cursor) method. When the default handling is disabled,
 *  it becomes the responsibility
 *  of the developer to keep the cursor up to date, by listening
 *  to the DragSource events and calling the setCursor() method.
 *  Alternatively, you can provide custom cursor behavior by providing
 *  custom implementations of the DragSource
 *  and the DragSourceContext classes.
 */
class DragSourceContext extends Object with DragSourceListener with DragSourceMotionListener with Serializable {

    /** Called from DragSource, this constructor creates a new
     *  DragSourceContext given the
     *  DragSourceContextPeer for this Drag, the
     *  DragGestureEvent that triggered the Drag, the initial
     *  Cursor to use for the Drag, an (optional)
     *  Image to display while the Drag is taking place, the offset
     *  of the Image origin from the hotspot at the instant of the
     *  triggering event, the Transferable subject data, and the
     *  DragSourceListener to use during the Drag and Drop
     *  operation.
     */
    @stub
    def this(dscp: java.awt.dnd.peer.DragSourceContextPeer, trigger: DragGestureEvent, dragCursor: Cursor, dragImage: Image, offset: Point, t: Transferable, dsl: DragSourceListener) = ???

    /** Add a DragSourceListener to this
     *  DragSourceContext if one has not already been added.
     */
    @stub
    def addDragSourceListener(dsl: DragSourceListener): Unit = ???

    /** Calls dragDropEnd on the
     *  DragSourceListeners registered with this
     *  DragSourceContext and with the associated
     *  DragSource, and passes them the specified
     *  DragSourceDropEvent.
     */
    @stub
    def dragDropEnd(dsde: DragSourceDropEvent): Unit = ???

    /** Calls dragEnter on the
     *  DragSourceListeners registered with this
     *  DragSourceContext and with the associated
     *  DragSource, and passes them the specified
     *  DragSourceDragEvent.
     */
    @stub
    def dragEnter(dsde: DragSourceDragEvent): Unit = ???

    /** Calls dragExit on the
     *  DragSourceListeners registered with this
     *  DragSourceContext and with the associated
     *  DragSource, and passes them the specified
     *  DragSourceEvent.
     */
    @stub
    def dragExit(dse: DragSourceEvent): Unit = ???

    /** Calls dragMouseMoved on the
     *  DragSourceMotionListeners registered with the
     *  DragSource associated with this
     *  DragSourceContext, and them passes the specified
     *  DragSourceDragEvent.
     */
    @stub
    def dragMouseMoved(dsde: DragSourceDragEvent): Unit = ???

    /** Calls dragOver on the
     *  DragSourceListeners registered with this
     *  DragSourceContext and with the associated
     *  DragSource, and passes them the specified
     *  DragSourceDragEvent.
     */
    @stub
    def dragOver(dsde: DragSourceDragEvent): Unit = ???

    /** Calls dropActionChanged on the
     *  DragSourceListeners registered with this
     *  DragSourceContext and with the associated
     *  DragSource, and passes them the specified
     *  DragSourceDragEvent.
     */
    @stub
    def dropActionChanged(dsde: DragSourceDragEvent): Unit = ???

    /** Returns the Component associated with this
     *  DragSourceContext.
     */
    @stub
    def getComponent(): Component = ???

    /** Returns the current drag Cursor. */
    @stub
    def getCursor(): Cursor = ???

    /** Returns the DragSource
     *  that instantiated this DragSourceContext.
     */
    @stub
    def getDragSource(): DragSource = ???

    /** Returns a bitwise mask of DnDConstants that
     *  represent the set of drop actions supported by the drag source for the
     *  drag operation associated with this DragSourceContext.
     */
    @stub
    def getSourceActions(): Int = ???

    /** Returns the Transferable associated with
     *  this DragSourceContext.
     */
    @stub
    def getTransferable(): Transferable = ???

    /** Returns the DragGestureEvent
     *  that initially triggered the drag.
     */
    @stub
    def getTrigger(): DragGestureEvent = ???

    /** Removes the specified DragSourceListener
     *  from  this DragSourceContext.
     */
    @stub
    def removeDragSourceListener(dsl: DragSourceListener): Unit = ???

    /** Sets the cursor for this drag operation to the specified
     *  Cursor.
     */
    @stub
    def setCursor(c: Cursor): Unit = ???

    /** Notifies the peer that the Transferable's
     *  DataFlavors have changed.
     */
    @stub
    def transferablesFlavorsChanged(): Unit = ???

    /** If the default drag cursor behavior is active, this method
     *  sets the default drag cursor for the specified actions
     *  supported by the drag source, the drop target action,
     *  and status, otherwise this method does nothing.
     */
    @stub
    protected def updateCurrentCursor(sourceAct: Int, targetAct: Int, status: Int): Unit = ???
}

object DragSourceContext {
    /** An int used by updateCurrentCursor()
     *  indicating that the user operation has changed.
     */
    @stub
    protected val CHANGED: Int = ???

    /** An int used by updateCurrentCursor()
     *  indicating that the Cursor should change
     *  to the default (no drop) Cursor.
     */
    @stub
    protected val DEFAULT: Int = ???

    /** An int used by updateCurrentCursor()
     *  indicating that the Cursor
     *  has entered a DropTarget.
     */
    @stub
    protected val ENTER: Int = ???

    /** An int used by updateCurrentCursor()
     *  indicating that the Cursor is
     *  over a DropTarget.
     */
    @stub
    protected val OVER: Int = ???
}
