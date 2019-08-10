package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleRole}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JToolTip class.  It provides an implementation of the
 *  Java Accessibility API appropriate to tool tip user-interface elements.
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
protected class JToolTip_AccessibleJToolTip extends JComponent.AccessibleJComponent {

    /**  */
    @stub
    protected def AccessibleJToolTip() = ???

    /** Get the accessible description of this object. */
    @stub
    def getAccessibleDescription(): String = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
