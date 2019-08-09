package java.awt

import java.lang.String

// Defines the interface for classes that know how to lay out
// Containers.
// 
// Swing's painting architecture assumes the children of a
// JComponent do not overlap.  If a
// JComponent's LayoutManager allows
// children to overlap, the JComponent must override
// isOptimizedDrawingEnabled to return false.
trait LayoutManager {

    @stub
    // If the layout manager uses a per-component string,
    // adds the component comp to the layout,
    // associating it
    // with the string specified by name.
    def addLayoutComponent(name: String, comp: Component): Unit = ???

    @stub
    // Lays out the specified container.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Calculates the minimum size dimensions for the specified
    // container, given the components it contains.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Calculates the preferred size dimensions for the specified
    // container, given the components it contains.
    def preferredLayoutSize(parent: Container): Dimension = ???
}
