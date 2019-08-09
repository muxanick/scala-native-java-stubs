package javax.swing.text

import java.awt.{Graphics, Point, Rectangle}
import java.awt.event.{FocusEvent, FocusListener, MouseEvent, MouseListener, MouseMotionListener}
import java.awt.geom.{Rectangle2D, RectangularShape}
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener, EventListenerList}

/** A default implementation of Caret.  The caret is rendered as
 *  a vertical line in the color specified by the CaretColor property
 *  of the associated JTextComponent.  It can blink at the rate specified
 *  by the BlinkRate property.
 *  
 *  This implementation expects two sources of asynchronous notification.
 *  The timer thread fires asynchronously, and causes the caret to simply
 *  repaint the most recent bounding box.  The caret also tracks change
 *  as the document is modified.  Typically this will happen on the
 *  event dispatch thread as a result of some mouse or keyboard event.
 *  The caret behavior on both synchronous and asynchronous documents updates
 *  is controlled by UpdatePolicy property. The repaint of the
 *  new caret location will occur on the event thread in any case, as calls to
 *  modelToView are only safe on the event thread.
 *  
 *  The caret acts as a mouse and focus listener on the text component
 *  it has been installed in, and defines the caret semantics based upon
 *  those events.  The listener methods can be reimplemented to change the
 *  semantics.
 *  By default, the first mouse button will be used to set focus and caret
 *  position.  Dragging the mouse pointer with the first mouse button will
 *  sweep out a selection that is contiguous in the model.  If the associated
 *  text component is editable, the caret will become visible when focus
 *  is gained, and invisible when focus is lost.
 *  
 *  The Highlighter bound to the associated text component is used to
 *  render the selection by default.
 *  Selection appearance can be customized by supplying a
 *  painter to use for the highlights.  By default a painter is used that
 *  will render a solid color as specified in the associated text component
 *  in the SelectionColor property.  This can easily be changed
 *  by reimplementing the
 *  getSelectionPainter
 *  method.
 *  
 *  A customized caret appearance can be achieved by reimplementing
 *  the paint method.  If the paint method is changed, the damage method
 *  should also be reimplemented to cause a repaint for the area needed
 *  to render the caret.  The caret extends the Rectangle class which
 *  is used to hold the bounding box for where the caret was last rendered.
 *  This enables the caret to repaint in a thread-safe manner when the
 *  caret moves without making a call to modelToView which is unstable
 *  between model updates and view repair (i.e. the order of delivery
 *  to DocumentListeners is not guaranteed).
 *  
 *  The magic caret position is set to null when the caret position changes.
 *  A timer is used to determine the new location (after the caret change).
 *  When the timer fires, if the magic caret position is still null it is
 *  reset to the current caret position. Any actions that change
 *  the caret position and want the magic caret position to remain the
 *  same, must remember the magic caret position, change the cursor, and
 *  then set the magic caret position to its original value. This has the
 *  benefit that only actions that want the magic caret position to persist
 *  (such as open/down) need to know about it.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultCaret extends Rectangle with Caret with FocusListener with MouseListener with MouseMotionListener {

    /** The change event for the model. */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** The event listener list. */
    @stub
    protected val listenerList: EventListenerList = ???

    /** Adds a listener to track whenever the caret position has
     *  been changed.
     */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Scrolls the associated view (if necessary) to make
     *  the caret visible.
     */
    @stub
    protected def adjustVisibility(nloc: Rectangle): Unit = ???

    /** Damages the area surrounding the caret to cause
     *  it to be repainted in a new location.
     */
    @stub
    protected def damage(r: Rectangle): Unit = ???

    /** Called when the UI is being removed from the
     *  interface of a JTextComponent.
     */
    @stub
    def deinstall(c: JTextComponent): Unit = ???

    /** Compares this object to the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Called when the component containing the caret gains
     *  focus.
     */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Called when the component containing the caret loses
     *  focus.
     */
    @stub
    def focusLost(e: FocusEvent): Unit = ???

    /** Gets the caret blink rate. */
    @stub
    def getBlinkRate(): Int = ???

    /** Returns an array of all the change listeners
     *  registered on this caret.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Gets the text editor component that this caret is
     *  is bound to.
     */
    @stub
    protected def getComponent(): JTextComponent = ???

    /** Fetches the current position of the caret. */
    @stub
    def getDot(): Int = ???

    /** Returns the bias of the caret position. */
    @stub
    def getDotBias(): Position.Bias = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this caret.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Gets the saved caret position. */
    @stub
    def getMagicCaretPosition(): Point = ???

    /** Fetches the current position of the mark. */
    @stub
    def getMark(): Int = ???

    /** Returns the bias of the mark. */
    @stub
    def getMarkBias(): Position.Bias = ???

    /** Gets the painter for the Highlighter. */
    @stub
    protected def getSelectionPainter(): Highlighter.HighlightPainter = ???

    /** Gets the caret movement policy on document updates. */
    @stub
    def getUpdatePolicy(): Int = ???

    /** Called when the UI is being installed into the
     *  interface of a JTextComponent.
     */
    @stub
    def install(c: JTextComponent): Unit = ???

    /** Determines if the caret is currently active. */
    @stub
    def isActive(): Boolean = ???

    /** Checks whether the current selection is visible. */
    @stub
    def isSelectionVisible(): Boolean = ???

    /** Indicates whether or not the caret is currently visible. */
    @stub
    def isVisible(): Boolean = ???

    /** Called when the mouse is clicked. */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Moves the caret position
     *  according to the mouse pointer's current
     *  location.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Called when the mouse enters a region. */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Called when the mouse exits a region. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Called when the mouse is moved. */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** If button 1 is pressed, this is implemented to
     *  request focus on the associated text component,
     *  and to set the caret position.
     */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Called when the mouse is released. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???

    /** Tries to move the position of the caret from
     *  the coordinates of a mouse event, using viewToModel().
     */
    @stub
    protected def moveCaret(e: MouseEvent): Unit = ???

    /** Moves the caret position to the specified position,
     *  with a forward bias.
     */
    @stub
    def moveDot(dot: Int): Unit = ???

    /** Moves the caret position to the specified position, with the
     *  specified bias.
     */
    @stub
    def moveDot(dot: Int, dotBias: Position.Bias): Unit = ???

    /** Renders the caret as a vertical line. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Tries to set the position of the caret from
     *  the coordinates of a mouse event, using viewToModel().
     */
    @stub
    protected def positionCaret(e: MouseEvent): Unit = ???

    /** Removes a listener that was tracking caret position changes. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Cause the caret to be painted. */
    @stub
    protected def repaint(): Unit = ???

    /** Sets the caret blink rate. */
    @stub
    def setBlinkRate(rate: Int): Unit = ???

    /** Sets the caret position and mark to the specified position,
     *  with a forward bias.
     */
    @stub
    def setDot(dot: Int): Unit = ???

    /** Sets the caret position and mark to the specified position, with the
     *  specified bias.
     */
    @stub
    def setDot(dot: Int, dotBias: Position.Bias): Unit = ???

    /** Saves the current caret position. */
    @stub
    def setMagicCaretPosition(p: Point): Unit = ???

    /** Changes the selection visibility. */
    @stub
    def setSelectionVisible(vis: Boolean): Unit = ???

    /** Sets the caret movement policy on the document updates. */
    @stub
    def setUpdatePolicy(policy: Int): Unit = ???

    /** Sets the caret visibility, and repaints the caret. */
    @stub
    def setVisible(e: Boolean): Unit = ???
}

object DefaultCaret {
    /** Indicates that the caret position is to be always
     *  updated accordingly to the document changes regardless whether
     *  the document updates are performed on the Event Dispatching Thread
     *  or not.
     */
    @stub
    val ALWAYS_UPDATE: Int = ???

    /** Indicates that the caret should remain at the same
     *  absolute position in the document regardless of any document
     *  updates, except when the document length becomes less than
     *  the current caret position due to removal.
     */
    @stub
    val NEVER_UPDATE: Int = ???
}
