package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A check box is a graphical component that can be in either an
 *  "on" (true) or "off" (false) state.
 *  Clicking on a check box changes its state from
 *  "on" to "off," or from "off" to "on."
 *  
 *  The following code example creates a set of check boxes in
 *  a grid layout:
 * 
 *  
 *  setLayout(new GridLayout(3, 1));
 *  add(new Checkbox("one", null, true));
 *  add(new Checkbox("two"));
 *  add(new Checkbox("three"));
 *  
 *  
 *  This image depicts the check boxes and grid layout
 *  created by this code example:
 *  
 *  
 *  
 *  The button labeled one is in the "on" state, and the
 *  other two are in the "off" state. In this example, which uses the
 *  GridLayout class, the states of the three check
 *  boxes are set independently.
 *  
 *  Alternatively, several check boxes can be grouped together under
 *  the control of a single object, using the
 *  CheckboxGroup class.
 *  In a check box group, at most one button can be in the "on"
 *  state at any given time. Clicking on a check box to turn it on
 *  forces any other check box in the same group that is on
 *  into the "off" state.
 */
class Checkbox extends Component with ItemSelectable with Accessible {

    /** Creates a check box with an empty string for its label. */
    @stub
    def this() = ???

    /** Creates a check box with the specified label. */
    @stub
    def this(label: String) = ???

    /** Creates a check box with the specified label
     *  and sets the specified state.
     */
    @stub
    def this(label: String, state: Boolean) = ???

    /** Constructs a Checkbox with the specified label, set to the
     *  specified state, and in the specified check box group.
     */
    @stub
    def this(label: String, state: Boolean, group: CheckboxGroup) = ???

    /** Creates a check box with the specified label, in the specified
     *  check box group, and set to the specified state.
     */
    @stub
    def this(label: String, group: CheckboxGroup, state: Boolean) = ???

    /** This class implements accessibility support for the
     *  Checkbox class.
     */
    @stub
    protected object AccessibleAWTCheckbox extends Checkbox.AccessibleAWTCheckbox

    /** Adds the specified item listener to receive item events from
     *  this check box.
     */
    @stub
    def addItemListener(l: ItemListener): Unit = ???

    /** Creates the peer of the Checkbox. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the AccessibleContext associated with this Checkbox. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Determines this check box's group. */
    @stub
    def getCheckboxGroup(): CheckboxGroup = ???

    /** Returns an array of all the item listeners
     *  registered on this checkbox.
     */
    @stub
    def getItemListeners(): Array[ItemListener] = ???

    /** Gets the label of this check box. */
    @stub
    def getLabel(): String = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Checkbox.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Returns an array (length 1) containing the checkbox
     *  label or null if the checkbox is not selected.
     */
    @stub
    def getSelectedObjects(): Array[Object] = ???

    /** Determines whether this check box is in the "on" or "off" state. */
    @stub
    def getState(): Boolean = ???

    /** Returns a string representing the state of this Checkbox. */
    @stub
    protected def paramString(): String = ???

    /** Processes events on this check box. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes item events occurring on this check box by
     *  dispatching them to any registered
     *  ItemListener objects.
     */
    @stub
    protected def processItemEvent(e: ItemEvent): Unit = ???

    /** Removes the specified item listener so that the item listener
     *  no longer receives item events from this check box.
     */
    @stub
    def removeItemListener(l: ItemListener): Unit = ???

    /** Sets this check box's group to the specified check box group. */
    @stub
    def setCheckboxGroup(g: CheckboxGroup): Unit = ???

    /** Sets this check box's label to be the string argument. */
    @stub
    def setLabel(label: String): Unit = ???

    /** Sets the state of this check box to the specified state. */
    @stub
    def setState(state: Boolean): Unit = ???
}
