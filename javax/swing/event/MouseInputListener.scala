package javax.swing.event

import java.awt.event.{MouseListener, MouseMotionListener}

/** A listener implementing all the methods in both the MouseListener and
 *  MouseMotionListener interfaces.
 */
trait MouseInputListener extends MouseListener with MouseMotionListener {
}
