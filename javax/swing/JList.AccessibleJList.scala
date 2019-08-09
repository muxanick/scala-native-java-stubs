package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import javax.swing.event.{ListDataEvent, ListDataListener, ListSelectionListener}

/** This class implements accessibility support for the
 *  JList class. It provides an implementation of the
 *  Java Accessibility API appropriate to list user-interface
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
protected class JList.AccessibleJList extends JComponent.AccessibleJComponent with AccessibleSelection with PropertyChangeListener with ListSelectionListener with ListDataListener {

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

    /** List Data Listener contents changed method. */
    @stub
    def contentsChanged(e: ListDataEvent): Unit = ???

    /** Returns the Accessible child contained at
     *  the local coordinate Point, if one exists.
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

    /** List Data Listener interval added method. */
    @stub
    def intervalAdded(e: ListDataEvent): Unit = ???

    /** List Data Listener interval removed method. */
    @stub
    def intervalRemoved(e: ListDataEvent): Unit = ???

    /** Returns true if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Property Change Listener change method. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

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
