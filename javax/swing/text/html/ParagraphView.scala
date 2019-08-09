package javax.swing.text.html

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.text.{AttributeSet, BoxView, CompositeView, FlowView, ParagraphView, View}

/** Displays the a paragraph, and uses css attributes for its
 *  configuration.
 */
class ParagraphView extends ParagraphView {

    /** Calculate the needs for the paragraph along the minor axis. */
    @stub
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Fetches the attributes to use when rendering. */
    @stub
    def getAttributes(): AttributeSet = ???

    /** Determines the maximum span for this view along an
     *  axis.
     */
    @stub
    def getMaximumSpan(axis: Int): Float = ???

    /** Determines the minimum span for this view along an
     *  axis.
     */
    @stub
    def getMinimumSpan(axis: Int): Float = ???

    /** Determines the preferred span for this view. */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /**  */
    @stub
    protected def getStyleSheet(): StyleSheet = ???

    /** Indicates whether or not this view should be
     *  displayed.
     */
    @stub
    def isVisible(): Boolean = ???

    /** Renders using the given rendering surface and area on that
     *  surface.
     */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Establishes the parent view for this view. */
    @stub
    def setParent(parent: View): Unit = ???
}
