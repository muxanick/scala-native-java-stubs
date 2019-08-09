package javax.sound.sampled

import java.util.EventListener
import scala.scalanative.annotation.stub

/** Instances of classes that implement the LineListener interface can register to
 *  receive events when a line's status changes.
 */
trait LineListener extends EventListener {

    /** Informs the listener that a line's state has changed. */
    @stub
    def update(event: LineEvent): Unit = ???
}
