package java.awt.dnd

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object

/** this protected nested class implements autoscrolling */
object protected DropTarget.DropTargetAutoScroller extends Object with ActionListener {

    /** cause autoscroll to occur */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** cause autoscrolling to stop */
    @stub
    protected def stop(): Unit = ???
}
