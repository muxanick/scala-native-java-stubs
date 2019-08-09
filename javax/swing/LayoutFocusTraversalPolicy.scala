package javax.swing

import java.awt.{Component, Container, FocusTraversalPolicy}
import java.io.Serializable
import java.lang.Object

// A SortingFocusTraversalPolicy which sorts Components based on their size,
// position, and orientation. Based on their size and position, Components are
// roughly categorized into rows and columns. For a Container with horizontal
// orientation, columns run left-to-right or right-to-left, and rows run top-
// to-bottom. For a Container with vertical orientation, columns run top-to-
// bottom and rows run left-to-right or right-to-left. See
// ComponentOrientation for more information. All columns in a
// row are fully traversed before proceeding to the next row.
class LayoutFocusTraversalPolicy extends SortingFocusTraversalPolicy with Serializable {

    @stub
    // Determines whether the specified Component
    // is an acceptable choice as the new focus owner.
    protected def accept(aComponent: Component): Boolean = ???

    @stub
    // Returns the Component that should receive the focus after aComponent.
    def getComponentAfter(aContainer: Container, aComponent: Component): Component = ???

    @stub
    // Returns the Component that should receive the focus before aComponent.
    def getComponentBefore(aContainer: Container, aComponent: Component): Component = ???

    @stub
    // Returns the first Component in the traversal cycle.
    def getFirstComponent(aContainer: Container): Component = ???
}
