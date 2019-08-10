package java.awt

import java.awt.event.{AdjustmentEvent, AdjustmentListener}
import java.lang.{Class, Number, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleValue}
import scala.scalanative.annotation.stub

/** The Scrollbar class embodies a scroll bar, a
 *  familiar user-interface object. A scroll bar provides a
 *  convenient means for allowing a user to select from a
 *  range of values. The following three vertical
 *  scroll bars could be used as slider controls to pick
 *  the red, green, and blue components of a color:
 *  
 *  
 *  
 *  Each scroll bar in this example could be created with
 *  code similar to the following:
 * 
 *  
 *  redSlider=new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 255);
 *  add(redSlider);
 *  
 *  
 *  Alternatively, a scroll bar can represent a range of values. For
 *  example, if a scroll bar is used for scrolling through text, the
 *  width of the "bubble" (also called the "thumb" or "scroll box")
 *  can be used to represent the amount of text that is visible.
 *  Here is an example of a scroll bar that represents a range:
 *  
 *  
 *  
 *  The value range represented by the bubble in this example
 *  is the visible amount. The horizontal scroll bar
 *  in this example could be created with code like the following:
 * 
 *  
 *  ranger = new Scrollbar(Scrollbar.HORIZONTAL, 0, 60, 0, 300);
 *  add(ranger);
 *  
 *  
 *  Note that the actual maximum value of the scroll bar is the
 *  maximum minus the visible amount.
 *  In the previous example, because the maximum is
 *  300 and the visible amount is 60, the actual maximum
 *  value is 240.  The range of the scrollbar track is 0 - 300.
 *  The left side of the bubble indicates the value of the
 *  scroll bar.
 *  
 *  Normally, the user changes the value of the scroll bar by
 *  making a gesture with the mouse. For example, the user can
 *  drag the scroll bar's bubble up and down, or click in the
 *  scroll bar's unit increment or block increment areas. Keyboard
 *  gestures can also be mapped to the scroll bar. By convention,
 *  the Page Up and Page Down
 *  keys are equivalent to clicking in the scroll bar's block
 *  increment and block decrement areas.
 *  
 *  When the user changes the value of the scroll bar, the scroll bar
 *  receives an instance of AdjustmentEvent.
 *  The scroll bar processes this event, passing it along to
 *  any registered listeners.
 *  
 *  Any object that wishes to be notified of changes to the
 *  scroll bar's value should implement
 *  AdjustmentListener, an interface defined in
 *  the package java.awt.event.
 *  Listeners can be added and removed dynamically by calling
 *  the methods addAdjustmentListener and
 *  removeAdjustmentListener.
 *  
 *  The AdjustmentEvent class defines five types
 *  of adjustment event, listed here:
 * 
 *  
 *  AdjustmentEvent.TRACK is sent out when the
 *  user drags the scroll bar's bubble.
 *  AdjustmentEvent.UNIT_INCREMENT is sent out
 *  when the user clicks in the left arrow of a horizontal scroll
 *  bar, or the top arrow of a vertical scroll bar, or makes the
 *  equivalent gesture from the keyboard.
 *  AdjustmentEvent.UNIT_DECREMENT is sent out
 *  when the user clicks in the right arrow of a horizontal scroll
 *  bar, or the bottom arrow of a vertical scroll bar, or makes the
 *  equivalent gesture from the keyboard.
 *  AdjustmentEvent.BLOCK_INCREMENT is sent out
 *  when the user clicks in the track, to the left of the bubble
 *  on a horizontal scroll bar, or above the bubble on a vertical
 *  scroll bar. By convention, the Page Up
 *  key is equivalent, if the user is using a keyboard that
 *  defines a Page Up key.
 *  AdjustmentEvent.BLOCK_DECREMENT is sent out
 *  when the user clicks in the track, to the right of the bubble
 *  on a horizontal scroll bar, or below the bubble on a vertical
 *  scroll bar. By convention, the Page Down
 *  key is equivalent, if the user is using a keyboard that
 *  defines a Page Down key.
 *  
 *  
 *  The JDK 1.0 event system is supported for backwards
 *  compatibility, but its use with newer versions of the platform is
 *  discouraged. The five types of adjustment events introduced
 *  with JDK 1.1 correspond to the five event types
 *  that are associated with scroll bars in previous platform versions.
 *  The following list gives the adjustment event type,
 *  and the corresponding JDK 1.0 event type it replaces.
 * 
 *  
 *  AdjustmentEvent.TRACK replaces
 *  Event.SCROLL_ABSOLUTE
 *  AdjustmentEvent.UNIT_INCREMENT replaces
 *  Event.SCROLL_LINE_UP
 *  AdjustmentEvent.UNIT_DECREMENT replaces
 *  Event.SCROLL_LINE_DOWN
 *  AdjustmentEvent.BLOCK_INCREMENT replaces
 *  Event.SCROLL_PAGE_UP
 *  AdjustmentEvent.BLOCK_DECREMENT replaces
 *  Event.SCROLL_PAGE_DOWN
 *  
 *  
 *  Note: We recommend using a Scrollbar
 *  for value selection only.  If you want to implement
 *  a scrollable component inside a container, we recommend you use
 *  a ScrollPane. If you use a
 *  Scrollbar for this purpose, you are likely to
 *  encounter issues with painting, key handling, sizing and
 *  positioning.
 */
