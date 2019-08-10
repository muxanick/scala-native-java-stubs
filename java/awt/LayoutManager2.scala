package java.awt

import java.lang.Object
import scala.scalanative.annotation.stub

/** Defines an interface for classes that know how to layout Containers
 *  based on a layout constraints object.
 * 
 *  This interface extends the LayoutManager interface to deal with layouts
 *  explicitly in terms of constraint objects that specify how and where
 *  components should be added to the layout.
 *  
 *  This minimal extension to LayoutManager is intended for tool
 *  providers who wish to the creation of constraint-based layouts.
 *  It does not yet provide full, general support for custom
 *  constraint-based layout managers.
 */
trait LayoutManager2 extends LayoutManager {

    /** Adds the specified component to the layout, using the specified
     *  constraint object.
     */
    @stub
    def addLayoutComponent(comp: Component, constraints: Any): Unit = ???

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

    /** Calculates the maximum size dimensions for the specified container,
     *  given the components it contains.
     */
    @stub
    def maximumLayoutSize(target: Container): Dimension = ???
}
