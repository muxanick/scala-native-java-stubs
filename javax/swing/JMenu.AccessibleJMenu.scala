package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}

/** This class implements accessibility support for the
 *  JMenu class.  It provides an implementation of the
 *  Java Accessibility API appropriate to menu user-interface elements.
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
protected class JMenu.AccessibleJMenu extends JMenuItem.AccessibleJMenuItem with AccessibleSelection {

    /** Selects the ith menu in the menu. */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that nothing in the
     *  object is selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Returns the nth Accessible child of the object. */
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

    /** Returns the currently selected sub-menu if one is selected,
     *  otherwise null (there can only be one selection, and it can
     *  only be a sub-menu, as otherwise menu items don't remain
     *  selected).
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns 1 if a sub-menu is currently selected in this menu. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Returns true if the current child of this object is selected
     *  (that is, if this child is a popped-up submenu).
     */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Removes the nth item from the selection. */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???
}
