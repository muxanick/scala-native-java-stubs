package java.awt.dnd

import java.awt.{Component, Cursor, Image, Point}
import java.awt.datatransfer.{FlavorMap, Transferable}
import java.io.Serializable
import java.lang.{Class, Object}
import java.util.EventListener

/** The DragSource is the entity responsible
 *  for the initiation of the Drag
 *  and Drop operation, and may be used in a number of scenarios:
 *  
 *  1 default instance per JVM for the lifetime of that JVM.
 *  1 instance per class of potential Drag Initiator object (e.g
 *  TextField). [implementation dependent]
 *  1 per instance of a particular
 *  Component, or application specific
 *  object associated with a Component
 *  instance in the GUI. [implementation dependent]
 *  Some other arbitrary association. [implementation dependent]
 * 
 * 
 *  Once the DragSource is
 *  obtained, a DragGestureRecognizer should
 *  also be obtained to associate the DragSource
 *  with a particular
 *  Component.
 *  
 *  The initial interpretation of the user's gesture,
 *  and the subsequent starting of the drag operation
 *  are the responsibility of the implementing
 *  Component, which is usually
 *  implemented by a DragGestureRecognizer.
 * 
 *  When a drag gesture occurs, the
 *  DragSource's
 *  startDrag() method shall be
 *  invoked in order to cause processing
 *  of the user's navigational
 *  gestures and delivery of Drag and Drop
 *  protocol notifications. A
 *  DragSource shall only
 *  permit a single Drag and Drop operation to be
 *  current at any one time, and shall
 *  reject any further startDrag() requests
 *  by throwing an IllegalDnDOperationException
 *  until such time as the extant operation is complete.
 *  
 *  The startDrag() method invokes the
 *  createDragSourceContext() method to
 *  instantiate an appropriate
 *  DragSourceContext
 *  and associate the DragSourceContextPeer
 *  with that.
 *  
 *  If the Drag and Drop System is
 *  unable to initiate a drag operation for
 *  some reason, the startDrag() method throws
 *  a java.awt.dnd.InvalidDnDOperationException
 *  to signal such a condition. Typically this
 *  exception is thrown when the underlying platform
 *  system is either not in a state to
 *  initiate a drag, or the parameters specified are invalid.
 *  
 *  Note that during the drag, the
 *  set of operations exposed by the source
 *  at the start of the drag operation may not change
 *  until the operation is complete.
 *  The operation(s) are constant for the
 *  duration of the operation with respect to the
 *  DragSource.
 */
class DragSource extends Object with Serializable {

    /** Adds the specified DragSourceListener to this
     *  DragSource to receive drag source events during drag
     *  operations intiated with this DragSource.
     */
    @stub
    def addDragSourceListener(dsl: DragSourceListener): Unit = ???

    /** Adds the specified DragSourceMotionListener to this
     *  DragSource to receive drag motion events during drag
     *  operations intiated with this DragSource.
     */
    @stub
    def addDragSourceMotionListener(dsml: DragSourceMotionListener): Unit = ???

    /** Creates a new DragGestureRecognizer
     *  that implements the default
     *  abstract subclass of DragGestureRecognizer
     *  for this DragSource,
     *  and sets the specified Component
     *  and DragGestureListener on the
     *  newly created object.
     */
    @stub
    def createDefaultDragGestureRecognizer(c: Component, actions: Int, dgl: DragGestureListener): DragGestureRecognizer = ???

    /** Creates a new DragGestureRecognizer
     *  that implements the specified
     *  abstract subclass of
     *  DragGestureRecognizer, and
     *  sets the specified Component
     *  and DragGestureListener on
     *  the newly created object.
     */
    @stub
    def createDragGestureRecognizer[T <: DragGestureRecognizer](recognizerAbstractClass: Class[T], c: Component, actions: Int, dgl: DragGestureListener): T = ???

