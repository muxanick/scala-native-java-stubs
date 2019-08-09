package javax.swing

import java.lang.{Enum, Object, String}

/** Values for the state bound property. */
class SwingWorker.StateValue private (name: String, ordinal: Int) extends Enum[SwingWorker.StateValue](name, ordinal) {
}

object SwingWorker.StateValue {
    /** SwingWorker is DONE
     *  after doInBackground method
     *  is finished.
     */
    final val DONE = new SwingWorker.StateValue(DONE, 0)

    /** Initial SwingWorker state. */
    final val PENDING = new SwingWorker.StateValue(PENDING, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): SwingWorker.StateValue = ???
}
