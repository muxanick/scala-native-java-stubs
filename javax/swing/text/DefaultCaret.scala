package javax.swing.text

import java.awt.{Graphics, Point, Rectangle}
import java.awt.event.{FocusEvent, FocusListener, MouseEvent, MouseListener, MouseMotionListener}
import java.awt.geom.{Rectangle2D, RectangularShape}
import java.lang.{Class, Object}
import java.util.EventListener
import javax.swing.event.{ChangeEvent, ChangeListener, EventListenerList}

// A default implementation of Caret.  The caret is rendered as
// a vertical line in the color specified by the CaretColor property
// of the associated JTextComponent.  It can blink at the rate specified
// by the BlinkRate property.
// 
// This implementation expects two sources of asynchronous notification.
// The timer thread fires asynchronously, and causes the caret to simply
// repaint the most recent bounding box.  The caret also tracks change
// as the document is modified.  Typically this will happen on the
// event dispatch thread as a result of some mouse or keyboard event.
// The caret behavior on both synchronous and asynchronous documents updates
// is controlled by UpdatePolicy property. The repaint of the
// new caret location will occur on the event thread in any case, as calls to
// modelToView are only safe on the event thread.
// 
// The caret acts as a mouse and focus listener on the text component
// it has been installed in, and defines the caret semantics based upon
// those events.  The listener methods can be reimplemented to change the
// semantics.
// By default, the first mouse button will be used to set focus and caret
// position.  Dragging the mouse pointer with the first mouse button will
// sweep out a selection that is contiguous in the model.  If the associated
// text component is editable, the caret will become visible when focus
// is gained, and invisible when focus is lost.
// 
// The Highlighter bound to the associated text component is used to
// render the selection by default.
// Selection appearance can be customized by supplying a
// painter to use for the highlights.  By default a painter is used that
// will render a solid color as specified in the associated text component
// in the SelectionColor property.  This can easily be changed
// by reimplementing the
// getSelectionPainter
// method.
// 
// A customized caret appearance can be achieved by reimplementing
// the paint method.  If the paint method is changed, the damage method
// should also be reimplemented to cause a repaint for the area needed
// to render the caret.  The caret extends the Rectangle class which
// is used to hold the bounding box for where the caret was last rendered.
// This enables the caret to repaint in a thread-safe manner when the
// caret moves without making a call to modelToView which is unstable
// between model updates and view repair (i.e. the order of delivery
// to DocumentListeners is not guaranteed).
// 
// The magic caret position is set to null when the caret position changes.
// A timer is used to determine the new location (after the caret change).
// When the timer fires, if the magic caret position is still null it is
// reset to the current caret position. Any actions that change
// the caret position and want the magic caret position to remain the
// same, must remember the magic caret position, change the cursor, and
// then set the magic caret position to its original value. This has the
// benefit that only actions that want the magic caret position to persist
// (such as open/down) need to know about it.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultCaret extends Rectangle with Caret, with FocusListener, with MouseListener, with MouseMotionListener {

    @stub
    // The change event for the model.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // The event listener list.
    protected def listenerList: EventListenerList = ???

    @stub
    // Adds a listener to track whenever the caret position has
    // been changed.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Scrolls the associated view (if necessary) to make
    // the caret visible.
    protected def adjustVisibility(nloc: Rectangle): Unit = ???

    @stub
    // Damages the area surrounding the caret to cause
    // it to be repainted in a new location.
    protected def damage(r: Rectangle): Unit = ???

    @stub
    // Called when the UI is being removed from the
    // interface of a JTextComponent.
    def deinstall(c: JTextComponent): Unit = ???

    @stub
    // Compares this object to the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Called when the component containing the caret gains
    // focus.
    def focusGained(e: FocusEvent): Unit = ???

    @stub
    // Called when the component containing the caret loses
    // focus.
    def focusLost(e: FocusEvent): Unit = ???

    @stub
    // Gets the caret blink rate.
    def getBlinkRate(): Int = ???

    @stub
    // Returns an array of all the change listeners
    // registered on this caret.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Gets the text editor component that this caret is
    // is bound to.
    protected def getComponent(): JTextComponent = ???

    @stub
    // Fetches the current position of the caret.
    def getDot(): Int = ???

    @stub
    // Returns the bias of the caret position.
    def getDotBias(): Position.Bias = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this caret.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Gets the saved caret position.
    def getMagicCaretPosition(): Point = ???

    @stub
    // Fetches the current position of the mark.
    def getMark(): Int = ???

    @stub
    // Returns the bias of the mark.
    def getMarkBias(): Position.Bias = ???

    @stub
    // Gets the painter for the Highlighter.
    protected def getSelectionPainter(): Highlighter.HighlightPainter = ???

    @stub
    // Gets the caret movement policy on document updates.
    def getUpdatePolicy(): Int = ???

    @stub
    // Called when the UI is being installed into the
    // interface of a JTextComponent.
    def install(c: JTextComponent): Unit = ???

    @stub
    // Determines if the caret is currently active.
    def isActive(): Boolean = ???

    @stub
    // Checks whether the current selection is visible.
    def isSelectionVisible(): Boolean = ???

    @stub
    // Indicates whether or not the caret is currently visible.
    def isVisible(): Boolean = ???

    @stub
    // Called when the mouse is clicked.
    def mouseClicked(e: MouseEvent): Unit = ???

    @stub
    // Moves the caret position
    // according to the mouse pointer's current
    // location.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Called when the mouse enters a region.
    def mouseEntered(e: MouseEvent): Unit = ???

    @stub
    // Called when the mouse exits a region.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Called when the mouse is moved.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // If button 1 is pressed, this is implemented to
    // request focus on the associated text component,
    // and to set the caret position.
    def mousePressed(e: MouseEvent): Unit = ???

    @stub
    // Called when the mouse is released.
    def mouseReleased(e: MouseEvent): Unit = ???

    @stub
    // Tries to move the position of the caret from
    // the coordinates of a mouse event, using viewToModel().
    protected def moveCaret(e: MouseEvent): Unit = ???

    @stub
    // Moves the caret position to the specified position,
    // with a forward bias.
    def moveDot(dot: Int): Unit = ???

    @stub
    // Moves the caret position to the specified position, with the
    // specified bias.
    def moveDot(dot: Int, dotBias: Position.Bias): Unit = ???

    @stub
    // Renders the caret as a vertical line.
    def paint(g: Graphics): Unit = ???

    @stub
    // Tries to set the position of the caret from
    // the coordinates of a mouse event, using viewToModel().
    protected def positionCaret(e: MouseEvent): Unit = ???

    @stub
    // Removes a listener that was tracking caret position changes.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Cause the caret to be painted.
    protected def repaint(): Unit = ???

    @stub
    // Sets the caret blink rate.
    def setBlinkRate(rate: Int): Unit = ???

    @stub
    // Sets the caret position and mark to the specified position,
    // with a forward bias.
    def setDot(dot: Int): Unit = ???

    @stub
    // Sets the caret position and mark to the specified position, with the
    // specified bias.
    def setDot(dot: Int, dotBias: Position.Bias): Unit = ???

    @stub
    // Saves the current caret position.
    def setMagicCaretPosition(p: Point): Unit = ???

    @stub
    // Changes the selection visibility.
    def setSelectionVisible(vis: Boolean): Unit = ???

    @stub
    // Sets the caret movement policy on the document updates.
    def setUpdatePolicy(policy: Int): Unit = ???

    @stub
    // Sets the caret visibility, and repaints the caret.
    def setVisible(e: Boolean): Unit = ???
}

object DefaultCaret {
    @stub
    // Indicates that the caret position is to be always
    // updated accordingly to the document changes regardless whether
    // the document updates are performed on the Event Dispatching Thread
    // or not.
    def ALWAYS_UPDATE: Int = ???

    @stub
    // Indicates that the caret should remain at the same
    // absolute position in the document regardless of any document
    // updates, except when the document length becomes less than
    // the current caret position due to removal.
    def NEVER_UPDATE: Int = ???
}
