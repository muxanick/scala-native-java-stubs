package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}
import javax.swing.event.{ChangeEvent, ChangeListener}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JTabbedPane class.  It provides an implementation of the
 *  Java Accessibility API appropriate to tabbed pane user-interface
 *  elements.
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
protected class JTabbedPane.AccessibleJTabbedPane extends JComponent.AccessibleJComponent with AccessibleSelection with ChangeListener {

    /** Constructs an AccessibleJTabbedPane */
    @stub
    def AccessibleJTabbedPane() = ???

    /** Adds the specified Accessible child of the object to the object's
     *  selection.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that no children in the
     *  object are selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Returns the Accessible child contained at
     *  the local coordinate Point, if one exists.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the specified Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Returns the accessible name of this object, or null if
     *  there is no accessible name.
     */
    @stub
    def getAccessibleName(): String = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleSelection associated with
     *  this object.
     */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns an Accessible representing the specified selected child
     *  of the object.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns the number of Accessible children currently selected. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Determines if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Removes the specified child of the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Causes every child of the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
