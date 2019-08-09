package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Implements a View suitable for use in JPasswordField
 *  UI implementations.  This is basically a field ui that
 *  renders its contents as the echo character specified
 *  in the associated component (if it can narrow the
 *  component to a JPasswordField).
 */
class PasswordView extends FieldView {

    /** Constructs a new view wrapped on an element. */
    @stub
    def this(elem: Element) = ???

    /** Renders the echo character, or whatever graphic should be used
     *  to display the password characters.
     */
    @stub
    protected def drawEchoCharacter(g: Graphics, x: Int, y: Int, c: Char): Int = ???

    /** Renders the given range in the model as selected text. */
    @stub
    protected def drawSelectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    /** Renders the given range in the model as normal unselected
     *  text.
     */
    @stub
    protected def drawUnselectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

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

    /** Provides a mapping from the view coordinate space to the logical
     *  coordinate space of the model.
     */
    @stub
    def viewToModel(fx: Float, fy: Float, a: Shape, bias: Array[Position.Bias]): Int = ???
}