    /** Creates the DragSourceContext to handle the current drag
     *  operation.
     */
    @stub
    protected def createDragSourceContext(dscp: java.awt.dnd.peer.DragSourceContextPeer, dgl: DragGestureEvent, dragCursor: Cursor, dragImage: Image, imageOffset: Point, t: Transferable, dsl: DragSourceListener): DragSourceContext = ???

    /** Gets all the DragSourceListeners
     *  registered with this DragSource.
     */
    @stub
    def getDragSourceListeners(): Array[DragSourceListener] = ???

    /** Gets all of the  DragSourceMotionListeners
     *  registered with this DragSource.
     */
    @stub
    def getDragSourceMotionListeners(): Array[DragSourceMotionListener] = ???

    /** This method returns the
     *  FlavorMap for this DragSource.
     */
    @stub
    def getFlavorMap(): FlavorMap = ???

    /** Gets all the objects currently registered as
     *  FooListeners upon this DragSource.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Removes the specified DragSourceListener from this
     *  DragSource.
     */
    @stub
    def removeDragSourceListener(dsl: DragSourceListener): Unit = ???

    /** Removes the specified DragSourceMotionListener from this
     *  DragSource.
     */
    @stub
    def removeDragSourceMotionListener(dsml: DragSourceMotionListener): Unit = ???

    /** Start a drag, given the DragGestureEvent
     *  that initiated the drag, the initial Cursor
     *  to use,
     *  the Image to drag,
     *  the offset of the Image origin
     *  from the hotspot of the Cursor
     *  at the instant of the trigger,
     *  the subject data of the drag, and
     *  the DragSourceListener.
     */
    @stub
    def startDrag(trigger: DragGestureEvent, dragCursor: Cursor, dragImage: Image, dragOffset: Point, transferable: Transferable, dsl: DragSourceListener): Unit = ???

    /** Start a drag, given the DragGestureEvent
     *  that initiated the drag, the initial
     *  Cursor to use,
     *  the Image to drag,
     *  the offset of the Image origin
     *  from the hotspot of the Cursor at
     *  the instant of the trigger,
     *  the Transferable subject data
     *  of the drag, the DragSourceListener,
     *  and the FlavorMap.
     */
    @stub
    def startDrag(trigger: DragGestureEvent, dragCursor: Cursor, dragImage: Image, imageOffset: Point, transferable: Transferable, dsl: DragSourceListener, flavorMap: FlavorMap): Unit = ???

    /** Start a drag, given the DragGestureEvent
     *  that initiated the drag, the initial
     *  Cursor to
     *  use,
     *  the Transferable subject data
     *  of the drag, and the DragSourceListener.
     */
    @stub
    def startDrag(trigger: DragGestureEvent, dragCursor: Cursor, transferable: Transferable, dsl: DragSourceListener): Unit = ???
}

object DragSource {
    /** The default Cursor to use with a copy operation indicating
     *  that a drop is currently allowed.
     */
    @stub
    val DefaultCopyDrop: Cursor = ???

    /** The default Cursor to use with a copy operation indicating
     *  that a drop is currently not allowed.
     */
    @stub
    val DefaultCopyNoDrop: Cursor = ???

    /** The default Cursor to use with a link operation indicating
     *  that a drop is currently allowed.
     */
    @stub
    val DefaultLinkDrop: Cursor = ???

    /** The default Cursor to use with a link operation indicating
     *  that a drop is currently not allowed.
     */
    @stub
    val DefaultLinkNoDrop: Cursor = ???

    /** The default Cursor to use with a move operation indicating
     *  that a drop is currently allowed.
     */
    @stub
    val DefaultMoveDrop: Cursor = ???

    /** Gets the DragSource object associated with
     *  the underlying platform.
     */
    @stub
    def getDefaultDragSource(): DragSource = ???

    /** Returns the drag gesture motion threshold. */
    @stub
    def getDragThreshold(): Int = ???

    /** Reports
     *  whether or not drag
     *  Image support
     *  is available on the underlying platform.
     */
    @stub
    def isDragImageSupported(): Boolean = ???
}
