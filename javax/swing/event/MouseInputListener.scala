package javax.swing.event

import java.awt.event.{MouseListener, MouseMotionListener}
import scala.scalanative.annotation.stub

/** A listener implementing all the methods in both the MouseListener and
 *  MouseMotionListener interfaces.
 */
trait MouseInputListener extends MouseListener with MouseMotionListener {
}
