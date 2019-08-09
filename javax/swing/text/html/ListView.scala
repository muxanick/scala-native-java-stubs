package javax.swing.text.html

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.text.{BoxView, CompositeView, View}

/** A view implementation to display an html list */
class ListView extends BlockView {

    /** Calculates the desired shape of the list. */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Renders using the given rendering surface and area on that
     *  surface.
     */
    @stub
    def paint(g: Graphics, allocation: Shape): Unit = ???

    /** Paints one of the children; called by paint(). */
    @stub
    protected def paintChild(g: Graphics, alloc: Rectangle, index: Int): Unit = ???
}
