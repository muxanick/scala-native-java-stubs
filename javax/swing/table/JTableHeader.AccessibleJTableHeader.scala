package javax.swing.table

import java.awt.{Component.AccessibleAWTComponent, Container.AccessibleAWTContainer, Point}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import javax.swing.JComponent.AccessibleJComponent
import scala.scalanative.annotation.stub

/** This class implements accessibility support for the
 *  JTableHeader class.  It provides an implementation of the
 *  Java Accessibility API appropriate to table header user-interface
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
protected class JTableHeader.AccessibleJTableHeader extends JComponent.AccessibleJComponent {

    /**  */
    @stub
    protected def AccessibleJTableHeader() = ???

    /** This class provides an implementation of the Java Accessibility
     *  API appropriate for JTableHeader entries.
     */
    @stub
    protected object AccessibleJTableHeaderEntry extends JTableHeader.AccessibleJTableHeader.AccessibleJTableHeaderEntry

    /** Returns the Accessible child, if one exists, contained at the local
     *  coordinate Point.
     */
    @stub
    def getAccessibleAt(p: Point): Accessible = ???

    /** Return the nth Accessible child of the object. */
    @stub
    def getAccessibleChild(i: Int): Accessible = ???

    /** Returns the number of accessible children in the object. */
    @stub
    def getAccessibleChildrenCount(): Int = ???

    /** Get the role of this object. */
    @stub
    def getAccessibleRole(): AccessibleRole = ???
}
