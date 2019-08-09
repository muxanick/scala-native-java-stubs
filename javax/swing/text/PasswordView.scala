package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object

// Implements a View suitable for use in JPasswordField
// UI implementations.  This is basically a field ui that
// renders its contents as the echo character specified
// in the associated component (if it can narrow the
// component to a JPasswordField).
class PasswordView extends FieldView {

    @stub
    // Renders the echo character, or whatever graphic should be used
    // to display the password characters.
    protected def drawEchoCharacter(g: Graphics, x: Int, y: Int, c: Char): Int = ???

    @stub
    // Renders the given range in the model as selected text.
    protected def drawSelectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    @stub
    // Renders the given range in the model as normal unselected
    // text.
    protected def drawUnselectedText(g: Graphics, x: Int, y: Int, p0: Int, p1: Int): Int = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???
}
