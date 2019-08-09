package javax.swing.text.html

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, BoxView, CompositeView, Element, View, ViewFactory}
import scala.scalanative.annotation.stub

/** A view implementation to display a block (as a box)
 *  with CSS specifications.
 */
class BlockView extends BoxView {

    /** Creates a new view that represents an
     *  html box.
     */
    @stub
    def this(elem: Element, axis: Int) = ???

    /** Calculate the requirements of the block along the major
     *  axis (i.e.
     */
    @stub
    protected def calculateMajorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Calculate the requirements of the block along the minor
     *  axis (i.e.
     */
    @stub
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Gets the alignment. */
    @stub
    def getAlignment(axis: Int): Float = ???

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

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Gets the resize weight. */
    @stub
    def getResizeWeight(axis: Int): Int = ???

    /**  */
    @stub
    protected def getStyleSheet(): StyleSheet = ???

    /** Performs layout for the minor axis of the box (i.e. */
    @stub
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    /** Renders using the given rendering surface and area on that
     *  surface.
     */
    @stub
    def paint(g: Graphics, allocation: Shape): Unit = ???

    /** Establishes the parent view for this view. */
    @stub
    def setParent(parent: View): Unit = ???

    /** Update any cached values that come from attributes. */
    @stub
    protected def setPropertiesFromAttributes(): Unit = ???
}
