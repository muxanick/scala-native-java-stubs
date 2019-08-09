package javax.swing.text

import java.awt.{FontMetrics, Graphics, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

// Extends the multi-line plain text view to be suitable
// for a single-line editor view.  If the view is
// allocated extra space, the field must adjust for it.
// If the hosting component is a JTextField, this view
// will manage the ranges of the associated BoundedRangeModel
// and will adjust the horizontal allocation to match the
// current visibility settings of the JTextField.
class FieldView extends PlainView {

    @stub
    // Adjusts the allocation given to the view
    // to be a suitable allocation for a text field.
    protected def adjustAllocation(a: Shape): Shape = ???

    @stub
    // Fetches the font metrics associated with the component hosting
    // this view.
    protected def getFontMetrics(): FontMetrics = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Determines the resizability of the view along the
    // given axis.
    def getResizeWeight(axis: Int): Int = ???

    @stub
    // Gives notification that something was inserted into the document
    // in a location that this view is responsible for.
    def insertUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Renders using the given rendering surface and area on that surface.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Gives notification that something was removed from the document
    // in a location that this view is responsible for.
    def removeUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???
}
