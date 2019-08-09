package javax.swing

import java.awt.{Component, Container, Dimension, LayoutManager}
import java.io.Serializable
import java.lang.{Object, String}

// The default layout manager for JViewport.
// ViewportLayout defines
// a policy for layout that should be useful for most applications.
// The viewport makes its view the same size as the viewport,
// however it will not make the view smaller than its minimum size.
// As the viewport grows the view is kept bottom justified until
// the entire view is visible, subsequently the view is kept top
// justified.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class ViewportLayout extends Object with LayoutManager, with Serializable {

    @stub
    // Adds the specified component to the layout.
    def addLayoutComponent(name: String, c: Component): Unit = ???

    @stub
    // Called by the AWT when the specified container needs to be laid out.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Returns the minimum dimensions needed to layout the components
    // contained in the specified target container.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Returns the preferred dimensions for this layout given the components
    // in the specified target container.
    def preferredLayoutSize(parent: Container): Dimension = ???
}
