package java.awt

import java.awt.event.{ItemEvent, ItemListener}
import java.lang.{Class, Object, String}
import java.util.EventListener
import javax.accessibility.{Accessible, AccessibleContext}

// A check box is a graphical component that can be in either an
// "on" (true) or "off" (false) state.
// Clicking on a check box changes its state from
// "on" to "off," or from "off" to "on."
// 
// The following code example creates a set of check boxes in
// a grid layout:
//
// 
// setLayout(new GridLayout(3, 1));
// add(new Checkbox("one", null, true));
// add(new Checkbox("two"));
// add(new Checkbox("three"));
// 
// 
// This image depicts the check boxes and grid layout
// created by this code example:
// 
// 
// 
// The button labeled one is in the "on" state, and the
// other two are in the "off" state. In this example, which uses the
// GridLayout class, the states of the three check
// boxes are set independently.
// 
// Alternatively, several check boxes can be grouped together under
// the control of a single object, using the
// CheckboxGroup class.
// In a check box group, at most one button can be in the "on"
// state at any given time. Clicking on a check box to turn it on
// forces any other check box in the same group that is on
// into the "off" state.
class Checkbox extends Component with ItemSelectable, with Accessible {

    @stub
    // Creates a check box with an empty string for its label.
    def this() = ???

    @stub
    // Creates a check box with the specified label.
    def this(label: String) = ???

    @stub
    // Creates a check box with the specified label
    // and sets the specified state.
    def this(label: String, state: Boolean) = ???

    @stub
    // Constructs a Checkbox with the specified label, set to the
    // specified state, and in the specified check box group.
    def this(label: String, state: Boolean, group: CheckboxGroup) = ???

    @stub
    // Adds the specified item listener to receive item events from
    // this check box.
    def addItemListener(l: ItemListener): Unit = ???

    @stub
    // Creates the peer of the Checkbox.
    def addNotify(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Checkbox.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Determines this check box's group.
    def getCheckboxGroup(): CheckboxGroup = ???

    @stub
    // Returns an array of all the item listeners
    // registered on this checkbox.
    def getItemListeners(): Array[ItemListener] = ???

    @stub
    // Gets the label of this check box.
    def getLabel(): String = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Checkbox.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Returns an array (length 1) containing the checkbox
    // label or null if the checkbox is not selected.
    def getSelectedObjects(): Array[Object] = ???

    @stub
    // Determines whether this check box is in the "on" or "off" state.
    def getState(): Boolean = ???

    @stub
    // Returns a string representing the state of this Checkbox.
    protected def paramString(): String = ???

    @stub
    // Processes events on this check box.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes item events occurring on this check box by
    // dispatching them to any registered
    // ItemListener objects.
    protected def processItemEvent(e: ItemEvent): Unit = ???

    @stub
    // Removes the specified item listener so that the item listener
    // no longer receives item events from this check box.
    def removeItemListener(l: ItemListener): Unit = ???

    @stub
    // Sets this check box's group to the specified check box group.
    def setCheckboxGroup(g: CheckboxGroup): Unit = ???

    @stub
    // Sets this check box's label to be the string argument.
    def setLabel(label: String): Unit = ???
}
