package java.awt

import java.lang.Object

// Defines an interface for classes that know how to layout Containers
// based on a layout constraints object.
//
// This interface extends the LayoutManager interface to deal with layouts
// explicitly in terms of constraint objects that specify how and where
// components should be added to the layout.
// 
// This minimal extension to LayoutManager is intended for tool
// providers who wish to the creation of constraint-based layouts.
// It does not yet provide full, general support for custom
// constraint-based layout managers.
trait LayoutManager2 extends LayoutManager {

    @stub
    // Adds the specified component to the layout, using the specified
    // constraint object.
    def addLayoutComponent(comp: Component, constraints: Object): Unit = ???

    @stub
    // Returns the alignment along the x axis.
    def getLayoutAlignmentX(target: Container): float = ???

    @stub
    // Returns the alignment along the y axis.
    def getLayoutAlignmentY(target: Container): float = ???

    @stub
    // Invalidates the layout, indicating that if the layout manager
    // has cached information it should be discarded.
    def invalidateLayout(target: Container): Unit = ???
}
