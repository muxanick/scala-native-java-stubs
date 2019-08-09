package java.awt.dnd

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object

// this protected nested class implements autoscrolling
object protected DropTarget.DropTargetAutoScroller extends Object with ActionListener {

    @stub
    // cause autoscroll to occur
    def actionPerformed(e: ActionEvent): Unit = ???

    @stub
    // cause autoscrolling to stop
    protected def stop(): Unit = ???
}
