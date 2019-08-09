package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleSelection, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JMenuBar class.  It provides an implementation of the
 *  Java Accessibility API appropriate to menu bar user-interface
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
protected class JMenuBar.AccessibleJMenuBar extends JComponent.AccessibleJComponent with AccessibleSelection {

    /**  */
    @stub
    protected def AccessibleJMenuBar() = ???

    /** Selects the nth menu in the menu bar, forcing it to
     *  pop up.
     */
    @stub
    def addAccessibleSelection(i: Int): Unit = ???

    /** Clears the selection in the object, so that nothing in the
     *  object is selected.
     */
    @stub
    def clearAccessibleSelection(): Unit = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the AccessibleSelection associated with this object. */
    @stub
    def getAccessibleSelection(): AccessibleSelection = ???

    /** Returns the currently selected menu if one is selected,
     *  otherwise null.
     */
    @stub
    def getAccessibleSelection(i: Int): Accessible = ???

    /** Returns 1 if a menu is currently selected in this menu bar. */
    @stub
    def getAccessibleSelectionCount(): Int = ???

    /** Get the accessible state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Returns true if the current child of this object is selected. */
    @stub
    def isAccessibleChildSelected(i: Int): Boolean = ???

    /** Removes the nth selected item in the object from the object's
     *  selection.
     */
    @stub
    def removeAccessibleSelection(i: Int): Unit = ???

    /** Normally causes every selected item in the object to be selected
     *  if the object supports multiple selections.
     */
    @stub
    def selectAllAccessibleSelection(): Unit = ???
}
