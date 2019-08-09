package javax.swing.text

import java.awt.{Rectangle, Shape}
import java.lang.Object

// CompositeView is an abstract View
// implementation which manages one or more child views.
// (Note that CompositeView is intended
// for managing relatively small numbers of child views.)
// CompositeView is intended to be used as
// a starting point for View implementations,
// such as BoxView, that will contain child
// Views. Subclasses that wish to manage the
// collection of child Views should use the
// replace(int, int, javax.swing.text.View[]) method.  As View invokes
// replace during DocumentListener
// notification, you normally won't need to directly
// invoke replace.
//
// While CompositeView
// does not impose a layout policy on its child Views,
// it does allow for inseting the child Views
// it will contain.  The insets can be set by either
// setInsets(short, short, short, short) or setParagraphInsets(javax.swing.text.AttributeSet).
//
// In addition to the abstract methods of
// View,
// subclasses of CompositeView will need to
// override:
// 
// isBefore(int, int, java.awt.Rectangle) - Used to test if a given
//     View location is before the visual space
//     of the CompositeView.
// isAfter(int, int, java.awt.Rectangle) - Used to test if a given
//     View location is after the visual space
//     of the CompositeView.
// getViewAtPoint(int, int, java.awt.Rectangle) - Returns the view at
//     a given visual location.
// childAllocation(int, java.awt.Rectangle) - Returns the bounds of
//     a particular child View.
//     getChildAllocation will invoke
//     childAllocation after offseting
//     the bounds by the Insets of the
//     CompositeView.
// 
abstract class CompositeView extends View {

    // Returns the allocation for a given child.
    protected def childAllocation(index: Int, a: Rectangle): Unit

    // Determines in which direction the next view lays.
    protected def flipEastAndWestAtEnds(position: Int, bias: Position.Bias): Boolean

    // Gets the bottom inset.
    protected def getBottomInset(): Short

    // Fetches the allocation for the given child view to
    // render into.
    def getChildAllocation(index: Int, a: Shape): Shape

    // Translates the immutable allocation given to the view
    // to a mutable allocation that represents the interior
    // allocation (i.e.
    protected def getInsideAllocation(a: Shape): Rectangle

    // Gets the left inset.
    protected def getLeftInset(): Short

    // Returns the next visual position for the cursor, in either the
    // east or west direction.
    protected def getNextEastWestVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int

    // Returns the next visual position for the cursor, in either the
    // north or south direction.
    protected def getNextNorthSouthVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int

    // Provides a way to determine the next visually represented model
    // location that one might place a caret.
    def getNextVisualPositionFrom(pos: Int, b: Position.Bias, a: Shape, direction: Int, biasRet: Array[Position.Bias]): Int

    // Gets the right inset.
    protected def getRightInset(): Short

    // Gets the top inset.
    protected def getTopInset(): Short

    // Returns the n-th view in this container.
    def getView(n: Int): View

    // Fetches the child view at the given coordinates.
    protected def getViewAtPoint(x: Int, y: Int, alloc: Rectangle): View

    // Fetches the child view that represents the given position in
    // the model.
    protected def getViewAtPosition(pos: Int, a: Rectangle): View

    // Returns the number of child views of this view.
    def getViewCount(): Int

    // Returns the child view index representing the given
    // position in the model.
    def getViewIndex(pos: Int, b: Position.Bias): Int

    // Fetches the child view index representing the given position in
    // the model.
    protected def getViewIndexAtPosition(pos: Int): Int

    // Tests whether a point lies after the rectangle range.
    protected def isAfter(x: Int, y: Int, alloc: Rectangle): Boolean

    // Tests whether a point lies before the rectangle range.
    protected def isBefore(x: Int, y: Int, alloc: Rectangle): Boolean

    // Loads all of the children to initialize the view.
    protected def loadChildren(f: ViewFactory): Unit

    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(p0: Int, b0: Position.Bias, p1: Int, b1: Position.Bias, a: Shape): Shape

    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape

    // Replaces child views.
    def replace(offset: Int, length: Int, views: Array[View]): Unit

    // Sets the insets for the view.
    protected def setInsets(top: Short, left: Short, bottom: Short, right: Short): Unit

    // Sets the insets from the paragraph attributes specified in
    // the given attributes.
    protected def setParagraphInsets(attr: AttributeSet): Unit

    // Sets the parent of the view.
    def setParent(parent: View): Unit
}
