package javax.swing

import java.io.Serializable
import java.lang.Object
import java.util.Enumeration

/** This class is used to create a multiple-exclusion scope for
 *  a set of buttons. Creating a set of buttons with the
 *  same ButtonGroup object means that
 *  turning "on" one of those buttons
 *  turns off all other buttons in the group.
 *  
 *  A ButtonGroup can be used with
 *  any set of objects that inherit from AbstractButton.
 *  Typically a button group contains instances of
 *  JRadioButton,
 *  JRadioButtonMenuItem,
 *  or JToggleButton.
 *  It wouldn't make sense to put an instance of
 *  JButton or JMenuItem
 *  in a button group
 *  because JButton and JMenuItem
 *  don't implement the selected state.
 *  
 *  Initially, all buttons in the group are unselected.
 *  
 *  For examples and further information on using button groups see
 *  How to Use Radio Buttons,
 *  a section in The Java Tutorial.
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
class ButtonGroup extends Object with Serializable {

    /** Adds the button to the group. */
    @stub
    def add(b: AbstractButton): Unit = ???

    /** Clears the selection such that none of the buttons
     *  in the ButtonGroup are selected.
     */
    @stub
    def clearSelection(): Unit = ???

    /** Returns the number of buttons in the group. */
    @stub
    def getButtonCount(): Int = ???

    /** Returns all the buttons that are participating in
     *  this group.
     */
    @stub
    def getElements(): Enumeration[AbstractButton] = ???

    /** Returns the model of the selected button. */
    @stub
    def getSelection(): ButtonModel = ???

    /** Returns whether a ButtonModel is selected. */
    @stub
    def isSelected(m: ButtonModel): Boolean = ???

    /** Removes the button from the group. */
    @stub
    def remove(b: AbstractButton): Unit = ???
}
