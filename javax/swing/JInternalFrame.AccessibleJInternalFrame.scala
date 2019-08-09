package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Number, Object, String}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleValue}

/** This class implements accessibility support for the
 *  JInternalFrame class.  It provides an implementation of the
 *  Java Accessibility API appropriate to internal frame user-interface
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
protected class JInternalFrame.AccessibleJInternalFrame extends JComponent.AccessibleJComponent with AccessibleValue {

    /** Get the accessible name of this object. */
    @stub
    def getAccessibleName(): String = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the AccessibleValue associated with this object. */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

    /** Get the value of this object as a Number. */
    @stub
    def getCurrentAccessibleValue(): Number = ???

    /** Get the maximum value of this object as a Number. */
    @stub
    def getMaximumAccessibleValue(): Number = ???

    /** Get the minimum value of this object as a Number. */
    @stub
    def getMinimumAccessibleValue(): Number = ???
}
