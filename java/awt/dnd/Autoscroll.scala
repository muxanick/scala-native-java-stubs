package java.awt.dnd

import java.awt.Point

/** During DnD operations it is possible that a user may wish to drop the
 *  subject of the operation on a region of a scrollable GUI control that is
 *  not currently visible to the user.
 *  
 *  In such situations it is desirable that the GUI control detect this
 *  and institute a scroll operation in order to make obscured region(s)
 *  visible to the user. This feature is known as autoscrolling.
 *  
 *  If a GUI control is both an active DropTarget
 *  and is also scrollable, it
 *  can receive notifications of autoscrolling gestures by the user from
 *  the DnD system by implementing this interface.
 *  
 *  An autoscrolling gesture is initiated by the user by keeping the drag
 *  cursor motionless with a border region of the Component,
 *  referred to as
 *  the "autoscrolling region", for a predefined period of time, this will
 *  result in repeated scroll requests to the Component
 *  until the drag Cursor resumes its motion.
 */
trait Autoscroll {

    /** notify the Component to autoscroll */
    @stub
    def autoscroll(cursorLocn: Point): Unit = ???
}