class Scrollbar extends Component with Adjustable with Accessible {

    /** Constructs a new vertical scroll bar. */
    @stub
    def this() = ???

    /** Constructs a new scroll bar with the specified orientation. */
    @stub
    def this(orientation: Int) = ???

    /** Constructs a new scroll bar with the specified orientation,
     *  initial value, visible amount, and minimum and maximum values.
     */
    @stub
    def this(orientation: Int, value: Int, visible: Int, minimum: Int, maximum: Int) = ???

    /** This class implements accessibility support for the
     *  Scrollbar class.  It provides an implementation of
     *  the Java Accessibility API appropriate to scrollbar
     *  user-interface elements.
     */
    protected class AccessibleAWTScrollBar extends Component.AccessibleAWTComponent with AccessibleValue {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Get the AccessibleValue associated with this
         *  object.
         */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Get the accessible value of this object. */
        @stub
        def getCurrentAccessibleValue(): Number = ???

        /** Get the maximum accessible value of this object. */
        @stub
        def getMaximumAccessibleValue(): Number = ???

        /** Get the minimum accessible value of this object. */
        @stub
        def getMinimumAccessibleValue(): Number = ???

        /** Set the value of this object as a Number. */
        @stub
        def setCurrentAccessibleValue(n: Number): Boolean = ???
    }


    /** Adds the specified adjustment listener to receive instances of
     *  AdjustmentEvent from this scroll bar.
     */
    @stub
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Creates the Scrollbar's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  Scrollbar.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the adjustment listeners
     *  registered on this scrollbar.
     */
    @stub
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

    /** Gets the block increment of this scroll bar. */
    @stub
    def getBlockIncrement(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getUnitIncrement().
     * 
     */
    @stub
    def getLineIncrement(): Int = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Scrollbar.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Gets the maximum value of this scroll bar. */
    @stub
    def getMaximum(): Int = ???

    /** Gets the minimum value of this scroll bar. */
    @stub
    def getMinimum(): Int = ???

    /** Returns the orientation of this scroll bar. */
    @stub
    def getOrientation(): Int = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getBlockIncrement().
     * 
     */
    @stub
    def getPageIncrement(): Int = ???

    /** Gets the unit increment for this scrollbar. */
    @stub
    def getUnitIncrement(): Int = ???

    /** Gets the current value of this scroll bar. */
    @stub
    def getValue(): Int = ???

    /** Returns true if the value is in the process of changing as a
     *  result of actions being taken by the user.
     */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getVisibleAmount().
     * 
     */
    @stub
    def getVisible(): Int = ???

    /** Gets the visible amount of this scroll bar. */
    @stub
    def getVisibleAmount(): Int = ???

    /** Returns a string representing the state of this Scrollbar. */
    @stub
    protected def paramString(): String = ???

    /** Processes adjustment events occurring on this
     *  scrollbar by dispatching them to any registered
     *  AdjustmentListener objects.
     */
    @stub
    protected def processAdjustmentEvent(e: AdjustmentEvent): Unit = ???

    /** Processes events on this scroll bar. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Removes the specified adjustment listener so that it no longer
     *  receives instances of AdjustmentEvent from this scroll bar.
     */
    @stub
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    /** Sets the block increment for this scroll bar. */
    @stub
    def setBlockIncrement(v: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setUnitIncrement(int).
     * 
     */
    @stub
    def setLineIncrement(v: Int): Unit = ???

    /** Sets the maximum value of this scroll bar. */
    @stub
    def setMaximum(newMaximum: Int): Unit = ???

    /** Sets the minimum value of this scroll bar. */
    @stub
    def setMinimum(newMinimum: Int): Unit = ???

    /** Sets the orientation for this scroll bar. */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setBlockIncrement().
     * 
     */
    @stub
    def setPageIncrement(v: Int): Unit = ???

    /** Sets the unit increment for this scroll bar. */
    @stub
    def setUnitIncrement(v: Int): Unit = ???

    /** Sets the value of this scroll bar to the specified value. */
    @stub
    def setValue(newValue: Int): Unit = ???

    /** Sets the valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???

    /** Sets the values of four properties for this scroll bar:
     *  value, visibleAmount,
     *  minimum, and maximum.
     */
    @stub
    def setValues(value: Int, visible: Int, minimum: Int, maximum: Int): Unit = ???

    /** Sets the visible amount of this scroll bar. */
    @stub
    def setVisibleAmount(newAmount: Int): Unit = ???
}

object Scrollbar {
    /** A constant that indicates a horizontal scroll bar. */
    @stub
    val HORIZONTAL: Int = ???

    /** A constant that indicates a vertical scroll bar. */
    @stub
    val VERTICAL: Int = ???
}
