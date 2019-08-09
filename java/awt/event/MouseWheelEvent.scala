package java.awt.event

import java.awt.{AWTEvent, Component}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An event which indicates that the mouse wheel was rotated in a component.
 *  
 *  A wheel mouse is a mouse which has a wheel in place of the middle button.
 *  This wheel can be rotated towards or away from the user.  Mouse wheels are
 *  most often used for scrolling, though other uses are possible.
 *  
 *  A MouseWheelEvent object is passed to every MouseWheelListener
 *  object which registered to receive the "interesting" mouse events using the
 *  component's addMouseWheelListener method.  Each such listener
 *  object gets a MouseEvent containing the mouse event.
 *  
 *  Due to the mouse wheel's special relationship to scrolling Components,
 *  MouseWheelEvents are delivered somewhat differently than other MouseEvents.
 *  This is because while other MouseEvents usually affect a change on
 *  the Component directly under the mouse
 *  cursor (for instance, when clicking a button), MouseWheelEvents often have
 *  an effect away from the mouse cursor (moving the wheel while
 *  over a Component inside a ScrollPane should scroll one of the
 *  Scrollbars on the ScrollPane).
 *  
 *  MouseWheelEvents start delivery from the Component underneath the
 *  mouse cursor.  If MouseWheelEvents are not enabled on the
 *  Component, the event is delivered to the first ancestor
 *  Container with MouseWheelEvents enabled.  This will usually be
 *  a ScrollPane with wheel scrolling enabled.  The source
 *  Component and x,y coordinates will be relative to the event's
 *  final destination (the ScrollPane).  This allows a complex
 *  GUI to be installed without modification into a ScrollPane, and
 *  for all MouseWheelEvents to be delivered to the ScrollPane for
 *  scrolling.
 *  
 *  Some AWT Components are implemented using native widgets which
 *  display their own scrollbars and handle their own scrolling.
 *  The particular Components for which this is true will vary from
 *  platform to platform.  When the mouse wheel is
 *  moved over one of these Components, the event is delivered straight to
 *  the native widget, and not propagated to ancestors.
 *  
 *  Platforms offer customization of the amount of scrolling that
 *  should take place when the mouse wheel is moved.  The two most
 *  common settings are to scroll a certain number of "units"
 *  (commonly lines of text in a text-based component) or an entire "block"
 *  (similar to page-up/page-down).  The MouseWheelEvent offers
 *  methods for conforming to the underlying platform settings.  These
 *  platform settings can be changed at any time by the user.  MouseWheelEvents
 *  reflect the most recent settings.
 *  
 *  The MouseWheelEvent class includes methods for
 *  getting the number of "clicks" by which the mouse wheel is rotated.
 *  The getWheelRotation() method returns the integer number
 *  of "clicks" corresponding to the number of notches by which the wheel was
 *  rotated. In addition to this method, the MouseWheelEvent
 *  class provides the getPreciseWheelRotation() method which returns
 *  a double number of "clicks" in case a partial rotation occurred.
 *  The getPreciseWheelRotation() method is useful if a mouse supports
 *  a high-resolution wheel, such as a freely rotating wheel with no
 *  notches. Applications can benefit by using this method to process
 *  mouse wheel events more precisely, and thus, making visual perception
 *  smoother.
 */
class MouseWheelEvent extends MouseEvent {

    /** Constructs a MouseWheelEvent object with the
     *  specified source component, type, modifiers, coordinates,
     *  scroll type, scroll amount, and wheel rotation.
     */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, clickCount: Int, popupTrigger: Boolean, scrollType: Int, scrollAmount: Int, wheelRotation: Int) = ???

    /** Constructs a MouseWheelEvent object with the
     *  specified source component, type, modifiers, coordinates,
     *  absolute coordinates, scroll type, scroll amount, and wheel rotation.
     */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, xAbs: Int, yAbs: Int, clickCount: Int, popupTrigger: Boolean, scrollType: Int, scrollAmount: Int, wheelRotation: Int) = ???

    /** Constructs a MouseWheelEvent object with the specified
     *  source component, type, modifiers, coordinates, absolute coordinates,
     *  scroll type, scroll amount, and wheel rotation.
     */
    @stub
    def this(source: Component, id: Int, when: Long, modifiers: Int, x: Int, y: Int, xAbs: Int, yAbs: Int, clickCount: Int, popupTrigger: Boolean, scrollType: Int, scrollAmount: Int, wheelRotation: Int, preciseWheelRotation: Double) = ???

    /** Returns the number of "clicks" the mouse wheel was rotated, as a double. */
    @stub
    def getPreciseWheelRotation(): Double = ???

    /** Returns the number of units that should be scrolled per
     *  click of mouse wheel rotation.
     */
    @stub
    def getScrollAmount(): Int = ???

    /** Returns the type of scrolling that should take place in response to this
     *  event.
     */
    @stub
    def getScrollType(): Int = ???

    /** This is a convenience method to aid in the implementation of
     *  the common-case MouseWheelListener - to scroll a ScrollPane or
     *  JScrollPane by an amount which conforms to the platform settings.
     */
    @stub
    def getUnitsToScroll(): Int = ???

    /** Returns the number of "clicks" the mouse wheel was rotated, as an integer. */
    @stub
    def getWheelRotation(): Int = ???

    /** Returns a parameter string identifying this event. */
    @stub
    def paramString(): String = ???
}

object MouseWheelEvent {
    /** Constant representing scrolling by a "block" (like scrolling
     *  with page-up, page-down keys)
     */
    @stub
    val WHEEL_BLOCK_SCROLL: Int = ???

    /** Constant representing scrolling by "units" (like scrolling with the
     *  arrow keys)
     */
    @stub
    val WHEEL_UNIT_SCROLL: Int = ???
}
