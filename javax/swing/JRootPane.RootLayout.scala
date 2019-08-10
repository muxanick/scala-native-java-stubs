package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager2}
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A custom layout manager that is responsible for the layout of
 *  layeredPane, glassPane, and menuBar.
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
protected class JRootPane_RootLayout extends Object with LayoutManager2 with Serializable {

    /**  */
    @stub
    protected def RootLayout() = ???

    /** Adds the specified component to the layout, using the specified
     *  constraint object.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Any): Unit = ???

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Returns the alignment along the x axis. */
    @stub
    def getLayoutAlignmentX(target: Container): Float = ???

    /** Returns the alignment along the y axis. */
    @stub
    def getLayoutAlignmentY(target: Container): Float = ???

    /** Invalidates the layout, indicating that if the layout manager
     *  has cached information it should be discarded.
     */
    @stub
    def invalidateLayout(target: Container): Unit = ???

    /** Instructs the layout manager to perform the layout for the specified
     *  container.
     */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Returns the maximum amount of space the layout can use. */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???

    /** Returns the minimum amount of space the layout needs. */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Returns the amount of space the layout would like to have. */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???
}
