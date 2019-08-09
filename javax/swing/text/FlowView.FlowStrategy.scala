package javax.swing.text

import java.awt.Rectangle
import java.lang.Object
import javax.swing.event.DocumentEvent
import scala.scalanative.annotation.stub

/** Strategy for maintaining the physical form
 *  of the flow.  The default implementation is
 *  completely stateless, and recalculates the
 *  entire flow if the layout is invalid on the
 *  given FlowView.  Alternative strategies can
 *  be implemented by subclassing, and might
 *  perform incremental repair to the layout
 *  or alternative breaking behavior.
 */
object FlowView.FlowStrategy extends Object {

    /**  */
    @stub
    def FlowStrategy() = ???

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
