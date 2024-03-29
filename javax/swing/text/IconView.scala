package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Icon decorator that implements the view interface.  The
 *  entire element is used to represent the icon.  This acts
 *  as a gateway from the display-only View implementations to
 *  interactive lightweight icons (that is, it allows icons
 *  to be embedded into the View hierarchy.  The parent of the icon
 *  is the container that is handed out by the associated view
 *  factory.
 */
class IconView extends View {

    /** Creates a new icon view that represents an element. */
    @stub
    def this(elem: Element) = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Paints the icon. */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Provides a mapping from the view coordinate space to the logical
     *  coordinate space of the model.
     */
    @stub
    def viewToModel(x: Float, y: Float, a: Shape, bias: Array[Position.Bias]): Int = ???
}
