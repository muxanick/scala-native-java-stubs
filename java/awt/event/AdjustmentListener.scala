package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving adjustment events. */
trait AdjustmentListener extends EventListener {

    /** Invoked when the value of the adjustable has changed. */
    @stub
    def adjustmentValueChanged(e: AdjustmentEvent): Unit = ???
}
