package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection}

// This class implements accessibility support for the
// JMenu class.  It provides an implementation of the
// Java Accessibility API appropriate to menu user-interface elements.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
protected class JMenu.AccessibleJMenu extends JMenuItem.AccessibleJMenuItem with AccessibleSelection {

    @stub
    // Selects the ith menu in the menu.
    def addAccessibleSelection(i: Int): Unit = ???

    @stub
    // Clears the selection in the object, so that nothing in the
    // object is selected.
    def clearAccessibleSelection(): Unit = ???

    @stub
    // Returns the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible = ???

    @stub
    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int = ???

    @stub
    // Get the role of this object.
    def getAccessibleRole(): AccessibleRole = ???

    @stub
    // Get the AccessibleSelection associated with this object.
    def getAccessibleSelection(): AccessibleSelection = ???

    @stub
    // Returns the currently selected sub-menu if one is selected,
    // otherwise null (there can only be one selection, and it can
    // only be a sub-menu, as otherwise menu items don't remain
    // selected).
    def getAccessibleSelection(i: Int): Accessible = ???

    @stub
    // Returns 1 if a sub-menu is currently selected in this menu.
    def getAccessibleSelectionCount(): Int = ???

    @stub
    // Returns true if the current child of this object is selected
    // (that is, if this child is a popped-up submenu).
    def isAccessibleChildSelected(i: Int): Boolean = ???

    @stub
    // Removes the nth item from the selection.
    def removeAccessibleSelection(i: Int): Unit = ???
}
