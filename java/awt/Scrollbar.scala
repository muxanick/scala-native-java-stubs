package java.awt

import java.awt.event.{AdjustmentEvent, AdjustmentListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// The Scrollbar class embodies a scroll bar, a
// familiar user-interface object. A scroll bar provides a
// convenient means for allowing a user to select from a
// range of values. The following three vertical
// scroll bars could be used as slider controls to pick
// the red, green, and blue components of a color:
// 
// 
// 
// Each scroll bar in this example could be created with
// code similar to the following:
//
// 
// redSlider=new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 255);
// add(redSlider);
// 
// 
// Alternatively, a scroll bar can represent a range of values. For
// example, if a scroll bar is used for scrolling through text, the
// width of the "bubble" (also called the "thumb" or "scroll box")
// can be used to represent the amount of text that is visible.
// Here is an example of a scroll bar that represents a range:
// 
// 
// 
// The value range represented by the bubble in this example
// is the visible amount. The horizontal scroll bar
// in this example could be created with code like the following:
//
// 
// ranger = new Scrollbar(Scrollbar.HORIZONTAL, 0, 60, 0, 300);
// add(ranger);
// 
// 
// Note that the actual maximum value of the scroll bar is the
// maximum minus the visible amount.
// In the previous example, because the maximum is
// 300 and the visible amount is 60, the actual maximum
// value is 240.  The range of the scrollbar track is 0 - 300.
// The left side of the bubble indicates the value of the
// scroll bar.
// 
// Normally, the user changes the value of the scroll bar by
// making a gesture with the mouse. For example, the user can
// drag the scroll bar's bubble up and down, or click in the
// scroll bar's unit increment or block increment areas. Keyboard
// gestures can also be mapped to the scroll bar. By convention,
// the Page Up and Page Down
// keys are equivalent to clicking in the scroll bar's block
// increment and block decrement areas.
// 
// When the user changes the value of the scroll bar, the scroll bar
// receives an instance of AdjustmentEvent.
// The scroll bar processes this event, passing it along to
// any registered listeners.
// 
// Any object that wishes to be notified of changes to the
// scroll bar's value should implement
// AdjustmentListener, an interface defined in
// the package java.awt.event.
// Listeners can be added and removed dynamically by calling
// the methods addAdjustmentListener and
// removeAdjustmentListener.
// 
// The AdjustmentEvent class defines five types
// of adjustment event, listed here:
//
// 
// AdjustmentEvent.TRACK is sent out when the
// user drags the scroll bar's bubble.
// AdjustmentEvent.UNIT_INCREMENT is sent out
// when the user clicks in the left arrow of a horizontal scroll
// bar, or the top arrow of a vertical scroll bar, or makes the
// equivalent gesture from the keyboard.
// AdjustmentEvent.UNIT_DECREMENT is sent out
// when the user clicks in the right arrow of a horizontal scroll
// bar, or the bottom arrow of a vertical scroll bar, or makes the
// equivalent gesture from the keyboard.
// AdjustmentEvent.BLOCK_INCREMENT is sent out
// when the user clicks in the track, to the left of the bubble
// on a horizontal scroll bar, or above the bubble on a vertical
// scroll bar. By convention, the Page Up
// key is equivalent, if the user is using a keyboard that
// defines a Page Up key.
// AdjustmentEvent.BLOCK_DECREMENT is sent out
// when the user clicks in the track, to the right of the bubble
// on a horizontal scroll bar, or below the bubble on a vertical
// scroll bar. By convention, the Page Down
// key is equivalent, if the user is using a keyboard that
// defines a Page Down key.
// 
// 
// The JDK 1.0 event system is supported for backwards
// compatibility, but its use with newer versions of the platform is
// discouraged. The five types of adjustment events introduced
// with JDK 1.1 correspond to the five event types
// that are associated with scroll bars in previous platform versions.
// The following list gives the adjustment event type,
// and the corresponding JDK 1.0 event type it replaces.
//
// 
// AdjustmentEvent.TRACK replaces
// Event.SCROLL_ABSOLUTE
// AdjustmentEvent.UNIT_INCREMENT replaces
// Event.SCROLL_LINE_UP
// AdjustmentEvent.UNIT_DECREMENT replaces
// Event.SCROLL_LINE_DOWN
// AdjustmentEvent.BLOCK_INCREMENT replaces
// Event.SCROLL_PAGE_UP
// AdjustmentEvent.BLOCK_DECREMENT replaces
// Event.SCROLL_PAGE_DOWN
// 
// 
// Note: We recommend using a Scrollbar
// for value selection only.  If you want to implement
// a scrollable component inside a container, we recommend you use
// a ScrollPane. If you use a
// Scrollbar for this purpose, you are likely to
// encounter issues with painting, key handling, sizing and
// positioning.
class Scrollbar extends Component with Adjustable, with Accessible {

    @stub
    // Constructs a new vertical scroll bar.
    def this() = ???

    @stub
    // Constructs a new scroll bar with the specified orientation.
    def this(orientation: Int) = ???

    @stub
    // Adds the specified adjustment listener to receive instances of
    // AdjustmentEvent from this scroll bar.
    def addAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Creates the Scrollbar's peer.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // Scrollbar.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the adjustment listeners
    // registered on this scrollbar.
    def getAdjustmentListeners(): Array[AdjustmentListener] = ???

    @stub
    // Gets the block increment of this scroll bar.
    def getBlockIncrement(): Int = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getUnitIncrement().
    //
    def getLineIncrement(): Int = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Scrollbar.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Gets the maximum value of this scroll bar.
    def getMaximum(): Int = ???

    @stub
    // Gets the minimum value of this scroll bar.
    def getMinimum(): Int = ???

    @stub
    // Returns the orientation of this scroll bar.
    def getOrientation(): Int = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getBlockIncrement().
    //
    def getPageIncrement(): Int = ???

    @stub
    // Gets the unit increment for this scrollbar.
    def getUnitIncrement(): Int = ???

    @stub
    // Gets the current value of this scroll bar.
    def getValue(): Int = ???

    @stub
    // Returns true if the value is in the process of changing as a
    // result of actions being taken by the user.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getVisibleAmount().
    //
    def getVisible(): Int = ???

    @stub
    // Gets the visible amount of this scroll bar.
    def getVisibleAmount(): Int = ???

    @stub
    // Returns a string representing the state of this Scrollbar.
    protected def paramString(): String = ???

    @stub
    // Processes adjustment events occurring on this
    // scrollbar by dispatching them to any registered
    // AdjustmentListener objects.
    protected def processAdjustmentEvent(e: AdjustmentEvent): Unit = ???

    @stub
    // Processes events on this scroll bar.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Removes the specified adjustment listener so that it no longer
    // receives instances of AdjustmentEvent from this scroll bar.
    def removeAdjustmentListener(l: AdjustmentListener): Unit = ???

    @stub
    // Sets the block increment for this scroll bar.
    def setBlockIncrement(v: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setUnitIncrement(int).
    //
    def setLineIncrement(v: Int): Unit = ???

    @stub
    // Sets the maximum value of this scroll bar.
    def setMaximum(newMaximum: Int): Unit = ???

    @stub
    // Sets the minimum value of this scroll bar.
    def setMinimum(newMinimum: Int): Unit = ???

    @stub
    // Sets the orientation for this scroll bar.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setBlockIncrement().
    //
    def setPageIncrement(v: Int): Unit = ???

    @stub
    // Sets the unit increment for this scroll bar.
    def setUnitIncrement(v: Int): Unit = ???

    @stub
    // Sets the value of this scroll bar to the specified value.
    def setValue(newValue: Int): Unit = ???

    @stub
    // Sets the valueIsAdjusting property.
    def setValueIsAdjusting(b: Boolean): Unit = ???

    @stub
    // Sets the values of four properties for this scroll bar:
    // value, visibleAmount,
    // minimum, and maximum.
    def setValues(value: Int, visible: Int, minimum: Int, maximum: Int): Unit = ???
}

object Scrollbar {
    @stub
    // A constant that indicates a horizontal scroll bar.
    def HORIZONTAL: Int = ???
}
