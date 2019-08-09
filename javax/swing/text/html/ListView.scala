package javax.swing.text.html

import java.awt.{Graphics, Rectangle, Shape}
import java.lang.Object
import javax.swing.text.{BoxView, CompositeView, Element, View}
import scala.scalanative.annotation.stub

/** A view implementation to display an html list */
class ListView extends BlockView {

    /** Creates a new view that represents a list element. */
    @stub
    def this(elem: Element) = ???

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

    /** Update any cached values that come from attributes. */
    @stub
    protected def setPropertiesFromAttributes(): Unit = ???
}
