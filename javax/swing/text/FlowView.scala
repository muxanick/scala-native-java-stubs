package javax.swing.text

import java.awt.Shape
import java.lang.Object
import javax.swing.SizeRequirements
import javax.swing.event.DocumentEvent
import scala.scalanative.annotation.stub

/** A View that tries to flow it's children into some
 *  partially constrained space.  This can be used to
 *  build things like paragraphs, pages, etc.  The
 *  flow is made up of the following pieces of functionality.
 *  
 *  A logical set of child views, which as used as a
 *  layout pool from which a physical view is formed.
 *  A strategy for translating the logical view to
 *  a physical (flowed) view.
 *  Constraints for the strategy to work against.
 *  A physical structure, that represents the flow.
 *  The children of this view are where the pieces of
 *  of the logical views are placed to create the flow.
 *  
 */
abstract class FlowView extends BoxView {

    /** Constructs a FlowView for the given element. */
    @stub
    def this(elem: Element, axis: Int) = ???

    /** These are the views that represent the child elements
     *  of the element this view represents (The logical view
     *  to translate to a physical view).
     */
    protected val layoutPool: View

    /** Default constraint against which the flow is
     *  created against.
     */
    protected val layoutSpan: Int

    /** The behavior for keeping the flow updated. */
    protected val strategy: FlowView.FlowStrategy

    /** Calculate requirements along the minor axis. */
    protected def calculateMinorAxisRequirements(axis: Int, r: SizeRequirements): SizeRequirements

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    def changedUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit

    /** Create a View that should be used to hold a
     *  a rows worth of children in a flow.
     */
    protected def createRow(): View

    /** Fetches the axis along which views should be
     *  flowed.
     */
    def getFlowAxis(): Int

    /** Fetch the constraining span to flow against for
     *  the given child index.
     */
    def getFlowSpan(index: Int): Int

    /** Fetch the location along the flow axis that the
     *  flow span will start at.
     */
    def getFlowStart(index: Int): Int

    /** Fetches the child view index representing the given position in
     *  the model.
     */
    protected def getViewIndexAtPosition(pos: Int): Int

    /** Gives notification that something was inserted into the document
     *  in a location that this view is responsible for.
     */
    def insertUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit

    /** Lays out the children. */
    protected def layout(width: Int, height: Int): Unit

    /** Loads all of the children to initialize the view. */
    protected def loadChildren(f: ViewFactory): Unit

    /** Gives notification that something was removed from the document
     *  in a location that this view is responsible for.
     */
    def removeUpdate(changes: DocumentEvent, a: Shape, f: ViewFactory): Unit

    /** Sets the parent of the view. */
    def setParent(parent: View): Unit
}

object FlowView {
    /** Strategy for maintaining the physical form
     *  of the flow.
     */
    type FlowStrategy = FlowView_FlowStrategy
}
