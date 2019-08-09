package javax.swing

import java.awt.{Component, Container, Dimension}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

/** An implementation of a lightweight component that participates in
 *  layout but has no view.
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
object Box.Filler extends JComponent with Accessible {

    /** Change the size requests for this shape. */
    @stub
    def changeShape(min: Dimension, pref: Dimension, max: Dimension): Unit = ???

    /** Gets the AccessibleContext associated with this Box.Filler. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???
}
