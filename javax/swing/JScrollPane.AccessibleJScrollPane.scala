package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.accessibility.{AccessibleContext, AccessibleRole}
import javax.swing.event.ChangeListener

/** This class implements accessibility support for the
 *  JScrollPane class.  It provides an implementation of the
 *  Java Accessibility API appropriate to scroll pane user-interface
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
protected class JScrollPane.AccessibleJScrollPane extends JComponent.AccessibleJComponent with ChangeListener with PropertyChangeListener {

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    def resetViewPort(): Unit = ???
}
