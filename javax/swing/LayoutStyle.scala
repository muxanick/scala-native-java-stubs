package javax.swing

import java.awt.Container
import java.lang.Object

// LayoutStyle provides information about how to position
// components.  This class is primarily useful for visual tools and
// layout managers.  Most developers will not need to use this class.
// 
// You typically don't set or create a
// LayoutStyle.  Instead use the static method
// getInstance to obtain the current instance.
abstract class LayoutStyle extends Object {

    // Returns the amount of space to place between the component and specified
    // edge of its parent.
    def getContainerGap(component: JComponent, position: Int, parent: Container): Int

    // Returns the amount of space to use between two components.
    def getPreferredGap(component1: JComponent, component2: JComponent, type: LayoutStyle.ComponentPlacement, position: Int, parent: Container): Int
}

object LayoutStyle {
    @stub
    // Returns the shared instance of LayoutStyle.
    def getInstance(): LayoutStyle = ???
}