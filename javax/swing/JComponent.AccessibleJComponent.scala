package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleExtendedComponent, AccessibleKeyBinding, AccessibleRole, AccessibleStateSet}
import javax.swing.border.Border

// Inner class of JComponent used to provide default support for
// accessibility.  This class is not meant to be used directly by
// application developers, but is instead meant only to be
// subclassed by component developers.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class JComponent.AccessibleJComponent extends Container.AccessibleAWTContainer with AccessibleExtendedComponent {

    // Fire PropertyChange listener, if one is registered,
    // when children added/removed.
    protected def JComponent.AccessibleJComponent.AccessibleContainerHandler: class

    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    // Returns the nth Accessible child of the object.
    def getAccessibleChild(i: Int): Accessible

    // Returns the number of accessible children in the object.
    def getAccessibleChildrenCount(): Int

    // Gets the accessible description of this object.
    def getAccessibleDescription(): String

    // Returns key bindings associated with this object
    def getAccessibleKeyBinding(): AccessibleKeyBinding

    // Gets the accessible name of this object.
    def getAccessibleName(): String

    // Gets the role of this object.
    def getAccessibleRole(): AccessibleRole

    // Gets the state of this object.
    def getAccessibleStateSet(): AccessibleStateSet

    // Recursively search through the border hierarchy (if it exists)
    // for a TitledBorder with a non-null title.
    protected def getBorderTitle(b: Border): String

    // Returns the titled border text
    def getTitledBorderText(): String

    // Returns the tool tip text
    def getToolTipText(): String
}
