package java.awt

import java.lang.String
import scala.scalanative.annotation.stub

/** Defines the interface for classes that know how to lay out
 *  Containers.
 *  
 *  Swing's painting architecture assumes the children of a
 *  JComponent do not overlap.  If a
 *  JComponent's LayoutManager allows
 *  children to overlap, the JComponent must override
 *  isOptimizedDrawingEnabled to return false.
 */
trait LayoutManager {

    /** If the layout manager uses a per-component string,
     *  adds the component comp to the layout,
     *  associating it
     *  with the string specified by name.
     */
    @stub
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    /** Lays out the specified container. */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Calculates the minimum size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Calculates the preferred size dimensions for the specified
     *  container, given the components it contains.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Removes the specified component from the layout. */
    @stub
    def removeLayoutComponent(comp: Component): Unit = ???
}
