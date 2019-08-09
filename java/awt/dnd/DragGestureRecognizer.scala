package java.awt.dnd

import java.awt.{Component, Point}
import java.awt.event.InputEvent
import java.io.Serializable
import java.lang.Object
import java.util.ArrayList
import scala.scalanative.annotation.stub

/** The DragGestureRecognizer is an
 *  abstract base class for the specification
 *  of a platform-dependent listener that can be associated with a particular
 *  Component in order to
 *  identify platform-dependent drag initiating gestures.
 *  
 *  The appropriate DragGestureRecognizer
 *  subclass instance is obtained from the
 *  DragSource associated with
 *  a particular Component, or from the Toolkit object via its
 *  createDragGestureRecognizer()
 *  method.
 *  
 *  Once the DragGestureRecognizer
 *  is associated with a particular Component
 *  it will register the appropriate listener interfaces on that
 *  Component
 *  in order to track the input events delivered to the Component.
 *  
 *  Once the DragGestureRecognizer identifies a sequence of events
 *  on the Component as a drag initiating gesture, it will notify
 *  its unicast DragGestureListener by
 *  invoking its
 *  gestureRecognized()
 *  method.
 *  
 *  When a concrete DragGestureRecognizer
 *  instance detects a drag initiating
 *  gesture on the Component it is associated with,
 *  it fires a DragGestureEvent to
 *  the DragGestureListener registered on
 *  its unicast event source for DragGestureListener
 *  events. This DragGestureListener is responsible
 *  for causing the associated
 *  DragSource to start the Drag and Drop operation (if
 *  appropriate).
 *  
 */
abstract class DragGestureRecognizer extends Object with Serializable {

    /** Construct a new DragGestureRecognizer
     *  given the DragSource to be used in this
     *  Drag and Drop operation.
     */
    @stub
    protected def this(ds: DragSource) = ???

    /** Construct a new DragGestureRecognizer
     *  given the DragSource to be used
     *  in this Drag and Drop operation, and
     *  the Component this
     *  DragGestureRecognizer
     *  should "observe" for drag initiating gestures.
     */
    @stub
    protected def this(ds: DragSource, c: Component) = ???

    /** Construct a new DragGestureRecognizer
     *  given the DragSource to be used in this
     *  Drag and Drop
     *  operation, the Component this
     *  DragGestureRecognizer should "observe"
     *  for drag initiating gestures, and the action(s)
     *  supported for this Drag and Drop operation.
     */
    @stub
    protected def this(ds: DragSource, c: Component, sa: Int) = ???

    /** Construct a new DragGestureRecognizer
     *  given the DragSource to be used
     *  in this Drag and Drop operation, the Component
     *  this DragGestureRecognizer should "observe"
     *  for drag initiating gestures, the action(s) supported
     *  for this Drag and Drop operation, and the
     *  DragGestureListener to notify
     *  once a drag initiating gesture has been detected.
     */
    @stub
    protected def this(ds: DragSource, c: Component, sa: Int, dgl: DragGestureListener) = ???

    /** The Component
     *  associated with this DragGestureRecognizer.
     */
    protected val component: Component

    /** The DragGestureListener
     *  associated with this DragGestureRecognizer.
     */
    protected val dragGestureListener: DragGestureListener

    /** The DragSource
     *  associated with this
     *  DragGestureRecognizer.
     */
    protected val dragSource: DragSource

    /** The list of events (in order) that
     *  the DragGestureRecognizer
     *  "recognized" as a "gesture" that triggers a drag.
     */
    protected val events: ArrayList[InputEvent]

    /** An int representing
     *  the type(s) of action(s) used
     *  in this Drag and Drop operation.
     */
    protected val sourceActions: Int

    /** Register a new DragGestureListener. */
    def addDragGestureListener(dgl: DragGestureListener): Unit

    /** Listeners registered on the Component by this Recognizer shall record
     *  all Events that are recognized as part of the series of Events that go
     *  to comprise a Drag and Drop initiating gesture via this API.
     */
    protected def appendEvent(awtie: InputEvent): Unit

    /** Notify the DragGestureListener that a Drag and Drop initiating
     *  gesture has occurred.
     */
    protected def fireDragGestureRecognized(dragAction: Int, p: Point): Unit

    /** This method returns the Component
     *  that is to be "observed" by the
     *  DragGestureRecognizer
     *  for drag initiating gestures.
     */
    def getComponent(): Component

    /** This method returns the DragSource
     *  this DragGestureRecognizer
     *  will use in order to process the Drag and Drop
     *  operation.
     */
    def getDragSource(): DragSource

    /** This method returns an int representing the
     *  type of action(s) this Drag and Drop
     *  operation will support.
     */
    def getSourceActions(): Int

    /** This method returns the first event in the
     *  series of events that initiated
     *  the Drag and Drop operation.
     */
    def getTriggerEvent(): InputEvent

    /** register this DragGestureRecognizer's Listeners with the Component
     * 
     *  subclasses must override this method
     */
    protected def registerListeners(): Unit

    /** unregister the current DragGestureListener */
    def removeDragGestureListener(dgl: DragGestureListener): Unit

    /** Reset the Recognizer, if its currently recognizing a gesture, ignore
     *  it.
     */
    def resetRecognizer(): Unit

    /** set the Component that the DragGestureRecognizer is associated with
     * 
     *  registerListeners() and unregisterListeners() are called as a side
     *  effect as appropriate.
     */
    def setComponent(c: Component): Unit

    /** This method sets the permitted source drag action(s)
     *  for this Drag and Drop operation.
     */
    def setSourceActions(actions: Int): Unit

    /** unregister this DragGestureRecognizer's Listeners with the Component
     * 
     *  subclasses must override this method
     */
    protected def unregisterListeners(): Unit
}
