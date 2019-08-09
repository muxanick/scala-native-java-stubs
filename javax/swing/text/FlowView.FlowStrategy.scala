package javax.swing.text

import java.awt.Rectangle
import java.lang.Object
import javax.swing.event.DocumentEvent

// Strategy for maintaining the physical form
// of the flow.  The default implementation is
// completely stateless, and recalculates the
// entire flow if the layout is invalid on the
// given FlowView.  Alternative strategies can
// be implemented by subclassing, and might
// perform incremental repair to the layout
// or alternative breaking behavior.
object FlowView.FlowStrategy extends Object {

    @stub
    // Adjusts the given row if possible to fit within the
    // layout span.
    protected def adjustRow(fv: FlowView, rowIndex: Int, desiredSpan: Int, x: Int): Unit = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(fv: FlowView, e: DocumentEvent, alloc: Rectangle): Unit = ???

    @stub
    // Creates a view that can be used to represent the current piece
    // of the flow.
    protected def createView(fv: FlowView, startOffset: Int, spanLeft: Int, rowIndex: Int): View = ???

    @stub
    // This method gives flow strategies access to the logical
    // view of the FlowView.
    protected def getLogicalView(fv: FlowView): View = ???

    @stub
    // Gives notification that something was inserted into the document
    // in a location that the given flow view is responsible for.
    def insertUpdate(fv: FlowView, e: DocumentEvent, alloc: Rectangle): Unit = ???

    @stub
    // Update the flow on the given FlowView.
    def layout(fv: FlowView): Unit = ???

    @stub
    // Creates a row of views that will fit within the
    // layout span of the row.
    protected def layoutRow(fv: FlowView, rowIndex: Int, pos: Int): Int = ???
}
