package javax.swing.text.html

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.text.{AttributeSet, BoxView, CompositeView, FlowView, ParagraphView, View}

// Displays the a paragraph, and uses css attributes for its
// configuration.
class ParagraphView extends ParagraphView {

    @stub
    // Calculate the needs for the paragraph along the minor axis.
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Fetches the attributes to use when rendering.
    def getAttributes(): AttributeSet = ???

    @stub
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // Determines the minimum span for this view along an
    // axis.
    def getMinimumSpan(axis: Int): float = ???

    @stub
    // Determines the preferred span for this view.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // 
    protected def getStyleSheet(): StyleSheet = ???

    @stub
    // Indicates whether or not this view should be
    // displayed.
    def isVisible(): Boolean = ???

    @stub
    // Renders using the given rendering surface and area on that
    // surface.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Establishes the parent view for this view.
    def setParent(parent: View): Unit = ???
}
