package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, LayoutManager}
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A lightweight container
 *  that uses a BoxLayout object as its layout manager.
 *  Box provides several class methods
 *  that are useful for containers using BoxLayout --
 *  even non-Box containers.
 * 
 *  
 *  The Box class can create several kinds
 *  of invisible components
 *  that affect layout:
 *  glue, struts, and rigid areas.
 *  If all the components your Box contains
 *  have a fixed size,
 *  you might want to use a glue component
 *  (returned by createGlue)
 *  to control the components' positions.
 *  If you need a fixed amount of space between two components,
 *  try using a strut
 *  (createHorizontalStrut or createVerticalStrut).
 *  If you need an invisible component
 *  that always takes up the same amount of space,
 *  get it by invoking createRigidArea.
 *  
 *  If you are implementing a BoxLayout you
 *  can find further information and examples in
 *  How to Use BoxLayout,
 *  a section in The Java Tutorial.
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
class Box extends JComponent with Accessible {

    /** Creates a Box that displays its components
     *  along the the specified axis.
     */
    @stub
    def this(axis: Int) = ???

    /** This class implements accessibility support for the
     *  Box class.
     */
    protected type AccessibleBox = Box_AccessibleBox

    /** Gets the AccessibleContext associated with this Box. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Paints this Box. */
    @stub
    protected def paintComponent(g: Graphics): Unit = ???

    /** Throws an AWTError, since a Box can use only a BoxLayout. */
    @stub
    def setLayout(l: LayoutManager): Unit = ???
}

object Box {
    /** An implementation of a lightweight component that participates in
     *  layout but has no view.
     */
    type Filler = Box_Filler

    /** Creates an invisible "glue" component
     *  that can be useful in a Box
     *  whose visible components have a maximum width
     *  (for a horizontal box)
     *  or height (for a vertical box).
     */
    @stub
    def createGlue(): Component = ???

    /** Creates a Box that displays its components
     *  from left to right.
     */
    @stub
    def createHorizontalBox(): Box = ???

    /** Creates a horizontal glue component. */
    @stub
    def createHorizontalGlue(): Component = ???

    /** Creates an invisible, fixed-width component. */
    @stub
    def createHorizontalStrut(width: Int): Component = ???

    /** Creates an invisible component that's always the specified size. */
    @stub
    def createRigidArea(d: Dimension): Component = ???

    /** Creates a Box that displays its components
     *  from top to bottom.
     */
    @stub
    def createVerticalBox(): Box = ???

    /** Creates a vertical glue component. */
    @stub
    def createVerticalGlue(): Component = ???

    /** Creates an invisible, fixed-height component. */
    @stub
    def createVerticalStrut(height: Int): Component = ???
}
