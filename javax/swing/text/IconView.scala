package javax.swing.text

import java.awt.{Graphics, Shape}
import java.lang.Object

// Icon decorator that implements the view interface.  The
// entire element is used to represent the icon.  This acts
// as a gateway from the display-only View implementations to
// interactive lightweight icons (that is, it allows icons
// to be embedded into the View hierarchy.  The parent of the icon
// is the container that is handed out by the associated view
// factory.
class IconView extends View {

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Paints the icon.
    def paint(g: Graphics, a: Shape): Unit = ???
}
