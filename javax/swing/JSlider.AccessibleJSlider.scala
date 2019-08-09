package javax.swing

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer}
import java.lang.{Number, Object}
import javax.accessibility.{AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleValue}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JSlider class.  It provides an implementation of the
 *  Java Accessibility API appropriate to slider user-interface elements.
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
protected class JSlider.AccessibleJSlider extends JComponent.AccessibleJComponent with AccessibleValue {

    /**  */
    @stub
    protected def AccessibleJSlider() = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Get the state set of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Get the AccessibleValue associated with this object. */
    @stub
    def getAccessibleValue(): AccessibleValue = ???

    /** Get the accessible value of this object. */
    @stub
    def getCurrentAccessibleValue(): Number = ???

    /** Get the maximum accessible value of this object. */
    @stub
    def getMaximumAccessibleValue(): Number = ???

    /** Get the minimum accessible value of this object. */
    @stub
    def getMinimumAccessibleValue(): Number = ???

    /** Set the value of this object as a Number. */
    @stub
    def setCurrentAccessibleValue(n: Number): Boolean = ???
}
