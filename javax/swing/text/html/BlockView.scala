package javax.swing.text.html

import java.awt.{Graphics, Shape}
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, BoxView, CompositeView, View, ViewFactory}

// A view implementation to display a block (as a box)
// with CSS specifications.
class BlockView extends BoxView {

    @stub
    // Calculate the requirements of the block along the major
    // axis (i.e.
    protected def calculateMajorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Calculate the requirements of the block along the minor
    // axis (i.e.
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Gets the alignment.
    def getAlignment(axis: Int): float = ???

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
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Gets the resize weight.
    def getResizeWeight(axis: Int): Int = ???

    @stub
    // 
    protected def getStyleSheet(): StyleSheet = ???

    @stub
    // Performs layout for the minor axis of the box (i.e.
    protected def layoutMinorAxis(targetSpan: Int, axis: Int, offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Renders using the given rendering surface and area on that
    // surface.
    def paint(g: Graphics, allocation: Shape): Unit = ???

    @stub
    // Establishes the parent view for this view.
    def setParent(parent: View): Unit = ???
}
