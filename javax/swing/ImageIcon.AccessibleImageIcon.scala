package javax.swing

import java.io.Serializable
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleContext, AccessibleIcon, AccessibleRole, AccessibleStateSet}
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  ImageIcon class.  It provides an implementation of the
 *  Java Accessibility API appropriate to image icon user-interface
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
protected class ImageIcon.AccessibleImageIcon extends AccessibleContext with AccessibleIcon with Serializable {

    /**  */
    @stub
    protected def AccessibleImageIcon() = ???

    /** Returns the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Gets the description of the icon. */
    @stub
    def getAccessibleIconDescription(): String = ???

    /** Gets the height of the icon. */
    @stub
    def getAccessibleIconHeight(): Int = ???

    /** Gets the width of the icon. */
    @stub
    def getAccessibleIconWidth(): Int = ???

    /** Gets the index of this object in its accessible parent. */
    @stub
    def getAccessibleIndexInParent(): Int = ???

    /** Gets the Accessible parent of this object. */
    @stub
    def getAccessibleParent(): Accessible = ???

    /** Gets the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???

    /** Gets the state of this object. */
    @stub
    def getAccessibleStateSet(): AccessibleStateSet = ???

    /** Returns the locale of this object. */
    @stub
    def getLocale(): Locale = ???

    /** Sets the description of the icon. */
    @stub
    def setAccessibleIconDescription(description: String): Unit = ???
}
