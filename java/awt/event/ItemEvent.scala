package java.awt.event

import java.awt.{AWTEvent, ItemSelectable}
import java.lang.{Object, String}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** A semantic event which indicates that an item was selected or deselected.
 *  This high-level event is generated by an ItemSelectable object (such as a
 *  List) when an item is selected or deselected by the user.
 *  The event is passed to every ItemListener object which
 *  registered to receive such events using the component's
 *  addItemListener method.
 *  
 *  The object that implements the ItemListener interface gets
 *  this ItemEvent when the event occurs. The listener is
 *  spared the details of processing individual mouse movements and mouse
 *  clicks, and can instead process a "meaningful" (semantic) event like
 *  "item selected" or "item deselected".
 *  
 *  An unspecified behavior will be caused if the id parameter
 *  of any particular ItemEvent instance is not
 *  in the range from ITEM_FIRST to ITEM_LAST.
 *  
 *  The stateChange of any ItemEvent instance takes one of the following
 *  values:
 *                      
 *                       ItemEvent.SELECTED
 *                       ItemEvent.DESELECTED
 *                      
 *  Assigning the value different from listed above will cause an unspecified behavior.
 */
class ItemEvent extends AWTEvent {

    /** Constructs an ItemEvent object. */
    @stub
    def this(source: ItemSelectable, id: Int, item: Any, stateChange: Int) = ???

    /** Returns the item affected by the event. */
    @stub
    def getItem(): Any = ???

    /** Returns the originator of the event. */
    @stub
    def getItemSelectable(): ItemSelectable = ???

    /** Returns the type of state change (selected or deselected). */
    @stub
    def getStateChange(): Int = ???

    /** Returns a parameter string identifying this item event. */
    @stub
    def paramString(): String = ???
}

object ItemEvent {
    /** This state-change-value indicates that a selected item was deselected. */
    @stub
    val DESELECTED: Int = ???

    /** The first number in the range of ids used for item events. */
    @stub
    val ITEM_FIRST: Int = ???

    /** The last number in the range of ids used for item events. */
    @stub
    val ITEM_LAST: Int = ???

    /** This event id indicates that an item's state changed. */
    @stub
    val ITEM_STATE_CHANGED: Int = ???

    /** This state-change value indicates that an item was selected. */
    @stub
    val SELECTED: Int = ???
}
