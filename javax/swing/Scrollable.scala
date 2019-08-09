package javax.swing

import java.awt.{Dimension, Rectangle}
import scala.scalanative.annotation.stub

/** An interface that provides information to a scrolling container
 *  like JScrollPane.  A complex component that's likely to be used
 *  as a viewing a JScrollPane viewport (or other scrolling container)
 *  should implement this interface.
 */
trait Scrollable {

    /** Returns the preferred size of the viewport for a view component. */
    @stub
    def getPreferredScrollableViewportSize(): Dimension = ???

    /** Components that display logical rows or columns should compute
     *  the scroll increment that will completely expose one block
     *  of rows or columns, depending on the value of orientation.
     */
    @stub
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Return true if a viewport should always force the height of this
     *  Scrollable to match the height of the viewport.
     */
    @stub
    def getScrollableTracksViewportHeight(): Boolean = ???

    /** Return true if a viewport should always force the width of this
     *  Scrollable to match the width of the viewport.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Components that display logical rows or columns should compute
     *  the scroll increment that will completely expose one new row
     *  or column, depending on the value of orientation.
     */
    @stub
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???
}
