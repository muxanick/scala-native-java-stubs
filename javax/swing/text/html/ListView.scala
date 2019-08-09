package javax.swing.text.html

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.text.{BoxView, CompositeView, View}

// A view implementation to display an html list
class ListView extends BlockView {

    @stub
    // Calculates the desired shape of the list.
    def getAlignment(axis: Int): float = ???

    @stub
    // Renders using the given rendering surface and area on that
    // surface.
    def paint(g: Graphics, allocation: Shape): Unit = ???

    @stub
    // Paints one of the children; called by paint().
    protected def paintChild(g: Graphics, alloc: Rectangle, index: Int): Unit = ???
}
