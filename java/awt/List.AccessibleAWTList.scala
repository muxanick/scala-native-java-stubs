package java.awt

import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  List class.  It provides an implementation of the
 *  Java Accessibility API appropriate to list user-interface elements.
 */
protected class List.AccessibleAWTList extends Component.AccessibleAWTComponent with AccessibleSelection with ItemListener with ActionListener {

    /**  */
    @stub
    def AccessibleAWTList() = ???

    /** This class implements accessibility support for
     *  List children.
     */
    @stub
    protected object AccessibleAWTListChild extends List.AccessibleAWTList.AccessibleAWTListChild

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(event: ActionEvent): Unit = ???

    /** Adds the specified selected item in the object to the object's
     *  selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that nothing in the
     *  object is selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Returns the Accessible child contained at the local coordinate
     *  Point, if one exists.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the AccessibleSelection associated with this object. */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the specified selected item
     *  in the object.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of items currently selected. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Returns true if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Invoked when an item has been selected or deselected by the user. */
    @stub
    def itemStateChanged(event: ItemEvent): Unit = ???

    /** Removes the specified selected item in the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Causes every selected item in the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???
}
