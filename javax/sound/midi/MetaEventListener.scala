package javax.sound.midi

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The MetaEventListener interface should be implemented
 *  by classes whose instances need to be notified when a Sequencer
 *  has processed a MetaMessage.
 *  To register a MetaEventListener object to receive such
 *  notifications, pass it as the argument to the
 *  addMetaEventListener
 *  method of Sequencer.
 */
trait MetaEventListener extends EventListener {

    /** Invoked when a Sequencer has encountered and processed
     *  a MetaMessage in the Sequence it is processing.
     */
    @stub
    def meta(meta: MetaMessage): Unit = ???
}
