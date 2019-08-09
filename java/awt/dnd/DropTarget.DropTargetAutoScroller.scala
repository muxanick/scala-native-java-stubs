package java.awt.dnd

import java.awt.{Component, Point}
import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** this protected nested class implements autoscrolling */
object protected DropTarget.DropTargetAutoScroller extends Object with ActionListener {

    /** construct a DropTargetAutoScroller */
    @stub
    protected def DropTargetAutoScroller(c: Component, p: Point) = ???

    /** cause autoscroll to occur */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** cause autoscrolling to stop */
    @stub
    protected def stop(): Unit = ???

    /** cause autoscroll to occur */
    @stub
    protected def updateLocation(newLocn: Point): Unit = ???
}
