package javax.swing.text

import java.awt.{Rectangle, Shape}
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
     *  of the flow.  The default implementation is
     *  completely stateless, and recalculates the
     *  entire flow if the layout is invalid on the
     *  given FlowView.  Alternative strategies can
     *  be implemented by subclassing, and might
     *  perform incremental repair to the layout
     *  or alternative breaking behavior.
     */
    object FlowStrategy extends Object {

        /**  */
        @stub
        def apply() = ???

        /** Adjusts the given row if possible to fit within the
         *  layout span.
         */
        @stub
        protected def adjustRow(fv: FlowView, rowIndex: Int, desiredSpan: Int, x: Int): Unit = ???

        /** Gives notification from the document that attributes were changed
         *  in a location that this view is responsible for.
         */
        @stub
        def changedUpdate(fv: FlowView, e: DocumentEvent, alloc: Rectangle): Unit = ???

        /** Creates a view that can be used to represent the current piece
         *  of the flow.
         */
        @stub
        protected def createView(fv: FlowView, startOffset: Int, spanLeft: Int, rowIndex: Int): View = ???

        /** This method gives flow strategies access to the logical
         *  view of the FlowView.
         */
        @stub
        protected def getLogicalView(fv: FlowView): View = ???

        /** Gives notification that something was inserted into the document
         *  in a location that the given flow view is responsible for.
         */
        @stub
        def insertUpdate(fv: FlowView, e: DocumentEvent, alloc: Rectangle): Unit = ???

        /** Update the flow on the given FlowView. */
        @stub
        def layout(fv: FlowView): Unit = ???

        /** Creates a row of views that will fit within the
         *  layout span of the row.
         */
        @stub
        protected def layoutRow(fv: FlowView, rowIndex: Int, pos: Int): Int = ???

        /** Gives notification that something was removed from the document
         *  in a location that the given flow view is responsible for.
         */
        @stub
        def removeUpdate(fv: FlowView, e: DocumentEvent, alloc: Rectangle): Unit = ???
    }

}
