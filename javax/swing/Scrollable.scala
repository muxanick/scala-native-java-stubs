package javax.swing

import java.awt.{Dimension, Rectangle}

// An interface that provides information to a scrolling container
// like JScrollPane.  A complex component that's likely to be used
// as a viewing a JScrollPane viewport (or other scrolling container)
// should implement this interface.
trait Scrollable {

    @stub
    // Returns the preferred size of the viewport for a view component.
    def getPreferredScrollableViewportSize(): Dimension = ???

    @stub
    // Components that display logical rows or columns should compute
    // the scroll increment that will completely expose one block
    // of rows or columns, depending on the value of orientation.
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Return true if a viewport should always force the height of this
    // Scrollable to match the height of the viewport.
    def getScrollableTracksViewportHeight(): Boolean = ???

    @stub
    // Return true if a viewport should always force the width of this
    // Scrollable to match the width of the viewport.
    def getScrollableTracksViewportWidth(): Boolean = ???
}
