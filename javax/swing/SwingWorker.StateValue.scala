package javax.swing

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Values for the state bound property. */
class SwingWorker_StateValue private (name: String, ordinal: Int) extends Enum[SwingWorker.StateValue](name, ordinal) {
}

object SwingWorker_StateValue {
    /** SwingWorker is DONE
     *  after doInBackground method
     *  is finished.
     */
    final val DONE = new SwingWorker.StateValue(DONE, 0)

    /** Initial SwingWorker state. */
    final val PENDING = new SwingWorker.StateValue(PENDING, 1)

    /** SwingWorker is STARTED
     *  before invoking doInBackground.
     */
    final val STARTED = new SwingWorker.StateValue(STARTED, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SwingWorker.StateValue = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[SwingWorker.StateValue] = ???
}
